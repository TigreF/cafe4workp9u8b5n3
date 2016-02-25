/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Interface;

import DTO.EstudianteDTO;

/**
 *
 * @author renzo
 */
public interface IEstudianteDAO {
    
    
    
    public EstudianteDTO buscarEstudiante(EstudianteDTO estudiante) throws Exception;
    public boolean existeEstudiante(EstudianteDTO estudiante) throws Exception;
    
    
}
