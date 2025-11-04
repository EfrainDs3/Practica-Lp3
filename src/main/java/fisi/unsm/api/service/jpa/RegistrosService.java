package fisi.unsm.api.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fisi.unsm.api.entity.Registros;
import fisi.unsm.api.repository.RegistrosRepository;
import fisi.unsm.api.service.IRegistrosService;

@Service
public class RegistrosService implements IRegistrosService{
    @Autowired
    private RegistrosRepository repoRegistros;
    public List<Registros> buscarTodos(){
        return repoRegistros.findAll();
    }
    public void guardar(Registros registro){
        repoRegistros.save(registro);
    }
    public void modificar(Registros registro){
        repoRegistros.save(registro);
    }
    public Optional<Registros> buscarId(Integer id){
        return repoRegistros.findById(id);
    }
    public void eliminar(Integer id){
        repoRegistros.deleteById(id);
    }
}
