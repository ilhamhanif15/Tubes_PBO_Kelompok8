/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.model;
import View.Cari_Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus Pc
 */
public class controllerCariPasien implements ActionListener{
    Cari_Pasien cp;
    model mod;

    public controllerCariPasien(model mod) {
        cp = new Cari_Pasien();
        cp.setVisible(true);
        this.mod = mod;
        cp.getCaribtn().addActionListener(this);
        cp.getBackbtn().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if (x.equals(cp.getCaribtn())) {
            String cari = cp.getTxtcari().getText();
            try {
                mod.getPasien(cari);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Pasien TIdak Ditemukan");
            }
            cp.getViewdata().setText(mod.getPasien(cari).View());
        }else if(x.equals(cp.getBackbtn())){
            ControllerMenuPasien mp = new ControllerMenuPasien(mod);
            cp.dispose();
        }
    }
    
}
