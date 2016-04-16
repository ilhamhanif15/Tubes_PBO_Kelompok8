/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import sisfopasieninap.*;

/**
 *
 * @author A45LB8.1
 */
public class PasienInap {
    private Pasien pasien;
    private Dokter dokter;
    private String[] Diagnosa = new String[5];
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
        if(i<5){
            this.Diagnosa[i]=diagnosa;
            i++;
	}
    }
    public String getDiagnosa(int index){
        return Diagnosa[index];
    }
    public void DeleteDiagnosa(int a) {
        Diagnosa[a] = null;
            while(a<(5-a)){
               Diagnosa[a] = Diagnosa[a+1];
               a++;
            }
            if((5-a)<a && a!=4) {
               if(Diagnosa[a+1] != null ) {
               Diagnosa[a] = Diagnosa[a+1];
               Diagnosa[a+1] = null;
               a++;
               } else {
               Diagnosa[a] = null;
               a++;
               }  
            } else {
                Diagnosa[a] = null; 
            }
        i--;
    }
    public Pasien getPasien(){
        return pasien;
    }
    public Dokter getDokter(){
        return dokter;
    }
}
