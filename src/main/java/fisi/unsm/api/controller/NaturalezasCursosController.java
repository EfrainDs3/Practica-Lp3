package fisi.unsm.api.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fisi.unsm.api.entity.Cursos;
import fisi.unsm.api.service.ICursosService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/restful")
public class NaturalezasCursosController {
    @Autowired
    private ICursosService serviceCursos;

    @GetMapping("/cursos")
    public List<Cursos> buscartodos() {
        return serviceCursos.buscarTodos();
    }
    @PostMapping("/cursos")
    public Cursos guardar(@RequestBody Cursos curso) {
        serviceCursos.guardar(curso);
        return curso;
    }
    @PutMapping("/cursos")
    public Cursos modificar(@RequestBody Cursos curso) {
        serviceCursos.modificar(curso);
        return curso;
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
