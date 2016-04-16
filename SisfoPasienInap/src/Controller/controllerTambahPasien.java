/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Model.*;
import View.Tambah_Pasien;


/**
 *
 * @author Asus Pc
 */
public class controllerTambahPasien implements ActionListener{
    Tambah_Pasien tp;
    model model;

    public controllerTambahPasien(model model) {
        tp = new Tambah_Pasien();
        tp.setVisible(true);
        this.model = model;
        tp.getOK().addActionListener(this);
        tp.getCancelbtn().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if(x.equals(tp.getOK())){
            String nama = tp.getNama().getText();
            String ttl = tp.getTTL().getText();
            String alamat = tp.getAlamat().getText();
            String notelp = tp.getNotelp().getText();
            String id = tp.getId().getText();
            String jk = tp.getJk().getText();
            String kwn = tp.getKwn().getText();
            String tap = tp.getTp().getText();
            Pasien p = new Pasien(nama, ttl, alamat, notelp, id, jk, kwn, tap);
            try {
                model.addPasien(p);
            } catch (IOException ex) {
                Logger.getLogger(controllerTambahPasien.class.getName()).log(Level.SEVERE, null, ex);
            }
            tp.getTxtarea().setText(model.getPasien(model.daftarPasien.size()-1).toString());
        } else if (x.equals(tp.getCancelbtn())) {
            controllerHome home = new controllerHome(model);
            tp.dispose();
        }
        
    }
    
    
}
