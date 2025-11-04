package fisi.unsm.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fisi.unsm.api.entity.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Integer>{
    
}
