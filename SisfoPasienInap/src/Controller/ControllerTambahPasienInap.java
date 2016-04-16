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

/**
 *
 * @author Asus Pc
 */
public class ControllerTambahPasienInap implements ActionListener {
    Tambah_PasienInap tpi;
    model model;

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
        }
    }
    
    
}
