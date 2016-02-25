/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;



/**
 *
 * @author renzo
 */
public class EstudianteDTO extends PersonaDTO{

    private String codigo;
    
    
    public EstudianteDTO(String identificacion) {
        super(identificacion);
    }

    public EstudianteDTO() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
  
    
    
    
}
