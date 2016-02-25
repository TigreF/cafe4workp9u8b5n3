/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author renzo
 */
public class PersonaDTO implements Comparable{
    
    
    private String primerNombre;    
    private String segundoNombre; 
    private String primerApellido;
    private String segundoApellido;
    private String identificacion;
    private String direccionResidencia;
    private Date fechaNacimiento;
    private boolean sexo;
    private String telefonoFijo;
    private String telefonoCelular;
    private String correoElectronico;

    public PersonaDTO(String identificacion) {
        this.identificacion = identificacion;
    }

    public PersonaDTO(String primerNombre, String primerApellido, String identificacion, String direccionResidencia, Date fechaNacimiento, boolean sexo) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.identificacion = identificacion;
        this.direccionResidencia = direccionResidencia;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    public PersonaDTO() {
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    
    
    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.identificacion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PersonaDTO other = (PersonaDTO) obj;
        if (!Objects.equals(this.identificacion, other.identificacion)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        
           if(o==null){ 
                return (-1);
           }
        
           PersonaDTO otro = (PersonaDTO)o;
           long idThis = Long.parseLong(this.identificacion);
           long idO = Long.parseLong(otro.identificacion);
       
           if(idThis>idO){
               return (1);}
           if(idThis<idO){
               return (-1);}
           
    return(0);       
    }
    
    
    
    
    
    
    
    
    
}
