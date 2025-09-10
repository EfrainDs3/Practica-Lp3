package fisi.unsm.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fisi.unsm.api.entity.Clientes;
import fisi.unsm.api.entity.Registros;

public interface ClientesRepository extends JpaRepository <Clientes, Integer> {

}
