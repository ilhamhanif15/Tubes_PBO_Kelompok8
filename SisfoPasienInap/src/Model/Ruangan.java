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
import static Model.PasienInap.Diagnosa;
import java.util.*;

public class Ruangan {
    //private PasienInap[] daftarPasien = new PasienInap[5];
    public static List<PasienInap> daftarPasienInap = new ArrayList();
    private String kodeRuang;
    private String nama;
    private int i = 0;
    public Ruangan(String nama, String KodeRuang){
        setKodeRuang(KodeRuang);
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void tambahPasienInap(Pasien p, Dokter d){
        daftarPasienInap.add(new PasienInap(p,d));
    }
    
    public void setKodeRuang(String kodeRuang){
        this.kodeRuang = kodeRuang;
    }
    
    public String getKodeRuang(){
        return kodeRuang;
    }
    
    public PasienInap GetPasienInap(int index) {
        return daftarPasienInap.get(index);
    }
    
    public PasienInap GetPasienInap(String IdPasien){
        int i=0;
        for (Object obj : daftarPasienInap) {
            if (IdPasien.equalsIgnoreCase(daftarPasienInap.get(i).getPasien().getId())) {
                break;
            } else {
                i++;
            }    
        }
        return daftarPasienInap.get(i);
    }
    public void RemovePasienInap(int a) {
        daftarPasienInap.remove(a);
    }
    
    public void RemovePasienInap(String IdPasien) {
        int a=0;
        for (Object obj : daftarPasienInap) {
            if (IdPasien.equalsIgnoreCase(daftarPasienInap.get(a).getPasien().getId())) {
                break;
            } else {
                a++;
            }    
        }
        daftarPasienInap.remove(a);
    }
    
    public String View() {
        return "Nama Ruangan : " +nama +
               "Kode Ruangan : "+kodeRuang;
    }
    
}
