
import Controller.Controller;
import DTO.EstudianteDTO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author renzo
 */
public class Testing {
 
    
    public static void main(String args[]){
    
        
            Controller controller = new Controller(); 
            
            EstudianteDTO est = new EstudianteDTO();
            est.setIdentificacion("1");
            EstudianteDTO ext = controller.buscarEstudiante(est);
            System.out.println(ext.getPrimerNombre());
            
    
    }
    
    
    
}
