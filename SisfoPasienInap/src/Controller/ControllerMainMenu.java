/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.model;
import View.Main_Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 *
 * @author Asus Pc
 */
public class ControllerMainMenu  implements ActionListener{
    Main_Menu mm;
    model mod;

    public ControllerMainMenu(model mod) {
        this.mod = mod;
        mm = new Main_Menu();
        mm.setVisible(true);
        mm.getBtndokter().addActionListener(this);
        mm.getBtnkeluar().addActionListener(this);
        mm.getBtnpasien().addActionListener(this);
        mm.getBtnrawat().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if(x.equals(mm.getBtndokter())){
            ControllerMenuDokter md = new ControllerMenuDokter(mod);
            mm.dispose();
        }
        else if(x.equals(mm.getBtnkeluar())){
            
        }
        else if(x.equals(mm.getBtnpasien())){
            ControllerMenuPasien mp = new ControllerMenuPasien(mod);
            mm.dispose();
        }
        else if(x.equals(mm.getBtnrawat())){
            ControllerMenuInap mi = new ControllerMenuInap(mod);
            mm.dispose();
        }
    } 
    
    
}
