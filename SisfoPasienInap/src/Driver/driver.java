/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import Controller.*;
import Model.model;

/**
 *
 * @author Asus Pc
 */
public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        model m = new model();
//        controllerTambahPasien c = new controllerTambahPasien(m);
        // ControllerTambahRuangan c = new ControllerTambahRuangan(m);
        ControllerCariRuangan c = new ControllerCariRuangan(m);
    }
    
}
