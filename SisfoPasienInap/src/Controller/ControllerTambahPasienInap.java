/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.model;
import View.Tambah_PasienInap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus Pc
 */
public class ControllerTambahPasienInap implements ActionListener {
    Tambah_PasienInap tpi;
    model model;
    private int n ;

    public ControllerTambahPasienInap(model model) {
        this.model = model;
        tpi = new Tambah_PasienInap();
        tpi.setVisible(true);
        tpi.getBtnAdd().addActionListener(this);
        tpi.getBtnBack().addActionListener(this);
        tpi.getJumdiagnosa().addActionListener(this);
        tpi.getTxt1().setVisible(false);
        tpi.getTxt2().setVisible(false);
        tpi.getTxt3().setVisible(false);
        tpi.getTxt4().setVisible(false);
        tpi.getTxt5().setVisible(false);
        tpi.getLab1().setVisible(false);
        tpi.getLab2().setVisible(false);
        tpi.getLab3().setVisible(false);
        tpi.getLab4().setVisible(false);
        tpi.getLab5().setVisible(false);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
            
        if (tpi.getJumdiagnosa().getSelectedItem() == "0"){
            tpi.getTxt1().setVisible(false);
            tpi.getTxt2().setVisible(false);
            tpi.getTxt3().setVisible(false);
            tpi.getTxt4().setVisible(false);
            tpi.getTxt5().setVisible(false);
            tpi.getLab1().setVisible(false);
            tpi.getLab2().setVisible(false);
            tpi.getLab3().setVisible(false);
            tpi.getLab4().setVisible(false);
            tpi.getLab5().setVisible(false);
        }else if (tpi.getJumdiagnosa().getSelectedItem()=="1"){
            tpi.getTxt1().setVisible(true);
            tpi.getLab1().setVisible(true);
            tpi.getTxt2().setVisible(false);
            tpi.getTxt3().setVisible(false);
            tpi.getTxt4().setVisible(false);
            tpi.getTxt5().setVisible(false);
            tpi.getLab2().setVisible(false);
            tpi.getLab3().setVisible(false);
            tpi.getLab4().setVisible(false);
            tpi.getLab5().setVisible(false);
            String d1 = tpi.getTxt1().getText();
            n=1;
        }else if (tpi.getJumdiagnosa().getSelectedItem()=="2"){
            tpi.getTxt1().setVisible(true);
            tpi.getLab1().setVisible(true);
            tpi.getTxt2().setVisible(true);
            tpi.getLab2().setVisible(true);
            tpi.getTxt3().setVisible(false);
            tpi.getTxt4().setVisible(false);
            tpi.getTxt5().setVisible(false);
            tpi.getLab3().setVisible(false);
            tpi.getLab4().setVisible(false);
            tpi.getLab5().setVisible(false);
            String d1 = tpi.getTxt1().getText();
            String d2 = tpi.getTxt2().getText();
            n=2;
        }else if (tpi.getJumdiagnosa().getSelectedItem()=="3"){
            tpi.getTxt1().setVisible(true);
            tpi.getLab1().setVisible(true);
            tpi.getTxt2().setVisible(true);
            tpi.getLab2().setVisible(true);
            tpi.getTxt3().setVisible(true);
            tpi.getLab3().setVisible(true);
            tpi.getTxt4().setVisible(false);
            tpi.getTxt5().setVisible(false);
            tpi.getLab4().setVisible(false);
            tpi.getLab5().setVisible(false);
            String d1 = tpi.getTxt1().getText();
            String d2 = tpi.getTxt2().getText();
            String d3 = tpi.getTxt3().getText();
            n=3;
        }else if (tpi.getJumdiagnosa().getSelectedItem()=="4"){
            tpi.getTxt1().setVisible(true);
            tpi.getLab1().setVisible(true);
            tpi.getTxt2().setVisible(true);
            tpi.getLab2().setVisible(true);
            tpi.getTxt3().setVisible(true);
            tpi.getLab3().setVisible(true);
            tpi.getTxt4().setVisible(true);
            tpi.getLab4().setVisible(true);
            tpi.getTxt5().setVisible(false);
            tpi.getLab5().setVisible(false);
            String d1 = tpi.getTxt1().getText();
            String d2 = tpi.getTxt2().getText();
            String d3 = tpi.getTxt3().getText();
            String d4 = tpi.getTxt4().getText();
            n=4;
        }else if (tpi.getJumdiagnosa().getSelectedItem()=="5"){
            tpi.getTxt1().setVisible(true);
            tpi.getLab1().setVisible(true);
            tpi.getTxt2().setVisible(true);
            tpi.getLab2().setVisible(true);
            tpi.getTxt3().setVisible(true);
            tpi.getLab3().setVisible(true);
            tpi.getTxt4().setVisible(true);
            tpi.getLab4().setVisible(true);
            tpi.getTxt5().setVisible(true);
            tpi.getLab5().setVisible(true);
            String d1 = tpi.getTxt1().getText();
            String d2 = tpi.getTxt2().getText();
            String d3 = tpi.getTxt3().getText();
            String d4 = tpi.getTxt4().getText();
            String d5 = tpi.getTxt5().getText();
            n=5;
        }
        if (x.equals(tpi.getBtnAdd())){
            String idp = tpi.getTxtidpasien().getText();
            String idd = tpi.getTxtiddokter().getText();
            String idr = tpi.getTxtruang().getText();
            try {
            model.getRuangan(idr).tambahPasienInap(model.getPasien(idp), model.getDokter(idr));
            switch(n){
                case 1:
                    model.getRuangan(idr).GetPasienInap(idp).addDiagnosa(tpi.getTxt1().getText());
                case 2:
                    model.getRuangan(idr).GetPasienInap(idp).addDiagnosa(tpi.getTxt1().getText());
                    model.getRuangan(idr).GetPasienInap(idp).addDiagnosa(tpi.getTxt2().getText());
                case 3:
                    model.getRuangan(idr).GetPasienInap(idp).addDiagnosa(tpi.getTxt1().getText());
                    model.getRuangan(idr).GetPasienInap(idp).addDiagnosa(tpi.getTxt2().getText());
                    model.getRuangan(idr).GetPasienInap(idp).addDiagnosa(tpi.getTxt3().getText());
                case 4:
                    model.getRuangan(idr).GetPasienInap(idp).addDiagnosa(tpi.getTxt1().getText());
                    model.getRuangan(idr).GetPasienInap(idp).addDiagnosa(tpi.getTxt2().getText());
                    model.getRuangan(idr).GetPasienInap(idp).addDiagnosa(tpi.getTxt3().getText());
                    model.getRuangan(idr).GetPasienInap(idp).addDiagnosa(tpi.getTxt4().getText());
                case 5:    
                    model.getRuangan(idr).GetPasienInap(idp).addDiagnosa(tpi.getTxt1().getText());
                    model.getRuangan(idr).GetPasienInap(idp).addDiagnosa(tpi.getTxt2().getText());
                    model.getRuangan(idr).GetPasienInap(idp).addDiagnosa(tpi.getTxt3().getText());
                    model.getRuangan(idr).GetPasienInap(idp).addDiagnosa(tpi.getTxt4().getText());
                    model.getRuangan(idr).GetPasienInap(idp).addDiagnosa(tpi.getTxt5().getText());
                }
            JOptionPane.showMessageDialog(null, "Berhasil Menambahkan");
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "ID Pasien/Dokter/Kode Ruang Salah");
            }
    
        }else if(x.equals(tpi.getBtnBack())){
            ControllerMenuInap mi = new ControllerMenuInap(model);
            tpi.dispose();
        }
    }
}    
