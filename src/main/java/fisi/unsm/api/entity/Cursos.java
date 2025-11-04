package fisi.unsm.api.entity;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cursos")
@SQLDelete(sql ="UPDATE cursos SET estado = 0 WHERE idcurso = ?")
@Where(clause = "estado = 1")

public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer idcurso;
    private String descripcion;
    private Integer estado = 1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private TiposCurso id_tipo;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private CategoriasCurso id_categoria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_naturaleza")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private NaturalezasCurso id_naturaleza;
    
    public Integer getIdcurso() {
        return idcurso;
    }
    public void setIdcurso(Integer idcurso) {
        this.idcurso = idcurso;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Integer getEstado() {
        return estado;
    }
    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    public TiposCurso getId_tipo() {
        return id_tipo;
    }
    public void setId_tipo(TiposCurso id_tipo) {
        this.id_tipo = id_tipo;
    }
    public CategoriasCurso getId_categoria() {
        return id_categoria;
    }
    public void setId_categoria(CategoriasCurso id_categoria) {
        this.id_categoria = id_categoria;
    }
    public NaturalezasCurso getId_naturaleza() {
        return id_naturaleza;
    }
    public void setId_naturaleza(NaturalezasCurso id_naturaleza) {
        this.id_naturaleza = id_naturaleza;
    }
    @Override
    public String toString() {
        return "Cursos [idcurso=" + idcurso + ", descripcion=" + descripcion + ", estado=" + estado + ", id_tipo="
                + id_tipo + ", id_categoria=" + id_categoria + ", id_naturaleza=" + id_naturaleza + "]";
    }

    
}
