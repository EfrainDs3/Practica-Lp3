package fisi.unsm.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fisi.unsm.api.entity.TiposCurso;

public interface TiposCursoRepository extends JpaRepository<TiposCurso, Integer>{
    
}
