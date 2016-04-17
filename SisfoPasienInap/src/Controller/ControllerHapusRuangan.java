/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.model;
import View.Hapus_Ruangan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Ananda Faisal F
 */
public class ControllerHapusRuangan implements ActionListener {
    Hapus_Ruangan hr;
    model model;
    
    
    public ControllerHapusRuangan(model model) {
        hr = new Hapus_Ruangan();
        hr.setVisible(true);
        this.model = model;
        hr.getCari().addActionListener(this);
        hr.getHapus().addActionListener(this);
        hr.getKembali().addActionListener(this);  
        hr.getHapus().setVisible(false);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object x = e.getSource();
        if (x.equals(hr.getCari())) {
            String cari = hr.getKode().getText();
            try {
                model.getRuangan(cari);
                hr.getTampil().setText("Nama Ruangan        : " +model.getRuangan(cari).getNama()+
                                       "\nKode Ruangan      : " +model.getRuangan(cari).getKodeRuang());
                                      
                hr.getHapus().setVisible(true);
              
            } catch (Exception f) {
                JOptionPane.showMessageDialog(null, "Kode Ruangan Tidak Ditemukan");    
            }
        }  else if (x.equals(hr.getHapus())) {
                try {
                    String cari = hr.getKode().getText();
                    model.deleteRuangan(cari);
                    JOptionPane.showMessageDialog(null, "Ruangan Berhasil Dihapus"); 
                } catch (Exception g) {
                  JOptionPane.showMessageDialog(null, "Error");   
                }
             }
        else if(x.equals(hr.getKembali())) {
            ControllerMenuInap mi = new ControllerMenuInap(model);
            hr.dispose();
        }
    }
    
}
