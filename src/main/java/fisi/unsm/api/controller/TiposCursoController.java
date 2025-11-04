package fisi.unsm.api.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fisi.unsm.api.entity.TiposCurso;
import fisi.unsm.api.service.ITiposCursoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/restful")
public class TiposCursoController {
    @Autowired
    private ITiposCursoService serviceTiposCurso;

    @GetMapping("/tiposcurso")
    public List<TiposCurso> buscartodos() {
        return serviceTiposCurso.buscarTodos();
    }
    @PostMapping("/tiposcurso")
    public TiposCurso guardar(@RequestBody TiposCurso curso) {
        serviceTiposCurso.guardar(curso);
        return curso;
    }
    @PutMapping("/tiposcurso")
    public TiposCurso modificar(@RequestBody TiposCurso curso) {
        serviceTiposCurso.modificar(curso);
        return curso;
    }
    @GetMapping("/tiposcurso/{id}")
    public Optional<TiposCurso> buscarId(@PathVariable("id") Integer id) {
        return serviceTiposCurso.buscarId(id);
    }
    @DeleteMapping("/tiposcurso/{id}")
    public String eliminar(@PathVariable Integer id){
        serviceTiposCurso.eliminar(id);
        return "Tipo de curso eliminado";
    }   
}

