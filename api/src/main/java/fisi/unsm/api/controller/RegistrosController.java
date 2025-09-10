package fisi.unsm.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fisi.unsm.api.entity.Registros;
import fisi.unsm.api.service.IRegistroService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/restful")
public class RegistrosController {
    @Autowired
    private IRegistroService serviceRegistros;

    @GetMapping("/registros")
    public List<Registros> buscartodos() {
        return serviceRegistros.buscarTodos();
    }

   @PostMapping("/registros")
    public Registros guardar(@RequestBody Registros registro) {
        serviceRegistros.guardar(registro);
        return registro;
    }

    @PutMapping("/registros")
    public Registros modificar(@RequestBody Registros registro) {
        serviceRegistros.modificar(registro);
        return registro;
    }

    @GetMapping("/registros/{id}")
    public Optional<Registros> buscarPorId(@PathVariable("id") Integer id) {
        return serviceRegistros.buscarPorId(id);
    }

    @DeleteMapping("/registros/{id}")
    public String eliminar(@PathVariable Integer id) {
        serviceRegistros.eliminar(id);
        return "Registro eliminado";
    }
}