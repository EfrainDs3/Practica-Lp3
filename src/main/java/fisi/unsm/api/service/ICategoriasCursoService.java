package fisi.unsm.api.service;

import java.util.List;
import java.util.Optional;

import fisi.unsm.api.entity.CategoriasCurso;

public interface ICategoriasCursoService {
    // CRUD para el API de CategoriasCurso
    
    List<CategoriasCurso> buscarTodos();
    // Método para listar todos los elementos de CategoriasCurso

    void guardar(CategoriasCurso curso);
    // Método para guardar CategoriasCurso

    void modificar(CategoriasCurso curso);
    // Método para modificar CategoriasCurso

    Optional<CategoriasCurso> buscarId(Integer id);
    // Método para listar un curso 

    void eliminar(Integer id);
    // Método para eliminar un curso
}