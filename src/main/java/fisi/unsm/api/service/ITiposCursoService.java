package fisi.unsm.api.service;

import java.util.List;
import java.util.Optional;

import fisi.unsm.api.entity.TiposCurso;

public interface ITiposCursoService {
    // CRUD para el API de TiposCurso
    
    List<TiposCurso> buscarTodos();
    // Método para listar todos los elementos de TiposCurso

    void guardar(TiposCurso curso);
    // Método para guardar TiposCurso

    void modificar(TiposCurso curso);
    // Método para modificar TiposCurso

    Optional<TiposCurso> buscarId(Integer id);
    // Método para listar un curso 

    void eliminar(Integer id);
    // Método para eliminar un curso
}