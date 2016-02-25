/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.ServiceLocator.ServiceLocator;
import DTO.EstudianteDTO;
import Facade.IBusiness;

/**
 *
 * @author renzo
 */
public class Controller {
    
    private ServiceLocator locator;

    public Controller() {
         locator = ServiceLocator.getInstance();
    }
    
    
    public EstudianteDTO buscarEstudiante(EstudianteDTO estudiante){
    
          IBusiness facade = locator.getBusinessFacadeInstance();
        
    return(facade.buscarEstudiante(estudiante));
    }
    
    
    
}
