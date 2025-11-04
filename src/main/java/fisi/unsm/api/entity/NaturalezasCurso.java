package fisi.unsm.api.entity;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "naturalezas_curso")
@SQLDelete(sql ="UPDATE naturalezas_curso SET estado = 0 WHERE idnaturalezacurso = ?")
@Where(clause = "estado = 1")
public class NaturalezasCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idnaturalezacurso;
    private String naturaleza;
    private Integer estado = 1;

    public NaturalezasCurso(){}
    
    public NaturalezasCurso(Integer id){
        this.idnaturalezacurso = id;
    }

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
        return "NaturalezasCurso [idnaturalezacurso=" + idnaturalezacurso + ", naturaleza=" + naturaleza + ", estado="
                + estado + "]";
    }

    
}
