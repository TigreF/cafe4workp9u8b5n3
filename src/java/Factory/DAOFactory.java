/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import DAO.Interface.IEstudianteDAO;
import DAO.Interface.IPersonaDAO;
import Factory.Concrete.MysqlDAOFactory;

/**
 *
 * @author renzo
 */
public abstract class DAOFactory {
    
    
    public static final int ORACLE = 2;
    public static final int MYSQL = 1;
    
    
      public static DAOFactory getDAOFactory(int whichFactory) {

        switch (whichFactory) {
            
                case ORACLE:
                    return null;
                case MYSQL:
                    return (new MysqlDAOFactory());
                default:
                    return null;
        }
        
    }
    

      
      public abstract IEstudianteDAO getEstudianteDAO();
      public abstract IPersonaDAO getPersonaDAO();
    
}
