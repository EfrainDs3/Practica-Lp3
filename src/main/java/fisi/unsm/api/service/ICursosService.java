package fisi.unsm.api.service;

import java.util.List;
import java.util.Optional;

import fisi.unsm.api.entity.Cursos;

public interface ICursosService {
    // CRUD para el API de Cursos
    
    List<Cursos> buscarTodos();
    // Método para listar todos los elementos de Cursos

    Cursos guardar(Cursos curso);
    // Método para guardar Cursos

    Cursos modificar(Cursos curso);
    // Método para modificar Cursos

    Optional<Cursos> buscarId(Integer id);
    // Método para listar un curso 

    void eliminar(Integer id);
    // Método para eliminar un curso
}