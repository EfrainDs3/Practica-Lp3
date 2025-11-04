package fisi.unsm.api.entity;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorias_curso")
@SQLDelete(sql ="UPDATE categorias_curso SET estado = 0 WHERE idcategoriacurso = ?")
@Where(clause = "estado = 1")
public class CategoriasCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcategoriacurso;
    private String categoria;
    private Integer estado = 1;

    public CategoriasCurso(){}
    
    public CategoriasCurso(Integer id){
        this.idcategoriacurso = id;
    }

    public Integer getIdcategoriacurso() {
        return idcategoriacurso;
    }
    public void setIdcategoriacurso(Integer idcategoriacurso) {
        this.idcategoriacurso = idcategoriacurso;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public Integer getEstado() {
        return estado;
    }
    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    @Override
    public String toString() {
        return "CategoriasCurso [idcategoriacurso=" + idcategoriacurso + ", categoria=" + categoria + ", estado="
                + estado + "]";
    }

    
}
