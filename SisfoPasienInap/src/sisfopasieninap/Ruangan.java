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
        boolean cek;
        int b = 0;
        for (b=0; b<5; b++) {
            if ( GetPasienInap(b).getPasien().getId() == IdPasien) {
                cek = true;
                break;
            }
        cek = false;
        }
        return daftarPasien[b];
    }
    public void RemovePasienInap(int index) {
        daftarPasien[index] = null;
        for (int a=0;a<5;a++) {
            if (daftarPasien[a] == null) {
                while(a<(5-a)){
                    daftarPasien[a] = daftarPasien[a+1];
                    a++;
                }                
            }
        }
    }
}
