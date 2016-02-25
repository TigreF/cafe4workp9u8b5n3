/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import BO.EstudianteBO;
import DTO.EstudianteDTO;
import Factory.DAOFactory;

/**
 *
 * @author renzo
 */
public class Business implements IBusiness{
    
    
    private DAOFactory factory;

    public Business() {
         factory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
    }

    @Override
    public EstudianteDTO buscarEstudiante(EstudianteDTO estudiante) {
        
        EstudianteBO est = new EstudianteBO(this.factory);
            return(est.getEstudiante(estudiante));
        
    }

    
    
    
    
      

    
    
    
    
    
}
