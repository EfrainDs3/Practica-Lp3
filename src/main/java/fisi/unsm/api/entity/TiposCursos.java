package fisi.unsm.api.entity;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipos_cursos")
@SQLDelete(sql = "UPDATE tipos_cursos SET estado = 0 WHERE idtipocurso = ?")
@Where(clause = "estado = 1")

public class TiposCursos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtipocurso;
    private String tipo;
    private Integer estado = 1;

    
    public Integer getIdtipocurso() {
        return idtipocurso;
    }
    public void setIdtipocurso(Integer idtipocurso) {
        this.idtipocurso = idtipocurso;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Integer getEstado() {
        return estado;
    }
    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "TiposCursos [idtipocurso=" + idtipocurso + ", tipo=" + tipo + ", estado=" + estado + "]";
    }

}
