/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Asus Pc
 */
public class controllerCariPasien implements ActionListener{
    Cari_Pasien tp;
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
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
