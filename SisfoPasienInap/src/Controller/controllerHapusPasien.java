/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.model;
import View.Hapus_Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus Pc
 */
public class controllerHapusPasien implements ActionListener {
    Hapus_Pasien hp;
    model mod;

    public controllerHapusPasien(model mod) {
        this.mod = mod;
        hp = new Hapus_Pasien();
        hp.setVisible(true);
        hp.getBtnCari().addActionListener(this);
        hp.getBtnHapus().addActionListener(this);
        hp.getBtnHapus().setVisible(false);
        hp.getBtnKembali().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if (x.equals(hp.getBtnCari())) {
            String cari = hp.getTxtid().getText();
            try {
                mod.getPasien(cari);
                hp.getTxtArea().setText("Nama                  : "+mod.getPasien(cari).getNama()
                                       +"\nAlamat              : "+mod.getPasien(cari).getAlamat()
                                       +"\nJenis Kelamin       : "+mod.getPasien(cari).getJenisKelamin()
                                       +"\nTanggal Pendaftaran : "+mod.getPasien(cari).getTanggalPendaftaran());
               hp.getBtnHapus().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ID Pasien Tidak Ditemukan");
            }
        } else if(x.equals(hp.getBtnKembali())) {
            controllerCariPasien cp = new controllerCariPasien(mod);
            hp.dispose();
        } else if (x.equals(hp.getBtnHapus())){
             try {
                    String cari = hp.getTxtid().getText();
                    mod.deletePasien(cari);
                    JOptionPane.showMessageDialog(null, "Pasien Berhasil Dihapus");
                 } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error");
            }
        }
    }
    
    
}
