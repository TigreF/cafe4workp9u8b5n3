/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.ServiceLocator;

import Facade.Business;
import Facade.IBusiness;

/**
 *
 * @author renzo
 */
public class ServiceLocator {
    
    private static ServiceLocator instance;
    private IBusiness businessFacade;

    public ServiceLocator() {
        this.businessFacade = new Business();
    }
    
    public static ServiceLocator getInstance() {
        if (instance == null) {
            instance = new ServiceLocator();
        }
        return instance;
    }

    public IBusiness getBusinessFacadeInstance() {
        return businessFacade;
    }
    
    
    
    
}
