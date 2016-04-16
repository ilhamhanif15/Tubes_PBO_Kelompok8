/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.model;
import View.Tambah_Dokter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sisfopasieninap.Dokter;

/**
 *
 * @author Ananda Faisal F
 */
public class ControllerTambahDokter implements ActionListener{
    Tambah_Dokter td;
    model model;

    public ControllerTambahDokter(model model) {
        td = new Tambah_Dokter();
        td.setVisible(true);
        this.model = model;
        td.getOkbtn().addActionListener((ActionListener) this);
        td.getCnlbtn().addActionListener((ActionListener) this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object x = e.getSource();
        if(x.equals(td.getOkbtn())){
            String nama = td.getNama().getText();
            String ttl = td.getTTL().getText();
            String alamat = td.getAlmt().getText();
            String notelp = td.getTelp().getText();
            String id = td.getId().getText();
            String jk = td.getJk().getText();
            String kwn = td.getKwn().getText();
            String jd = td.getJd().getText();
            String ka = td.getKa().getText();
            Dokter d = new Dokter(nama,ttl,alamat,notelp,id,jk,kwn,jd,ka);
            model.addDokter(d);
            JOptionPane.showMessageDialog(null, "Berhasil Menambahkan");
            
    }
}
}