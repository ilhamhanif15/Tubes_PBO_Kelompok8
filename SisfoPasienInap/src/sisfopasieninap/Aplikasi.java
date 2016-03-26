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

/**
 *
 * @author Ananda Faisal F
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
        for (a=0; a<5; a++) {
            if (IdPasien.equalsIgnoreCase(daftarPasien[a].getId())) {
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
        int a ;
        for (a=0; a<5; a++) {
            if ( IdDokter.equalsIgnoreCase(daftarDokter[a].getId())) {
                break;
            }
        }
        daftarDokter[a] = null;
        for (int b=0;b<5;b++) {
            if (daftarDokter[b] == null) {
                while(b<(5-b)){
                    daftarDokter[b] = daftarDokter[b+1];
                    b++;
                }
            }
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
            if ( KodeRuang.equalsIgnoreCase(daftarRuangan[a].getKodeRuang())) {
                break;
            }
        }
        daftarRuangan[a] = null;
        for (int b=0;b<5;b++) {
            if (daftarRuangan[b] == null) {
                while(b<(5-b)){
                    daftarRuangan[b] = daftarRuangan[b+1];
                    b++;
                }
            }
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
        int pil = inputscan.nextInt();
        switch (pil){
            case 1:
                System.out.println("Input Data Pasien");
                System.out.println("Nama : ");
                String nama = inputscan2.nextLine();
                System.out.println("Tanggal Lahir : ");
                String ttl = inputscan2.nextLine();
                System.out.println("Alamat : ");
                String almt = inputscan2.nextLine();
                System.out.println("No Telepon : ");
                String telp = inputscan2.nextLine();
                System.out.println("ID Pasien : "); 
                String id = inputscan2.nextLine();
                System.out.println("Jenis Kelamin : ");
                String jk = inputscan2.nextLine();
                System.out.println("Kewarganegaraan : ");
                String kwn = inputscan2.nextLine();
                System.out.println("Tanggal Pendaftaran : ");
                String tp = inputscan2.nextLine();
                Pasien p = new Pasien(nama,ttl,almt,telp,id,jk,kwn,tp);
                addPasien(p);
                ulang = 1;
                break;
            case 2:
                System.out.println("Hapus Data Pasein");
                System.out.println("Masukkan ID Pasien : ");
                String idcari = inputscan2.nextLine();
                deletePasien(idcari);
                ulang = 1;
                break;
            case 3:
                System.out.println("Cari Data Pasien");
                System.out.println("Masukkan ID Pasien : ");
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
        int pil = inputscan.nextInt();
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
                System.out.println("ID Pasien : "); 
                String id = inputscan2.nextLine();
                System.out.println("Jenis Kelamin : ");
                String jk = inputscan2.nextLine();
                System.out.println("Kewarganegaraan : ");
                String kwn = inputscan2.nextLine();
                System.out.println("Jenis Dokter : ");
                String jd = inputscan2.nextLine();
                System.out.println("Keahlian Dokter : ");
                String kd = inputscan2.nextLine();
                Dokter p = new Dokter(nama,ttl,almt,telp,id,jk,kwn);
                p.setJenisDokter(jd);
                p.setKeahlian(kd);
                addDokter(p);
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
                    if (getPasien(a) == null) {
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
            System.out.println("5. Hapus Pasien Rawat Inap");
            System.out.println("6. Tampilkan Pasien Rawat Inap");
            System.out.println("7. Kembali Ke Main Menu");
            System.out.println("Pilihan : ");
            int pil = inputscan.nextInt();
            switch (pil){
            case 1:
                System.out.println("Menu Tambah Ruangan");
                System.out.print("Kode Ruangan : ");
                String KodeRuang = inputscan2.nextLine();
                Ruangan r = new Ruangan(KodeRuang);
                addRuangan(r);
                ulang = 1;
                break;
            case 2:
                System.out.println("Hapus Ruangan");
                System.out.println("Kode Ruangan : ");
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
                System.out.println("Masukkan Ruangan : ");
                String ruang = inputscan2.nextLine();
                System.out.println("Masukkan ID Pasien : ");
                String idpasien = inputscan2.nextLine();
                System.out.println("Masukkan ID Dokter yang Menangani :");
                String iddokter = inputscan2.nextLine();
                getRuangan(ruang).tambahPasienInap(getPasien(idpasien),getDokter(iddokter));
                System.out.println("Jumlah Diagnosa Pasien(1-5) : ");
                int jumlah = inputscan.nextInt();
                for (int a = 0;a<jumlah;a++){
                    System.out.println((a+1)+". Diagnosa : ");
                    String diagnosa = inputscan2.nextLine();
                    getRuangan(ruang).GetPasienInap(idpasien).addDiagnosa(diagnosa);
                }
                ulang = 1;
                break;
           
            case 5:
                System.out.println("Menu Hapus Pasien Rawat Inap");
                System.out.println("Masukkan Ruangan : ");
                ruang = inputscan2.nextLine();
                System.out.println("Masukkan ID Pasien : ");
                idpasien = inputscan2.nextLine();
                getRuangan(ruang).RemovePasienInap(idpasien);
                System.out.println("Pasien Berhasil Dihapus");
                ulang = 1;
                break;
            case 6:
                int a = 0;
                System.out.println("Menu Daftar Pasien Rawat Inap");
                System.out.println("Masukkan Ruangan : ");
                ruang = inputscan2.nextLine();
                System.out.println("Masukkan ID Pasien : ");
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
            case 7:
                MainMenu();
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
        int pil = inputscan.nextInt();
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
                ulang = 0;
                break;
        }
    } while(ulang == 1);    
    }
}

