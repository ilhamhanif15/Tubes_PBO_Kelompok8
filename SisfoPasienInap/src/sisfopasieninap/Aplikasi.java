/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfopasieninap;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus Pc
 */
public class Aplikasi {
    private Dokter[] daftarDokter = new Dokter[5];
    private Pasien[] daftarPasien = new Pasien[5];
    private Ruangan[] daftarRuangan = new Ruangan[5];
    int nd = 0, nr = 0;
    int np = 0;
    
    public void addDokter(Dokter d){
        if (nd<5) {
         daftarDokter[nd] = d;
         nd++;
        }
    }
    
    public void addPasien(Pasien p) {
        if (np<5) {
         daftarPasien[np] = p;
         np++;
        }
    }
    
    public void addRuangan(Ruangan r) {
        if (nr<5) {
         daftarRuangan[nr] = r;
         nr++;
        }
    }
        
    public Pasien getPasien(String IdPasien) { 
        int a;
        for (a=0; a<5; a++) {
            if (IdPasien.equalsIgnoreCase(daftarPasien[a].getId())) {
                break;
            }   
        }        
        return daftarPasien[a];
    }
    
    public Pasien getPasien(int index) {
        return daftarPasien[index];
    }
        
    public void deletePasien(String IdPasien) {
        int a = 0;
        if (daftarPasien[a] == null){
            System.out.println("Data Kosong");    
        }
        for (a=0; a<5; a++) {
            if (IdPasien.equalsIgnoreCase(daftarPasien[a].getId())) {
                break;
            } 
        }
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
        np--;    
        }
    
    public Dokter getDokter(String IdDokter) { 
        int a = 0;
        for (a=0; a<5; a++) {
            if (IdDokter.equalsIgnoreCase(daftarDokter[a].getId())) {
                break;
            }
        }
        return daftarDokter[a];
    }
    
    public Dokter getDokter(int index) {
        return daftarDokter[index];
    }
    
    public void deleteDokter(String IdDokter) {
        int a = 0;
        for (a=0; a<5; a++) {
            if (IdDokter.equalsIgnoreCase(daftarDokter[a].getId())) {
                break;
            }
        }
        daftarDokter[a] = null;
            while(a<(5-a)){
               daftarDokter[a] = daftarDokter[a+1];
               a++;
            }
            if((5-a)<a && a!=4) {
               if(daftarDokter[a+1] != null ) {
               daftarDokter[a] = daftarDokter[a+1];
               daftarDokter[a+1] = null;
               a++;
               } else {
               daftarDokter[a] = null;
               a++;
               }  
            } else {
                daftarDokter[a] = null; 
            }
        nd--;    
        }
    
    public Ruangan getRuangan(String KodeRuang) { 
        int a = 0;
        for (a=0; a<5; a++) {
            if ( KodeRuang.equalsIgnoreCase(daftarRuangan[a].getKodeRuang())) {
                break;
            }
        }
        return daftarRuangan[a];
    }
    
    public Ruangan getRuangan(int index) {
        return daftarRuangan[index];
    }
    
    public void deleteRuangan(String KodeRuang) {
        int a = 0;
        for (a=0; a<5; a++) {
            if (KodeRuang.equalsIgnoreCase(daftarRuangan[a].getKodeRuang())) {
                break;
            }
        }
        daftarRuangan[a] = null;
            while(a<(5-a)){
               daftarRuangan[a] = daftarRuangan[a+1];
               a++;
            }
            if((5-a)<a && a!=4) {
               if(daftarRuangan[a+1] != null ) {
               daftarRuangan[a] = daftarRuangan[a+1];
               daftarRuangan[a+1] = null;
               a++;
               } else {
               daftarRuangan[a] = null;
               a++;
               }  
            } else {
                daftarRuangan[a] = null; 
            }
        nr--;    
        }
    
    BufferedReader inputbuff = new BufferedReader(new InputStreamReader(System.in));
    Scanner inputscan = new Scanner(System.in); 
    Scanner inputscan2 = new Scanner(System.in); 
    
    public void Menu1(){
        int ulang = 0;
        do {
        System.out.println("Menu Pasien");
        System.out.println("1. Tambahkan Data Pasien ");
        System.out.println("2. Hapus Data Pasien");
        System.out.println("3. Cari Data Pasien Lengkap");
        System.out.println("4. Tampilkan Semua Pasien");
        System.out.println("5. Kembali ke Main Menu");
        System.out.println("Pilihan : ");
        int pil = 0;
            try {
                pil = Integer.parseInt(inputbuff.readLine());
            } catch (Exception ex) {
                System.out.println("Input Error");
                Menu1();
            }
        switch (pil){
            case 1:
                System.out.println("Input Data Pasien");
                System.out.print("Nama : ");
                String nama = inputscan2.nextLine();
                System.out.print("Tanggal Lahir : ");
                String ttl = inputscan2.nextLine();
                System.out.print("Alamat : ");
                String almt = inputscan2.nextLine();
                System.out.print("No Telepon : ");
                String telp = inputscan2.nextLine();
                System.out.print("ID Pasien : "); 
                String id = inputscan2.nextLine();
                System.out.print("Jenis Kelamin : ");
                String jk = inputscan2.nextLine();
                System.out.print("Kewarganegaraan : ");
                String kwn = inputscan2.nextLine();
                System.out.print("Tanggal Pendaftaran : ");
                String tp = inputscan2.nextLine();
                Pasien p = new Pasien(nama,ttl,almt,telp,id,jk,kwn,tp);
                try {
                    addPasien(p);
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Pasien Penuh");
                    Menu1();
                }
                ulang = 1;
                break;
            case 2:
                System.out.println("Hapus Data Pasein");
                System.out.print("Masukkan ID Pasien : ");
                String idcari = null;
                try {
                    idcari = inputbuff.readLine();
                } catch (Exception e) {
                    System.out.println("Input Error");
                    Menu1();
                }
                deletePasien(idcari);
                ulang = 1;
                break;
            case 3:
                System.out.println("Cari Data Pasien");
                System.out.print("Masukkan ID Pasien : ");
                idcari = inputscan2.nextLine();
                System.out.println("Nama : "+getPasien(idcari).getNama());
                System.out.println("Tanggal Lahir : "+getPasien(idcari).getTanggalLahir());
                System.out.println("Alamat : "+getPasien(idcari).getAlamat());
                System.out.println("No Telepon : "+getPasien(idcari).getNoTelp());
                System.out.println("ID Pasien : "+getPasien(idcari).getId());
                System.out.println("Jenis Kelamin : "+getPasien(idcari).getJenisKelamin());
                System.out.println("Kewarganegaraan : "+getPasien(idcari).getKwn());
                System.out.println("Tanggal Pendaftaran : "+getPasien(idcari).getTanggalPendaftaran());
                ulang = 1;
                break;
            case 4:
                for (int a=0 ; a<5; a++) {
                    if (getPasien(a) == null) {
                    System.out.println((a+1)+". Belum Ada Pasien Terdaftar");
                    }
                    else {
                    System.out.println("--------------------------------------------------");
                    System.out.println("Data Pasien Ke-"+(a+1));
                    System.out.println("--------------------------------------------------");
                    System.out.println("Nama : "+getPasien(a).getNama());
                    System.out.println("ID Pasien : "+getPasien(a).getId());
                    System.out.println("Tanggal Pendaftaran : "+getPasien(a).getTanggalPendaftaran());
                    System.out.println("--------------------------------------------------");
                    System.out.println();
                    }
                }
                ulang = 1;
                break;
            case 5:
                MainMenu();
                ulang = 0;
                break;
            default :
                System.out.println("Input Angka Tidak tersedia");
                ulang = 1;
                break;    
        }
    }while(ulang == 1);
    }
        
    public void Menu2(){
        int ulang = 0;
        do {
        System.out.println("Menu Dokter");
        System.out.println("1. Tambahkan Data Dokter ");
        System.out.println("2. Hapus Data Dokter");
        System.out.println("3. Cari Data Dokter Lengkap");
        System.out.println("4. Tampilkan Semua Dokter");
        System.out.println("5. Kembali ke Main Menu");
        System.out.println("Pilihan : ");
        int pil = 0;
            try {
                pil = Integer.parseInt(inputbuff.readLine());
            } catch (Exception ex) {
                System.out.println("Input Error");
                Menu1();
            }
        switch (pil){
            case 1:
                System.out.println("Input Data Dokter");
                System.out.println("Nama : ");
                String nama = inputscan2.nextLine();
                System.out.println("Tanggal Lahir : ");
                String ttl = inputscan2.nextLine();
                System.out.println("Alamat : ");
                String almt = inputscan2.nextLine();
                System.out.println("No Telepon : ");
                String telp = inputscan2.nextLine();
                System.out.println("ID Dokter : "); 
                String id = inputscan2.nextLine();
                System.out.println("Jenis Kelamin : ");
                String jk = inputscan2.nextLine();
                System.out.println("Kewarganegaraan : ");
                String kwn = inputscan2.nextLine();
                System.out.println("Jenis Dokter : ");
                String jd = inputscan2.nextLine();
                System.out.println("Keahlian Dokter : ");
                String kd = inputscan2.nextLine();
                Dokter d = new Dokter(nama,ttl,almt,telp,id,jk,kwn);
                d.setJenisDokter(jd);
                d.setKeahlian(kd);
                addDokter(d);
                ulang = 1;
                break;
            case 2:
                System.out.println("Hapus Data Dokter");
                System.out.println("Masukkan ID Dokter : ");
                String idcari = inputscan2.nextLine();
                deleteDokter(idcari);
                ulang = 1;
                break;
            case 3:
                System.out.println("Cari Data Dokter");
                System.out.println("Masukkan ID Dokter : ");
                idcari = inputscan2.nextLine();
                System.out.println("Nama : "+getDokter(idcari).getNama());
                System.out.println("Tanggal Lahir : "+getDokter(idcari).getTanggalLahir());
                System.out.println("Alamat : "+getDokter(idcari).getAlamat());
                System.out.println("No Telepon : "+getDokter(idcari).getNoTelp());
                System.out.println("ID Dokter : "+getDokter(idcari).getId());
                System.out.println("Jenis Kelamin : "+getDokter(idcari).getJenisKelamin());
                System.out.println("Kewarganegaraan : "+getDokter(idcari).getKwn());
                System.out.println("Jenis Dokter : "+getDokter(idcari).getJenisDokter());
                System.out.println("Keahlian Dokter : "+getDokter(idcari).getKeahlian());
                ulang = 1;
                break;
            case 4:
                for (int a=0 ; a<5; a++) {
                    if (getDokter(a) == null) {
                    System.out.println((a+1)+". Belum Ada Dokter Terdaftar");
                    }
                    else {
                    System.out.println("--------------------------------------------------");
                    System.out.println("Data Dokter Ke-"+(a+1));
                    System.out.println("--------------------------------------------------");
                    System.out.println("Nama : "+getDokter(a).getNama());
                    System.out.println("ID Dokter : "+getDokter(a).getId());
                    System.out.println("Jenis Dokter : "+getDokter(a).getJenisDokter());
                    System.out.println("Keahlian Dokter : "+getDokter(a).getKeahlian());
                    System.out.println("--------------------------------------------------");
                    System.out.println();
                    }
                }
                ulang = 1;
                break;
            case 5:
                MainMenu();
                ulang = 0;
                break;
            }
        }while(ulang == 1);        
    }
        public void Menu3(){
            int ulang=0;
            do{
            System.out.println("Menu Ruangan dan Rawat Inap");
            System.out.println("1. Tambahkan Ruangan");
            System.out.println("2. Hapus Ruangan");
            System.out.println("3. Tampilkan Ruangan");
            System.out.println("4. Tambahkan Pasien Rawat Inap");
            System.out.println("5. Tambahkan Diagnosa pada Pasien Rawat Inap");
            System.out.println("6. Hapus Pasien Rawat Inap");
            System.out.println("7. Hapus Diagnosa Pasien Rawat Inap");
            System.out.println("8. Tampilkan Pasien Rawat Inap berdasarkan Ruangan dan Id Pasien");
            System.out.println("9. Daftar Ruangan beserta Pasiennya");
            System.out.println("10. Kembali Ke Main Menu");
            System.out.println("Pilihan : ");
            int pil = 0;
            try {
                pil = Integer.parseInt(inputbuff.readLine());
            } catch (Exception ex) {
                System.out.println("Input Error");
                Menu1();
            }
            switch (pil){
            case 1:
                System.out.println("Menu Tambah Ruangan");
                System.out.print("Kode Ruangan : ");
                String KodeRuang = inputscan2.nextLine();
                Ruangan r = new Ruangan(KodeRuang);
                try {
                    addRuangan(r);
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Ruangan Penuh");
                    Menu3();
                }
                ulang = 1;
                break;
            case 2:
                System.out.println("Hapus Ruangan");
                System.out.print("Kode Ruangan : ");
                KodeRuang = inputscan2.nextLine();
                deleteRuangan(KodeRuang);
                ulang = 1;
                break;
            case 3:
                System.out.println("Tampilkan Ruangan");
                for (int a=0;a<5;a++) {
                    if(getRuangan(a) == null){
                        System.out.println((a+1)+". Ruangan TIdak Ada");
                    }
                    else {
                        System.out.println((a+1)+". Ruang "+getRuangan(a).getKodeRuang());
                        System.out.println("Pasien Inap : ");
                        for(int b=0;b<5;b++) {
                        if (getRuangan(a).GetPasienInap(b) == null){
                            System.out.println((b+1)+". Tidak ada Pasien");
                        }else {
                            System.out.println((b+1)+". "+getRuangan(a).GetPasienInap(b).getPasien().getNama());
                        }   
                        }

                    }
                }
                ulang = 1;
                break;
            case 4:
                System.out.println("Menu Tambah Pasien Rawat Inap");
                System.out.print("Masukkan Ruangan : ");
                String ruang = inputscan2.nextLine();
                System.out.print("Masukkan ID Pasien : ");
                String idpasien = inputscan2.nextLine();
                System.out.print("Masukkan ID Dokter yang Menangani :");
                String iddokter = inputscan2.nextLine();
                getRuangan(ruang).tambahPasienInap(getPasien(idpasien),getDokter(iddokter));
                System.out.print("Jumlah Diagnosa Pasien(1-5) : ");
                int jumlah = inputscan.nextInt();
                for (int a = 0;a<jumlah;a++){
                System.out.print("                             "+(a+1)+". Diagnosa : ");
                    String diagnosa = inputscan2.nextLine();
                    getRuangan(ruang).GetPasienInap(idpasien).addDiagnosa(diagnosa);
                }
                ulang = 1;
                break;
            case 5:
                System.out.println("Tambah Diagnosa");
                System.out.print("Masukkan Kode Ruang :");
                ruang = inputscan2.nextLine();
                System.out.print("Masukkan ID Pasien : ");
                idpasien = inputscan2.nextLine();
                System.out.print("Diagnosa : ");
                String diagnosa = inputscan2.nextLine();
                getRuangan(ruang).GetPasienInap(idpasien).addDiagnosa(diagnosa);
            case 6:
                System.out.println("Menu Hapus Pasien Rawat Inap");
                System.out.print("Masukkan Ruangan : ");
                ruang = inputscan2.nextLine();
                System.out.print("Masukkan ID Pasien : ");
                idpasien = inputscan2.nextLine();
                getRuangan(ruang).RemovePasienInap(idpasien);
                System.out.println("Pasien Berhasil Dihapus");
                ulang = 1;
                break;
            case 7:
                System.out.println("Menu Hapus Diagnosa");
                System.out.print("Masukkan Ruangan : ");
                ruang = inputscan2.nextLine();
                System.out.print("Masukkan ID Pasien : ");
                idpasien = inputscan2.nextLine();
                int a = 0;
                while(getRuangan(ruang).GetPasienInap(idpasien).getDiagnosa(a) != null){
                    System.out.println((a+1)+". Diagnosa : "+getRuangan(ruang).GetPasienInap(idpasien).getDiagnosa(a));
                }
                System.out.print("Hapus Diagnosa Pasien Ke : ");
                int dg = inputscan.nextInt();
                getRuangan(ruang).GetPasienInap(idpasien).DeleteDiagnosa(dg);
                ulang = 1;
                break;
            case 8:
                a = 0;
                System.out.println("Menu Daftar Pasien Rawat Inap");
                System.out.print("Masukkan Ruangan : ");
                ruang = inputscan2.nextLine();
                System.out.print("Masukkan ID Pasien : ");
                idpasien = inputscan2.nextLine();
                System.out.println("Ruangan     : "+ruang);
                System.out.println("Nama Pasien : "+getRuangan(ruang).GetPasienInap(idpasien).getPasien().getNama());
                System.out.println("ID Pasien   : "+getRuangan(ruang).GetPasienInap(idpasien).getPasien().getId());
                System.out.println("Nama Dokter : "+getRuangan(ruang).GetPasienInap(idpasien).getDokter().getNama());
                System.out.println("ID Dokter   : "+getRuangan(ruang).GetPasienInap(idpasien).getDokter().getId());
                System.out.println("Diagnosa Pasien :");
                do{
                    System.out.println((a+1)+". "+getRuangan(ruang).GetPasienInap(idpasien).getDiagnosa(a));
                    a++;
                }while(getRuangan(ruang).GetPasienInap(idpasien).getDiagnosa(a)!=null);
                ulang = 1;
                break;
            case 9:
                System.out.println("Tampilkan Pasien Berdasarkan Ruangan");
                    a = 0;
                    while(getRuangan(a) != null){
                        System.out.println((a+1)+". Ruang "+getRuangan(a).getKodeRuang());
                        System.out.println("Pasien Inap : ");
                        for(int b=0;b<5;b++) {
                        if (getRuangan(a).GetPasienInap(b) == null){
                            break;
                        }else {
                            System.out.println((b+1)+". "+getRuangan(a).GetPasienInap(b).getPasien().getNama());
                            b++;
                        }   
                        }
                    }
                    ulang = 1;
                    break;
            case 10:
                MainMenu();
                break;
            default :
                System.out.println("Menu Tidak tersedia");
                ulang = 1;
                break;
            }
        }while(ulang == 1);
    }
        
    public void MainMenu(){
        int ulang = 1;
        do{
        System.out.println("MAIN MENU");
        System.out.println("1. Menu Pasien");
        System.out.println("2. Menu Dokter");
        System.out.println("3. Menu Ruangan dan Rawat Inap");
        System.out.println("4. Keluar");
        System.out.println("Pilihan : ");
        int pil = 0;
            try {
                pil = Integer.parseInt(inputbuff.readLine());
            } catch (Exception ex) {
                System.out.println("Input Error");
                Menu1();
            }
        switch(pil){
            case 1:
                Menu1();
                ulang = 1;
                break;
            case 2:
                Menu2();
                ulang = 1;
                break;
            case 3:
                Menu3();
                ulang = 1;
                break;
            case 4:
                System.exit(0);
                break;
        }
    } while(ulang == 1);    
    }
}
