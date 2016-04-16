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
import sisfopasieninap.*;
import java.util.*;
public class Ruangan {
    //private PasienInap[] daftarPasien = new PasienInap[5];
    public static List<PasienInap> daftarPasien = new ArrayList();
    private String kodeRuang;
    private String nama;
    private int i = 0;

    public String getNama() {
        return nama;
    }
    public Ruangan(String KodeRuang, String nama){
        setKodeRuang(KodeRuang);
        this.nama = nama;
    }
    public void tambahPasienInap(Pasien p, Dokter d){
        daftarPasien.add(new PasienInap(p,d));
    }
    
    public void setKodeRuang(String kodeRuang){
        this.kodeRuang = kodeRuang;
    }
    
    public String getKodeRuang(){
        return kodeRuang;
    }
    
    public PasienInap GetPasienInap(int index) {
        return daftarPasien.get(index);
    }
    
    public PasienInap GetPasienInap(String IdPasien){
        int i=0;
        for (Object obj : daftarPasien) {
            if (IdPasien.equalsIgnoreCase(daftarPasien.get(i).getPasien().getId())) {
                break;
            } else {
                i++;
            }    
        }
        return daftarPasien.get(i);
    }
    public void RemovePasienInap(int a) {
        daftarPasien.remove(a);
    }
    
    public void RemovePasienInap(String IdPasien) {
        int a=0;
        for (Object obj : daftarPasien) {
            if (IdPasien.equalsIgnoreCase(daftarPasien.get(a).getPasien().getId())) {
                break;
            } else {
                a++;
            }    
        }
        daftarPasien.remove(a);
    }
    
    public String View(){
        return "Nama Ruangan : "+nama
                +"\nKode Ruangan : "+kodeRuang;
    }
}
