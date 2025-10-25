package fisi.unsm.api.entity;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "naturalezas_cursos")
@SQLDelete(sql = "UPDATE naturalezas_cursos SET estado = 0 WHERE idnaturalezacurso = ?")
@Where(clause = "estado = 1")

public class NaturalezasCursos {

    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idnaturalezacurso;
    private String naturaleza;
    private Integer estado = 1;
    
    public Integer getIdnaturalezacurso() {
        return idnaturalezacurso;
    }
    public void setIdnaturalezacurso(Integer idnaturalezacurso) {
        this.idnaturalezacurso = idnaturalezacurso;
    }
    public String getNaturaleza() {
        return naturaleza;
    }
    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }
    public Integer getEstado() {
        return estado;
    }
    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "NaturalezasCursos [idnaturalezacurso=" + idnaturalezacurso + ", naturaleza=" + naturaleza + ", estado="
                + estado + "]";
    }

}
