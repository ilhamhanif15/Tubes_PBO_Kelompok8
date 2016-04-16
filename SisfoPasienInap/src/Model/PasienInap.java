/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/** 
 *
 * @author A45LB8.1
 */

import java.util.*;

public class PasienInap {
    private Pasien pasien;
    private Dokter dokter;
    //private String[] Diagnosa = new String[5];
    public static List<String> Diagnosa = new ArrayList();
    private int i= 0;
    public PasienInap(Pasien p, Dokter d) {
        setPasien(p);
        setDokter(d);
    }
    public void setPasien(Pasien p){
        this.pasien = p;
    }
    public void setDokter(Dokter d){
        this.dokter = d;
    }
    public void addDiagnosa (String diagnosa){
        Diagnosa.add(diagnosa);
    }
    public String getDiagnosa(int a){
        return Diagnosa.get(a);
    }
    public void DeleteDiagnosa(int a) {
        Diagnosa.remove(a);
    }
    public Pasien getPasien(){
        return pasien;
    }
    public Dokter getDokter(){
        return dokter;
    }
    
}
