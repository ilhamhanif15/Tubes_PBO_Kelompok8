/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfopasieninap;

/**
 *
 * @author Asus Pc
 */
public class SisfoPasienInap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ruangan r = new Ruangan();
        r.setKodeRuang("MELATI");
        Pasien p1 = new Pasien("Elvis","20-03-92","Jalan Gamelan no 25","08122344561","ELVIS","Laki-laki","USA","13-03-2010");
        Dokter d1 = new Dokter("DR.Andi","28-08-87","Jalan Guling no 7","08132134556","ANDI","Laki-laki","IDN");
        Pasien p2 = new Pasien("Scott","02-02-90","Jalan Odading no 20","08723451132","SCT","Laki-laki","AUS","02-03-2010");
        Dokter d2 = new Dokter("DR.Raisya","09-10-89","Jalan Piano no 22","08123454474","RYS","Perempuan","IDN");
        Pasien p3 = new Pasien("Sari","10-02-96","Jalan Kenangan no 1","08982733114","SR","Perempuan","IDN","02-08-2010");
        Dokter d3 = new Dokter("DR.Cokki","09-09-89","Jalan Batagor no 5","08321349982","CKK","Laki-laki","IDN");
        r.tambahPasienInap(p1,d1);
        r.tambahPasienInap(p2,d2);
        r.tambahPasienInap(p3,d3);
        r.GetPasienInap(0).addDiagnosa("Pecah Kepribadian"); //getPasienInap Menggunakan index
        r.GetPasienInap("ELVIS").addDiagnosa("Bisul di pantat");  //getPasienInap Menggunakan String IdPasien
        r.GetPasienInap(2).addDiagnosa("Susah Move On");  
        r.GetPasienInap("SCT").addDiagnosa("Kurang Tidur");
        r.GetPasienInap(0).getDokter().setJenisDokter("Umum");
        r.GetPasienInap(1).getDokter().setJenisDokter("Khusus");
        r.GetPasienInap(2).getDokter().setJenisDokter("Spesial");
        r.GetPasienInap(0).getDokter().setKeahlian("Ahli Psikologi dan Kandungan");
        r.GetPasienInap(1).getDokter().setKeahlian("Ahli Bedah");
        r.GetPasienInap(2).getDokter().setKeahlian("Ahli Psikologi");
        for (int a=0 ; a<5; a++) {
            if (r.GetPasienInap(a) == null) {
                System.out.println((a+1)+". Belum Ada Pasien Terdaftar");
            }
            else {
                System.out.println("Data Pasien Inap Ke-"+(a+1)+" Di Ruang "+r.getKodeRuang());
                System.out.println("--------------------------------------------------");
                System.out.println("Nama : "+r.GetPasienInap(a).getPasien().getNama());
                System.out.println("Tanggal Lahir : "+r.GetPasienInap(a).getPasien().getTanggalLahir());
                System.out.println("Alamat : "+r.GetPasienInap(a).getPasien().getAlamat());
                System.out.println("Nomor Telepon : "+r.GetPasienInap(a).getPasien().getNoTelp());
                System.out.println("ID Pasien : "+r.GetPasienInap(a).getPasien().getId());
                System.out.println("Jenis Kelamin : "+r.GetPasienInap(a).getPasien().getJenisKelamin());
                System.out.println("Kewarganegaraan : "+r.GetPasienInap(a).getPasien().getKwn());
                System.out.println("Tanggal Pendaftaran : "+r.GetPasienInap(a).getPasien().getTanggalPendaftaran());
                for (int b=0; b<5 ;b++) {
                    if (r.GetPasienInap(a).getDiagnosa(b) != null) {
                        System.out.println("Diagnosa Ke-"+(b+1)+" = "+r.GetPasienInap(a).getDiagnosa(b));
                    }
                } 
                System.out.println("-----------------------------------------------------");
                System.out.println("DATA DOKTER YANG MENANGANI");
                System.out.println("Nama : "+r.GetPasienInap(a).getDokter().getNama());
                System.out.println("Jenis Dokter : "+r.GetPasienInap(a).getDokter().getJenisDokter());
                System.out.println("Keahlian  : "+r.GetPasienInap(a).getDokter().getKeahlian());
                System.out.println("Tanggal Lahir : "+r.GetPasienInap(a).getDokter().getTanggalLahir());
                System.out.println("Alamat : "+r.GetPasienInap(a).getDokter().getAlamat());
                System.out.println("Nomor Telepon : "+r.GetPasienInap(a).getDokter().getNoTelp());
                System.out.println("ID Dokter : "+r.GetPasienInap(a).getDokter().getId());
                System.out.println("Jenis Kelamin : "+r.GetPasienInap(a).getDokter().getJenisKelamin());
                System.out.println("Kewarganegaraan : "+r.GetPasienInap(a).getDokter().getKwn());
                System.out.println("-----------------------------------------------------");
                System.out.println("");
            }
        }
        r.RemovePasienInap(2);
        r.GetPasienInap(0).DeleteDiagnosa(0);
        System.out.println("");
        System.out.println("SETELAH PENGHAPUSAN PADA PASIEN KE-3");
        System.out.println("SETELAH PENGHAPUSAN DIAGNOSA PADA PASIEN KE-1");
        for (int a=0 ; a<5; a++) {
            if (r.GetPasienInap(a) == null) {
                System.out.println((a+1)+". Belum Ada Pasien Terdaftar");
            }
            else {
                System.out.println("Data Pasien Inap Ke-"+(a+1)+" Di Ruang "+r.getKodeRuang());
                System.out.println("--------------------------------------------------");
                System.out.println("Nama : "+r.GetPasienInap(a).getPasien().getNama());
                System.out.println("Tanggal Lahir : "+r.GetPasienInap(a).getPasien().getTanggalLahir());
                System.out.println("Alamat : "+r.GetPasienInap(a).getPasien().getAlamat());
                System.out.println("Nomor Telepon : "+r.GetPasienInap(a).getPasien().getNoTelp());
                System.out.println("ID Pasien : "+r.GetPasienInap(a).getPasien().getId());
                System.out.println("Jenis Kelamin : "+r.GetPasienInap(a).getPasien().getJenisKelamin());
                System.out.println("Kewarganegaraan : "+r.GetPasienInap(a).getPasien().getKwn());
                System.out.println("Tanggal Pendaftaran : "+r.GetPasienInap(a).getPasien().getTanggalPendaftaran());
                for (int b=0; b<5 ;b++) {
                    if (r.GetPasienInap(a).getDiagnosa(b) != null) {
                        System.out.println("Diagnosa Ke-"+(b+1)+" = "+r.GetPasienInap(a).getDiagnosa(b));
                    }
                }
                System.out.println("-----------------------------------------------------");
                System.out.println("DATA DOKTER YANG MENANGANI");
                System.out.println("Nama : "+r.GetPasienInap(a).getDokter().getNama());
                System.out.println("Jenis Dokter : "+r.GetPasienInap(a).getDokter().getJenisDokter());
                System.out.println("Keahlian  : "+r.GetPasienInap(a).getDokter().getKeahlian());
                System.out.println("Tanggal Lahir : "+r.GetPasienInap(a).getDokter().getTanggalLahir());
                System.out.println("Alamat : "+r.GetPasienInap(a).getDokter().getAlamat());
                System.out.println("Nomor Telepon : "+r.GetPasienInap(a).getDokter().getNoTelp());
                System.out.println("ID Dokter : "+r.GetPasienInap(a).getDokter().getId());
                System.out.println("Jenis Kelamin : "+r.GetPasienInap(a).getDokter().getJenisKelamin());
                System.out.println("Kewarganegaraan : "+r.GetPasienInap(a).getDokter().getKwn());
                System.out.println("-----------------------------------------------------");
                System.out.println("");
            }
        }
    }
    
}
