/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import DTO.EstudianteDTO;
import DTO.PersonaDTO;
import Factory.DAOFactory;

/**
 *
 * @author renzo
 */
public class EstudianteBO {
    
    
    private DAOFactory factory;

    public EstudianteBO(DAOFactory factory) {
        this.factory = factory;
    }
    
    
    
   public EstudianteDTO getEstudiante(EstudianteDTO estudiante){
   
       EstudianteDTO est = null;
        
                try{
                    est= factory.getEstudianteDAO().buscarEstudiante(estudiante);
                    System.out.println(est.getCodigo());
                }catch(Exception ex){
                    System.err.println(ex.getMessage());
                }
       
                        if(est!=null){
                            
                            PersonaBO peraux = new PersonaBO(this.factory);
                            PersonaDTO persona = peraux.buscarPersona((PersonaDTO)estudiante);
                            
                                est.setPrimerNombre(persona.getPrimerNombre());
                                est.setSegundoNombre(persona.getSegundoNombre());
                                est.setPrimerApellido(persona.getPrimerApellido());
                                est.setSegundoApellido(persona.getSegundoApellido());
                                est.setSexo(persona.isSexo());
                                est.setCorreoElectronico(persona.getCorreoElectronico());
                                est.setFechaNacimiento(persona.getFechaNacimiento());
                                est.setTelefonoCelular(persona.getTelefonoCelular());
                                est.setTelefonoFijo(persona.getTelefonoFijo());
                                est.setDireccionResidencia(persona.getDireccionResidencia());
                         
                        }
                                  
       return (est);
   }
    
    
    
    
}
