/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Model.PasienInap.Diagnosa;
import Model.model;
import View.Cari_PasienInap;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus Pc
 */
public class ControllerCariPasienInap implements ActionListener{
    Cari_PasienInap cpi;
    model mod;

    public ControllerCariPasienInap(model mod) {
        this.mod = mod;
        cpi = new Cari_PasienInap();
        cpi.setVisible(true);
        cpi.getBtncari().addActionListener(this);
        cpi.getBtnkembali().addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if (x.equals(cpi.getBtncari())){
            String idp = cpi.getTxtid().getText();
            String idr = cpi.getTxtruang().getText();
            try {
                cpi.getTxtarea().setText("Nama Pasien : "+mod.getRuangan(idr).GetPasienInap(idp).getPasien().getNama()
                                   +"\nNama Dokter Yang Menangani : "+mod.getRuangan(idr).GetPasienInap(idp).getDokter().getNama()
                                   +"\nNama Ruangan : "+mod.getRuangan(idr).getNama());
                for(Object obj: Diagnosa){
                    cpi.getTxtarea2().append((String) obj);
                }
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ID Pasien/Kode Ruang TIdak ditemukan");
            }
        }
        else if(x.equals(cpi.getBtnkembali())){
            ControllerMenuInap mi = new ControllerMenuInap(mod);
            cpi.dispose();
        }
    }        
}
