/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Mysql;

import DAO.Interface.IEstudianteDAO;
import DTO.EstudianteDTO;
import Factory.Concrete.MysqlDAOFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author renzo
 */
public class MysqlEstudianteDAO implements IEstudianteDAO{
    
    
    private Connection conex;

    public MysqlEstudianteDAO() {
        
        conex = MysqlDAOFactory.createConnection();
        
    }

    @Override
    public EstudianteDTO buscarEstudiante(EstudianteDTO estudiante) throws Exception{
        
        
        EstudianteDTO est = null;
        
        try{
        
                    String selectStatement = "SELECT `estudiante`.`identificacion_estudiante`,\n" +
                                             "    `estudiante`.`codigo_estudiante`\n" +
                                             "FROM `sanmiguel`.`estudiante` WHERE identificacion_estudiante=?";
                    PreparedStatement prepStmt = conex.prepareStatement(selectStatement);
                    prepStmt.setString(1, estudiante.getIdentificacion());
                    ResultSet rs = prepStmt.executeQuery();
  
                    System.out.println(selectStatement);
                    
                            while (rs.next()) {
                                
                                est = new EstudianteDTO ();
                                est.setIdentificacion(rs.getString(1));
                                est.setCodigo(rs.getString(2));
                                
                            }//while
                            
                    rs.close();
            
            } catch (Exception e) {
                    est = null;
                   // throw new Exception(e); //if exception -> puts the object employee to null and sends the exception
            } finally {
                if (conex != null) {
                    conex.close();
            }
        }
        
       
        return (est);
    }

    
    
    
    @Override
    public boolean existeEstudiante(EstudianteDTO estudiante) throws Exception {
        
        boolean ex = false;
        int value = -1;
         try{
        
                    String selectStatement = " SELECT EXISTS(SELECT 1 FROM estudiante WHERE identificacion_estudiante=?)";
                    PreparedStatement prepStmt = conex.prepareStatement(selectStatement);
                    prepStmt.setNString(1, estudiante.getIdentificacion());
                    ResultSet rs = prepStmt.executeQuery();
  
                            while (rs.next()) {
                                value = rs.getInt(1);
                            }//while
                            
                    rs.close();
            
            } catch (Exception e) {
                    ex = false;
                   // throw new Exception(e); //if exception -> puts the object employee to null and sends the exception
            } finally {
                if (conex != null) {
                    conex.close();
            }
        }
        
        
        
         if(value==1)
             ex=true;
        
        
        return(ex);
        
        
    }
    
    
    
    
    
    
    
    
    
}
