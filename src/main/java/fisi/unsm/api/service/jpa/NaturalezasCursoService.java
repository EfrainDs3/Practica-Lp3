package fisi.unsm.api.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fisi.unsm.api.entity.NaturalezasCurso;
import fisi.unsm.api.repository.NaturalezasCursoRepository;
import fisi.unsm.api.service.INaturalezasCursoService;

@Service
public class NaturalezasCursoService implements INaturalezasCursoService{
    @Autowired
    private NaturalezasCursoRepository repoNaturalezasCurso;
    public List<NaturalezasCurso> buscarTodos(){
        return repoNaturalezasCurso.findAll();
    }
    public void guardar(NaturalezasCurso curso){
        repoNaturalezasCurso.save(curso);
    }
    public void modificar(NaturalezasCurso curso){
        repoNaturalezasCurso.save(curso);
    }
    public Optional<NaturalezasCurso> buscarId(Integer id){
        return repoNaturalezasCurso.findById(id);
    }
    public void eliminar(Integer id){
        repoNaturalezasCurso.deleteById(id);
    }
}

