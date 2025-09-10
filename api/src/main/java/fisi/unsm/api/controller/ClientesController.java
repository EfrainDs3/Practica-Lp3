package fisi.unsm.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fisi.unsm.api.entity.Clientes;
import fisi.unsm.api.service.IClientesService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/restful")
public class ClientesController {
    @Autowired
    private IClientesService clienteService;

    @GetMapping("/clientes")
    public List<Clientes> buscarTodos() {
        return clienteService.buscarTodos();
    }

   @PostMapping("/clientes")
    public Clientes guardar(@RequestBody Clientes cliente) {
        clienteService.guardar(cliente);
        return cliente;
    }

    @PutMapping("/clientes")
    public Clientes modificar(@RequestBody Clientes cliente) {
        clienteService.modificar(cliente);
        return cliente;
    }

    @GetMapping("/clientes/{id}")
    public Optional<Clientes> buscarPorId(@PathVariable("id") Integer id) {
        return clienteService.buscarPorId(id);
    }

    @DeleteMapping("/clientes/{id}")
    public String eliminar(@PathVariable Integer id) {
        clienteService.eliminar(id);
        return "Registro eliminado";
    }
}