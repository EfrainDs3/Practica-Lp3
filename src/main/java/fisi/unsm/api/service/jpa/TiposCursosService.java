package fisi.unsm.api.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fisi.unsm.api.entity.TiposCursos;
import fisi.unsm.api.repository.TiposCursosRepository;
import fisi.unsm.api.service.ITiposCursosService;

@Service
public class TiposCursosService implements ITiposCursosService{
    @Autowired
    private TiposCursosRepository repoTiposCursos;
    public List<TiposCursos> buscarTodos(){
        return repoTiposCursos.findAll();
    }
    public void guardar(TiposCursos tipoCurso){
        repoTiposCursos.save(tipoCurso);
    }
    public void modificar(TiposCursos tipoCurso){
        repoTiposCursos.save(tipoCurso);
    }
    public Optional<TiposCursos> buscarId(Integer id){
        return repoTiposCursos.findById(id);
    }
    public void eliminar(Integer id){
        repoTiposCursos.deleteById(id);
    }
}

