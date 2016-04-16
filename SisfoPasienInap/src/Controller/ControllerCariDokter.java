/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.model;
import View.Cari_Dokter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Ananda Faisal F
 */
public class ControllerCariDokter implements ActionListener {
    Cari_Dokter cd;
    model model;
    
    public ControllerCariDokter(model model) {
        cd = new Cari_Dokter();
        cd.setVisible(true);
        this.model = model;
        cd.getCari().addActionListener(this);
        cd.getKembali().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object x = e.getSource();
        if (x.equals(cd.getCari())) {
            String cari = cd.getId().getText();
            try {
                model.getDokter(cari);
            } catch (Exception f) {
                     JOptionPane.showMessageDialog(null, "Dokter Tidak Ditemukan");        
            }
            cd.getjTampil().setText("Nama : " +model.getDokter(cari).View());
        }
    }
    
}
