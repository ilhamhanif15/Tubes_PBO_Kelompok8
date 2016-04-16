/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfopasieninap;

/**
 *
 * @author A45LB8.1
 */
public class Ruangan {
    private PasienInap[] daftarPasien = new PasienInap[5];
    private String kodeRuang;
    private int i = 0;
    public Ruangan(String KodeRuang){
        setKodeRuang(KodeRuang);
    }
    public void tambahPasienInap(Pasien p, Dokter d){
        if(i<5){
            daftarPasien[i]=new PasienInap(p,d);
            i++;
	}
    }
    public void setKodeRuang(String kodeRuang){
        this.kodeRuang = kodeRuang;
    }
    public String getKodeRuang(){
        return kodeRuang;
    }
    public PasienInap GetPasienInap(int index) {
        return daftarPasien[index];
    }
    public PasienInap GetPasienInap(String IdPasien){
        int b = 0;
        for (b=0; b<5; b++) {
            if ( IdPasien.equalsIgnoreCase(GetPasienInap(b).getPasien().getId())) {
                break;
            }
        }
        return daftarPasien[b];
    }
    public void RemovePasienInap(int a) {
        daftarPasien[a] = null;
            while(a<(5-a)){
               daftarPasien[a] = daftarPasien[a+1];
               a++;
            }
            if((5-a)<a && a!=4) {
               if(daftarPasien[a+1] != null ) {
               daftarPasien[a] = daftarPasien[a+1];
               daftarPasien[a+1] = null;
               a++;
               } else {
               daftarPasien[a] = null;
               a++;
               }  
            } else {
                daftarPasien[a] = null; 
            }
        i--;    
    }
    

    
    public void RemovePasienInap(String IdPasien) {
        int a = 0;
        for (a=0; a<5; a++) {
            if (IdPasien.equalsIgnoreCase(daftarPasien[a].getPasien().getId())) {
                break;
            }
        }
        daftarPasien[a] = null;
        for (int b=0;b<5;b++) {
            if (daftarPasien[b] == null) {
                while(b<(5-b)){
                    daftarPasien[b] = daftarPasien[b+1];
                    b++;
                }
            }
        }
    }
}
