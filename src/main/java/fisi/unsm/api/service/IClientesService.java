package fisi.unsm.api.service;

import java.util.List;
import java.util.Optional;

import fisi.unsm.api.entity.Clientes;

public interface IClientesService {
    // CRUD para el API de Clientes
    
    List<Clientes> buscarTodos();
    // Método para listar todos los elementos de Clientes

    void guardar(Clientes cliente);
    // Método para guardar Clientes

    void modificar(Clientes cliente);
    // Método para modificar Clientes

    Optional<Clientes> buscarId(Integer id);
    // Método para listar un cliente 

    void eliminar(Integer id);
    // Método para eliminar un cliente
}