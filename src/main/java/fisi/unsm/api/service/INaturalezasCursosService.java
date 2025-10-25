package fisi.unsm.api.service;

import java.util.List;
import java.util.Optional;

import fisi.unsm.api.entity.NaturalezasCursos;

public interface INaturalezasCursosService {
    // CRUD para el API de Clientes
    
    List<NaturalezasCursos> buscarTodos();
    // Método para listar todos los elementos de Clientes

    void guardar(NaturalezasCursos naturalezaCurso);
    // Método para guardar Clientes

    void modificar(NaturalezasCursos naturalezaCurso);
    // Método para modificar Clientes

    Optional<NaturalezasCursos> buscarId(Integer id);
    // Método para listar un cliente 

    void eliminar(Integer id);
    // Método para eliminar un cliente
}




