package fisi.unsm.api.service;

import java.util.List;
import java.util.Optional;

import fisi.unsm.api.entity.Clientes;


public interface IClientesService {

    //CRUD para el API de Clientes
    List<Clientes> buscarTodos();

    void guardar(Clientes cliente);

    void modificar(Clientes cliente);

    Optional<Clientes> buscarPorId(Integer id);

    void eliminar(Integer id);

}
