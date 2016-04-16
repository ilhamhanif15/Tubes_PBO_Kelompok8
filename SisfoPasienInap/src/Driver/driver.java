/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import Controller.controllerTambahPasienView;
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
        controllerTambahPasienView c = new controllerTambahPasienView(m);
    }
    
}
