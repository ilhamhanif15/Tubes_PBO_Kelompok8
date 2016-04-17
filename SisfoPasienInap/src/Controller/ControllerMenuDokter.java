/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.model;
import View.Menu_Dokter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Asus Pc
 */
public class ControllerMenuDokter implements ActionListener{
    Menu_Dokter md;
    model mod;

    public ControllerMenuDokter(model mod) {
        this.mod = mod;
        md = new Menu_Dokter();
        md.setVisible(true);
        md.getBtncaridokter().addActionListener(this);
        md.getBtnhapusdokter().addActionListener(this);
        md.getBtnmainmenu().addActionListener(this);
        md.getBtntambahdokter().addActionListener(this);
        md.getBtntampildokter().addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if(x.equals(md.getBtncaridokter())){
            ControllerCariDokter cd = new ControllerCariDokter(mod);
            md.dispose();
        }
        else if(x.equals(md.getBtnhapusdokter())){
            ControllerHapusDokter hd = new ControllerHapusDokter(mod);
            md.dispose();
        }
        else if (x.equals(md.getBtnmainmenu())){
            ControllerMainMenu mm =new ControllerMainMenu(mod);
            md.dispose();
        }
        else if (x.equals(md.getBtntambahdokter())) {
            ControllerTambahDokter td = new ControllerTambahDokter(mod);
            md.dispose();
        }
        else if (x.equals(md.getBtntampildokter())) {
            
        }
    }
    
}
