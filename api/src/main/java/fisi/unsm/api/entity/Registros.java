package fisi.unsm.api.entity;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "registros")

@SQLDelete(sql = "UPDATE registros SET estado = 0 WHERE idregistro = ?")
// Cuando el modelo reciba del controlador el metodo para eliminar
// un registro, lo que hara el modelo será cambiar el valor de e l campo estado = 0
@Where(clause = "estado = 1")
//Permite que solo se muestren los registros con estado = 1

public class Registros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer idregistro;
    private String nombres;
    private String apellidos;
    private String email;
    private String cliente_id;
    private String llave_secreta;
    private Integer estado = 1;
    
    public Integer getIdregistros() {
        return idregistro;
    }
    public void setIdregistros(Integer idregistros) {
        this.idregistro = idregistros;
    }
    public String getNombres() {   
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCliente_id() {
        return cliente_id;
    }
    public void setCliente_id(String cliente_id) {
        String datos = nombres + apellidos + email;
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {

            e.printStackTrace();
        }
        md.update(datos.getBytes());
        byte[] digest = md.digest();
        String result = new BigInteger(1, digest).toString(16).toLowerCase();
        cliente_id = result;
        this.cliente_id = cliente_id;
    }
    public String getLlave_secreta() {
        return llave_secreta;
    }
    public void setLlave_secreta(String llave_secreta) {
        String datos = email+nombres+apellidos;
        MessageDigest md = null;
        try{
            md = MessageDigest.getInstance("SHA-256");
        }catch(NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        md.update (datos.getBytes());
        byte[] digest = md.digest();
        String result = new BigInteger(1,digest).toString(16).toLowerCase();
        this.llave_secreta = result;
    }
    public Integer getEstado() {
        return estado;
    }
    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    @Override
    public String toString() {
        return "Registros [idregistro=" + idregistro + ", nombre=" + nombres + ", apellidos=" + apellidos + ", email="
                + email + ", cliente_id=" + cliente_id + ", llave_secreta=" + llave_secreta + ", estado=" + estado
                + "]";
    }

    

}
