package fisi.unsm.api.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fisi.unsm.api.entity.NaturalezasCurso;
import fisi.unsm.api.service.INaturalezasCursoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/restful")
public class NaturalezasCursoController {
    @Autowired
    private INaturalezasCursoService serviceNaturalezasCurso;

    @GetMapping("/naturalezascurso")
    public List<NaturalezasCurso> buscartodos() {
        return serviceNaturalezasCurso.buscarTodos();
    }
    @PostMapping("/naturalezascurso")
    public NaturalezasCurso guardar(@RequestBody NaturalezasCurso curso) {
        serviceNaturalezasCurso.guardar(curso);
        return curso;
    }
    @PutMapping("/naturalezascurso")
    public NaturalezasCurso modificar(@RequestBody NaturalezasCurso curso) {
        serviceNaturalezasCurso.modificar(curso);
        return curso;
    }
    @GetMapping("/naturalezascurso/{id}")
    public Optional<NaturalezasCurso> buscarId(@PathVariable("id") Integer id) {
        return serviceNaturalezasCurso.buscarId(id);
    }
    @DeleteMapping("/naturalezascurso/{id}")
    public String eliminar(@PathVariable Integer id){
        serviceNaturalezasCurso.eliminar(id);
        return "Naturaleza de curso eliminado";
    }   
}

