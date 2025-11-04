package fisi.unsm.api.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fisi.unsm.api.entity.CategoriasCurso;
import fisi.unsm.api.service.ICategoriasCursoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/restful")
public class CategoriasCursoController {
    @Autowired
    private ICategoriasCursoService serviceCategoriasCurso;

    @GetMapping("/categoriascurso")
    public List<CategoriasCurso> buscartodos() {
        return serviceCategoriasCurso.buscarTodos();
    }
    @PostMapping("/categoriascurso")
    public CategoriasCurso guardar(@RequestBody CategoriasCurso curso) {
        serviceCategoriasCurso.guardar(curso);
        return curso;
    }
    @PutMapping("/categoriascurso")
    public CategoriasCurso modificar(@RequestBody CategoriasCurso curso) {
        serviceCategoriasCurso.modificar(curso);
        return curso;
    }
    @GetMapping("/categoriascurso/{id}")
    public Optional<CategoriasCurso> buscarId(@PathVariable("id") Integer id) {
        return serviceCategoriasCurso.buscarId(id);
    }
    @DeleteMapping("/categoriascurso/{id}")
    public String eliminar(@PathVariable Integer id){
        serviceCategoriasCurso.eliminar(id);
        return "Categoría de curso eliminado";
    }   
}

