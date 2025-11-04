package fisi.unsm.api.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fisi.unsm.api.entity.Cursos;
import fisi.unsm.api.repository.CursosRepository;
import fisi.unsm.api.service.ICursosService;

@Service
public class CursosService implements ICursosService{
    @Autowired
    private CursosRepository repoCursos;
    public List<Cursos> buscarTodos(){
        return repoCursos.findAll();
    }
    @Override
    public Cursos guardar(Cursos curso){
        return repoCursos.save(curso);
    }
    @Override
    public Cursos modificar(Cursos curso){
        return repoCursos.save(curso);
    }
    public Optional<Cursos> buscarId(Integer id){
        return repoCursos.findById(id);
    }
    public void eliminar(Integer id){
        repoCursos.deleteById(id);
    }
}

