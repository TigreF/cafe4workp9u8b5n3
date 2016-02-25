/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Interface;

import DTO.PersonaDTO;



/**
 *
 * @author renzo
 */
public interface IPersonaDAO {
    
    
    public PersonaDTO buscarPersona(PersonaDTO persona) throws Exception;
    
    
}
