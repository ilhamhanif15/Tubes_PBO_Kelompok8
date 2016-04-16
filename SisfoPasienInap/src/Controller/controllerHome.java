/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.model;
import View.View_Pasien;
import sisfopasieninap.Aplikasi;

/**
 *
 * @author Asus Pc
 */
public class controllerHome {
    View_Pasien view;
    model model;

    public controllerHome(model model) {
        this.model = model;
        view = new View_Pasien();
        view.setVisible(true);
        
    }
    
    
}
