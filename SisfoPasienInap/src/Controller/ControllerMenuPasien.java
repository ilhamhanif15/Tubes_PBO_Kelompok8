/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.model;
import View.Menu_Pasien;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Asus Pc
 */
public class ControllerMenuPasien implements ActionListener{
    Menu_Pasien mp;
    model mod;

    public ControllerMenuPasien(model mod) {
        this.mod = mod;
        mp = new Menu_Pasien();
        mp.setVisible(true);
        mp.getBtncaripasien().addActionListener(this);
        mp.getBtnhapuspasien().addActionListener(this);
        mp.getBtnmainmenu().addActionListener(this);
        mp.getBtntambahpasien().addActionListener(this);
        mp.getBtntampilpasien().addActionListener(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if (x.equals(mp.getBtncaripasien())){
            controllerCariPasien cp = new controllerCariPasien(mod);
            mp.dispose();
        }
        else if(x.equals(mp.getBtnhapuspasien())){
            controllerHapusPasien hp = new controllerHapusPasien(mod);
            mp.dispose();
        }
        else if(x.equals(mp.getBtnmainmenu())){
            ControllerMainMenu mm = new ControllerMainMenu(mod);
            mp.dispose();
        }
        else if(x.equals(mp.getBtntambahpasien())){
            controllerTambahPasien tp = new controllerTambahPasien(mod);
            mp.dispose();
        }
        else if (x.equals(mp.getBtntampilpasien())){
            
        }
    }
}
