package fisi.unsm.api.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fisi.unsm.api.entity.NaturalezasCursos;
import fisi.unsm.api.repository.NaturalezasCursosRepository;
import fisi.unsm.api.service.INaturalezasCursosService;

@Service
public class NaturalezasCursosService implements INaturalezasCursosService{
    @Autowired
    private NaturalezasCursosRepository repoNaturalezasCursos;
    public List<NaturalezasCursos> buscarTodos(){
        return repoNaturalezasCursos.findAll();
    }
    public void guardar(NaturalezasCursos naturaleza){
        repoNaturalezasCursos.save(naturaleza);
    }
    public void modificar(NaturalezasCursos naturaleza){
        repoNaturalezasCursos.save(naturaleza);
    }
    public Optional<NaturalezasCursos> buscarId(Integer id){
        return repoNaturalezasCursos.findById(id);
    }
    public void eliminar(Integer id){
        repoNaturalezasCursos.deleteById(id);
    }
}

