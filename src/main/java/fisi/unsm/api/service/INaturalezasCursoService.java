package fisi.unsm.api.service;

import java.util.List;
import java.util.Optional;

import fisi.unsm.api.entity.NaturalezasCurso;

public interface INaturalezasCursoService {
    // CRUD para el API de NaturalezasCurso
    
    List<NaturalezasCurso> buscarTodos();
    // Método para listar todos los elementos de NaturalezasCurso

    void guardar(NaturalezasCurso curso);
    // Método para guardar NaturalezasCurso

    void modificar(NaturalezasCurso curso);
    // Método para modificar NaturalezasCurso

    Optional<NaturalezasCurso> buscarId(Integer id);
    // Método para listar un curso 

    void eliminar(Integer id);
    // Método para eliminar un curso
}
