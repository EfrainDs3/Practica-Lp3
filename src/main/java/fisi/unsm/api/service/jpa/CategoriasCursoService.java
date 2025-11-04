package fisi.unsm.api.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fisi.unsm.api.entity.CategoriasCurso;
import fisi.unsm.api.repository.CategoriasCursoRepository;
import fisi.unsm.api.service.ICategoriasCursoService;

@Service
public class CategoriasCursoService implements ICategoriasCursoService{
    @Autowired
    private CategoriasCursoRepository repoCategoriasCurso;
    public List<CategoriasCurso> buscarTodos(){
        return repoCategoriasCurso.findAll();
    }
    public void guardar(CategoriasCurso curso){
        repoCategoriasCurso.save(curso);
    }
    public void modificar(CategoriasCurso curso){
        repoCategoriasCurso.save(curso);
    }
    public Optional<CategoriasCurso> buscarId(Integer id){
        return repoCategoriasCurso.findById(id);
    }
    public void eliminar(Integer id){
        repoCategoriasCurso.deleteById(id);
    }
}

