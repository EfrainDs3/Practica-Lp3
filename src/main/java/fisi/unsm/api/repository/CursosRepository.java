package fisi.unsm.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fisi.unsm.api.entity.Cursos;

public interface CursosRepository extends JpaRepository<Cursos, Integer>{
    
}
