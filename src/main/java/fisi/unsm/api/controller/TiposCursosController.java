package fisi.unsm.api.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fisi.unsm.api.entity.TiposCursos;
import fisi.unsm.api.service.ITiposCursosService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/restful")
public class TiposCursosController {
    @Autowired
    private ITiposCursosService serviceTiposCursos;

    @GetMapping("/tiposcursos")
    public List<TiposCursos> buscartodos() {
        return serviceTiposCursos.buscarTodos();
    }
    @PostMapping("/tiposcursos")
    public TiposCursos guardar(@RequestBody TiposCursos tiposCursos) {
        serviceTiposCursos.guardar(tiposCursos);
        return tiposCursos;
    }
    @PutMapping("/tiposcursos")
    public TiposCursos modificar(@RequestBody TiposCursos tiposCursos) {
        serviceTiposCursos.modificar(tiposCursos);
        return tiposCursos;
    }
    @GetMapping("/tiposcursos/{id}")
    public Optional<TiposCursos> buscarId(@PathVariable("id") Integer id) {
        return serviceTiposCursos.buscarId(id);
    }
    @DeleteMapping("/tiposcursos/{id}")
    public String eliminar(@PathVariable Integer id){
        serviceTiposCursos.eliminar(id);
        return "Tipo de curso eliminado";
    }   
}
