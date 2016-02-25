/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import DTO.PersonaDTO;
import Factory.DAOFactory;

/**
 *
 * @author renzo
 */
public class PersonaBO {
    
     private DAOFactory factory;

    public PersonaBO(DAOFactory factory) {
        this.factory = factory;
    }
    
    
    public PersonaDTO buscarPersona(PersonaDTO persona){
    
        PersonaDTO peraux = null;
                
                 try{
                    peraux = factory.getPersonaDAO().buscarPersona(persona);
                }catch(Exception ex){
                    System.err.println(ex.getMessage());
                }
        
        
    return (peraux);
    }
}
