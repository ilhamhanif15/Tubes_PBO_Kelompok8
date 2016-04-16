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
        hp.getCari().addActionListener((ActionListener) this);
        hp.getKembali().addActionListener((ActionListener) this);  
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
     
     
}
