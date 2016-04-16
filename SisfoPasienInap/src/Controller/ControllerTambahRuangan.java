/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Ruangan;
import Model.model;
import View.Tambah_Ruangan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Ananda Faisal F
 */
public class ControllerTambahRuangan implements ActionListener {
    Tambah_Ruangan tr;
    model model;

     public ControllerTambahRuangan(model model) {
        tr = new Tambah_Ruangan();
        this.model = model;
        tr.getTambah().addActionListener((ActionListener) this);
        tr.getCancel().addActionListener((ActionListener) this);
        tr.setVisible(true); 
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object x = e.getSource();
        if(x.equals(tr.getTambah())){
            String nama = tr.getNama().getText();
            String kode = tr.getKode().getText();
            Ruangan r = new Ruangan(nama,kode);
            model.addRuangan(r);
            JOptionPane.showMessageDialog(null, "Berhasil Menambahkan");
            
    }
}

}
   
