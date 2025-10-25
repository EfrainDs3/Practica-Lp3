package fisi.unsm.api.service;

import java.util.List;
import java.util.Optional;

import fisi.unsm.api.entity.TiposCursos;

public interface ITiposCursosService {
    // CRUD para el API de Clientes
    
    List<TiposCursos> buscarTodos();
    // Método para listar todos los elementos de Clientes

    void guardar(TiposCursos tipoCurso);
    // Método para guardar Clientes

    void modificar(TiposCursos tipoCurso);
    // Método para modificar Clientes

    Optional<TiposCursos> buscarId(Integer id);
    // Método para listar un cliente 

    void eliminar(Integer id);
    // Método para eliminar un cliente
}