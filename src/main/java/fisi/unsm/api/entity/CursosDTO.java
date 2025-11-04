package fisi.unsm.api.entity;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cursos")
@SQLDelete(sql ="UPDATE cursos SET estado = 0 WHERE idcurso = ?")
@Where(clause = "estado = 1")
public class CursosDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer idcurso;
    private String descripcion;
    private Integer estado = 1;
    private Integer id_tipo;
    private Integer id_categoria;
    private Integer id_naturaleza;
    
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
    public Integer getId_tipo() {
        return id_tipo;
    }
    public void setId_tipo(Integer id_tipo) {
        this.id_tipo = id_tipo;
    }
    public Integer getId_categoria() {
        return id_categoria;
    }
    public void setId_categoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
    }
    public Integer getId_naturaleza() {
        return id_naturaleza;
    }
    public void setId_naturaleza(Integer id_naturaleza) {
        this.id_naturaleza = id_naturaleza;
    }
    @Override
    public String toString() {
        return "CursosDTO [idcurso=" + idcurso + ", descripcion=" + descripcion + ", estado=" + estado + ", id_tipo="
                + id_tipo + ", id_categoria=" + id_categoria + ", id_naturaleza=" + id_naturaleza + "]";
    } 

    
}
