/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.model;
import View.Cari_Ruangan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Ananda Faisal F
 */
public class ControllerCariRuangan implements ActionListener {
    Cari_Ruangan cr;
    model model;
    
        public ControllerCariRuangan(model model) {
        cr = new Cari_Ruangan();
        cr.setVisible(true);
        this.model = model;
        cr.getCari().addActionListener(this);
        cr.getKembali().addActionListener(this);
    
}

    @Override
    public void actionPerformed(ActionEvent e) {
        Object x = e.getSource();
        if (x.equals(cr.getCari())) {
            String cari = cr.getKode().getText();
            try {
                model.getRuangan(cari);
            } catch (Exception f) {
                     JOptionPane.showMessageDialog(null, "Ruangan Tidak Ditemukan");        
            }
            cr.getTampil().setText("Nama Ruangan : " +model.getRuangan(cari).View());
        }
        else if (x.equals(cr.getKembali())){
            ControllerMenuInap mi = new ControllerMenuInap(model);
            cr.dispose();
        }
    }
    
}
