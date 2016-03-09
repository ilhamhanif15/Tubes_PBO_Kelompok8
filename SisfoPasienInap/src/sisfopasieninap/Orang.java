/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfopasieninap;

import java.util.Date;

/**
 *
 * @author Ananda Faisal F
 */
public abstract class Orang {
    private String Nama;
    private Date TanggalLahir;
    private String Alamat;
    private long NoTelp;
    private String Id;
    private String JenisKelamin;
    private String Kwn;

    public Orang(String Nama, Date TanggalLahir, String Alamat, long NoTelp, String Id, String JenisKelamin, String Kwn) {
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.Alamat = Alamat;
        this.NoTelp = NoTelp;
        this.Id = Id;
        this.JenisKelamin = JenisKelamin;
        this.Kwn = Kwn;
    }
   
    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public Date getTanggalLahir() {
        return TanggalLahir;
    }

    public void setTanggalLahir(Date TanggalLahir) {
        this.TanggalLahir = TanggalLahir;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public long getNoTelp() {
        return NoTelp;
    }

    public void setNoTelp(Long NoTelp) {
        this.NoTelp = NoTelp;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public String getKwn() {
        return Kwn;
    }

    public void setKwn(String Kwn) {
        this.Kwn = Kwn;
    }
     
}
    
