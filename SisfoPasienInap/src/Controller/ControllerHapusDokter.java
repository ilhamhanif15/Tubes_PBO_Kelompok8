/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.model;
import View.Hapus_Dokter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Ananda Faisal F
 */
public class ControllerHapusDokter implements ActionListener {
    Hapus_Dokter hp;
    model model;
    
     public ControllerHapusDokter(model model) {
        hp = new Hapus_Dokter();
        hp.setVisible(true);
        this.model = model;
        hp.getCari().addActionListener(this);
        hp.getHapus().addActionListener(this);
        hp.getKembali().addActionListener(this);  
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object x = e.getSource();
        hp.getHapus().setVisible(false);
        if (x.equals(hp.getCari())) {
            String cari = hp.getId().getText();
            try {
                model.getDokter(cari);
                hp.getTampil().setText("Nama            : " +model.getDokter(cari).getNama()+
                                       "\nKeahlian      : " +model.getDokter(cari).getKeahlian()+
                                       "\nJenis Dokter  : " +model.getDokter(cari).getJenisDokter());
                hp.getHapus().setVisible(true);
              
            } catch (Exception f) {
                JOptionPane.showMessageDialog(null, "Id Dokter Tidak Ditemukan");    
            }
        } else if (x.equals(hp.getKembali())) {
            ControllerCariDokter cd = new ControllerCariDokter(model);
            hp.dispose();
        }  else if (x.equals(hp.getHapus())) {
                try {
                    String cari = hp.getId().getText();
                    model.deleteDokter(cari);
                    JOptionPane.showMessageDialog(null, "Dokter Berhasil Dihapus"); 
                } catch (Exception g) {
                  JOptionPane.showMessageDialog(null, "Error");   
                }
             }
    }
     
     
}
