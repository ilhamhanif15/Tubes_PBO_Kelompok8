/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.model;
import View.Menu_Ruang_dan_Rawat_Inap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Asus Pc
 */
public class ControllerMenuInap implements ActionListener{
    Menu_Ruang_dan_Rawat_Inap mr;
    model mod;

    public ControllerMenuInap(model mod) {
        this.mod = mod;
        mr = new Menu_Ruang_dan_Rawat_Inap();
        mr.setVisible(true);
        mr.getBtnhapusruangan().addActionListener(this);
        mr.getBtnmainmenu().addActionListener(this);
        mr.getBtntambahpasien().addActionListener(this);
        mr.getBtntambahruangan().addActionListener(this);
        mr.getBtntampilruangan().addActionListener(this);
        mr.getBtncaripasien().addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if (x.equals(mr.getBtnhapusruangan())){
            ControllerHapusRuangan hr = new ControllerHapusRuangan(mod);
            mr.dispose();
        }
        else if (x.equals(mr.getBtnmainmenu())){
            ControllerMainMenu mm = new ControllerMainMenu(mod);
            mr.dispose();
        }
        else if (x.equals(mr.getBtntambahpasien())) {
            ControllerTambahPasienInap tpi = new ControllerTambahPasienInap(mod);
            mr.dispose();
        }
        else if (x.equals(mr.getBtntambahruangan())) {
            ControllerTambahRuangan tr = new ControllerTambahRuangan(mod);
            mr.dispose();
        }
        else if (x.equals(mr.getBtntampilruangan())){
            ControllerCariRuangan cr = new ControllerCariRuangan(mod);
            mr.dispose();
        }
        else if (x.equals(mr.getBtncaripasien())) {
            ControllerCariPasienInap cp = new ControllerCariPasienInap(mod);
        }
    }
    
    
}
