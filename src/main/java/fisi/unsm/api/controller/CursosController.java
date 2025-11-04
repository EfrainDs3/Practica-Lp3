package fisi.unsm.api.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fisi.unsm.api.entity.CategoriasCurso;
import fisi.unsm.api.entity.Cursos;
import fisi.unsm.api.entity.CursosDTO;
import fisi.unsm.api.entity.NaturalezasCurso;
import fisi.unsm.api.entity.TiposCurso;
import fisi.unsm.api.repository.CategoriasCursoRepository;
import fisi.unsm.api.repository.NaturalezasCursoRepository;
import fisi.unsm.api.repository.TiposCursoRepository;
import fisi.unsm.api.service.ICursosService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/restful")
public class CursosController {
    @Autowired
    private ICursosService serviceCursos;

    @Autowired
    private TiposCursoRepository repoTiposCurso;

    @Autowired
    private CategoriasCursoRepository repoCategoriasCurso;

    @Autowired
    private NaturalezasCursoRepository repoNaturalezasCurso;

    @GetMapping("/cursos")
    public List<Cursos> buscartodos() {
        return serviceCursos.buscarTodos();
    }
    @PostMapping("/cursos")
    public ResponseEntity<?> guardar(@RequestBody CursosDTO dto) {
        Cursos curso = new Cursos();
        curso.setDescripcion(dto.getDescripcion());
        TiposCurso tipo = repoTiposCurso.findById(dto.getId_tipo())
                    .orElse(null);
        CategoriasCurso categoria = repoCategoriasCurso
                    .findById(dto.getId_categoria())
                    .orElse(null);
        NaturalezasCurso naturaleza = repoNaturalezasCurso
                    .findById(dto.getId_naturaleza())
                    .orElse(null);
        
        curso.setId_tipo(tipo);
        curso.setId_categoria(categoria);
        curso.setId_naturaleza(naturaleza);

        return ResponseEntity.ok(serviceCursos.guardar(curso));
        
    }
    @PutMapping("/cursos")
    public ResponseEntity<?> modificar(@RequestBody CursosDTO dto) {
        if(dto.getIdcurso() == null){
            return ResponseEntity.badRequest()
                        .body("Id curso es necesario para modificar");
        }
        Cursos curso = new Cursos();
        curso.setIdcurso(dto.getIdcurso());
        curso.setDescripcion(dto.getDescripcion());

        curso.setId_tipo(
            new TiposCurso(dto.getId_tipo()));
        curso.setId_categoria(
            new CategoriasCurso(dto.getId_categoria()));
        curso.setId_naturaleza(
            new NaturalezasCurso(dto.getId_naturaleza()));
        
        return ResponseEntity.ok(serviceCursos.modificar(curso));

    }
    @GetMapping("/cursos/{id}")
    public Optional<Cursos> buscarId(@PathVariable("id") Integer id) {
        return serviceCursos.buscarId(id);
    }
    @DeleteMapping("/cursos/{id}")
    public String eliminar(@PathVariable Integer id){
        serviceCursos.eliminar(id);
        return "Curso eliminado";
    }   
}

