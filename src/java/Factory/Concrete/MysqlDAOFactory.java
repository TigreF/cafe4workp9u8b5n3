/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory.Concrete;

import DAO.Interface.IEstudianteDAO;
import DAO.Interface.IPersonaDAO;
import DAO.Mysql.MysqlEstudianteDAO;
import DAO.Mysql.MysqlPersonaDAO;
import Factory.DAOFactory;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author renzo
 */
public class MysqlDAOFactory extends DAOFactory{
    
    
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/sanmiguel";
    public static final String USER = "root";
    public static final String PASS = "5YwpCjVuGvcudERE";
    
    
    
     public static Connection createConnection(){
        
         
        Connection con = null;
        
                        try {
                            Class.forName(DRIVER).newInstance();
                                //Get a connection
                            con = DriverManager.getConnection(DBURL, USER, PASS); 
                            System.out.println("Conexion establecida");
                       }
                       catch (Exception e){
                            e.printStackTrace();
                       }

        return (con);   
    }

    @Override
    public IEstudianteDAO getEstudianteDAO() {
        return (new MysqlEstudianteDAO());
    }

    @Override
    public IPersonaDAO getPersonaDAO() {
        return (new MysqlPersonaDAO());
    }
    
    
    
     
     
     
    
}
