package fisi.unsm.api.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fisi.unsm.api.entity.TiposCurso;
import fisi.unsm.api.repository.TiposCursoRepository;
import fisi.unsm.api.service.ITiposCursoService;

@Service
public class TiposCursoService implements ITiposCursoService{
    @Autowired
    private TiposCursoRepository repoTiposCurso;
    public List<TiposCurso> buscarTodos(){
        return repoTiposCurso.findAll();
    }
    public void guardar(TiposCurso curso){
        repoTiposCurso.save(curso);
    }
    public void modificar(TiposCurso curso){
        repoTiposCurso.save(curso);
    }
    public Optional<TiposCurso> buscarId(Integer id){
        return repoTiposCurso.findById(id);
    }
    public void eliminar(Integer id){
        repoTiposCurso.deleteById(id);
    }
}

