/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus Pc
 */
public class model {

    public static List<Dokter> daftarDokter = new ArrayList();
    public static List<Pasien> daftarPasien = new ArrayList();
    public static List<Ruangan> daftarRuangan = new ArrayList();
    
    public void addDokter(Dokter d){
        daftarDokter.add(d);
    }
    
    public void addPasien(Pasien p) throws IOException {
        daftarPasien.add(p);
        
    }
    
    public void addRuangan(Ruangan r) {
        daftarRuangan.add(r);
    }
        
    public Pasien getPasien(String IdPasien) { 
        int a=0;
        for (Object obj: daftarPasien) {
            if (IdPasien.equalsIgnoreCase(daftarPasien.get(a).getId())) {
                break;
            }
            else {
                a++;
            }
        }        
        return daftarPasien.get(a);
    }
    
    public Pasien getPasien(int index) {
        return daftarPasien.get(index);
    }
        
    public void deletePasien(String IdPasien) {
        int b=0;
        for (Object obj: daftarPasien) {
            if (IdPasien.equalsIgnoreCase(daftarPasien.get(b).getId())){
                break;
            }
            else {
                b++;
            }
        }
        daftarPasien.remove(b);
    }
    
    public Dokter getDokter(String IdDokter) { 
        int a = 0;
        for (Object obj: daftarDokter) {
            if (IdDokter.equalsIgnoreCase(daftarDokter.get(a).getId())) {
                break;
            }
            else{
                a++;
            }
        }
        return daftarDokter.get(a);
    }
    
    public Dokter getDokter(int index) {
        return daftarDokter.get(index);
    }
    
    public void deleteDokter(String IdDokter) {
        int a = 0;
        for(Object obj: daftarDokter){
            if(IdDokter.equalsIgnoreCase(daftarDokter.get(a).getId())){
                break;
            }
            else {
                a++;
            }
        }
        daftarDokter.remove(a);
    }
    
    public Ruangan getRuangan(String KodeRuang) { 
        int a = 0;
        for (Object obj: daftarRuangan) {
            if (KodeRuang.equalsIgnoreCase(daftarRuangan.get(a).getKodeRuang())) {
                break;
            }
            else{
                a++;
            }
        }
        return daftarRuangan.get(a);
    }
    
    public Ruangan getRuangan(int index) {
        return daftarRuangan.get(index);
    }
    
    public void deleteRuangan(String KodeRuang) {
        int a = 0;
         for(Object obj: daftarRuangan){
            if(KodeRuang.equalsIgnoreCase(daftarRuangan.get(a).getKodeRuang())){
                break;
            }
            else {
                a++;
            }
        }
        daftarRuangan.remove(a); 
    }

    public void addDokter(sisfopasieninap.Dokter d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
