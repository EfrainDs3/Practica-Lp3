package fisi.unsm.api.service;

import java.util.List;
import java.util.Optional;

import fisi.unsm.api.entity.Registros;

public interface IRegistroService {

    //CRUD para el API de Registros
    List<Registros> buscarTodos();

    void guardar(Registros registro);

    void modificar(Registros registro);

    Optional<Registros> buscarPorId(Integer id);

    void eliminar(Integer id);

}
