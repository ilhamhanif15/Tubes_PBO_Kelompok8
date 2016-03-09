/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfopasieninap;

import java.util.Date;

/**
 *
 * @author A45LB8.1
 */
public class Pasien extends Orang{
    private String idPasien;
    private Date tanggalPendaftaran;
    public Pasien (String Nama, Date TanggalLahir, String Alamat, long NoTelp, String Id, String JenisKelamin, String Kwn){
        super(Nama,TanggalLahir,Alamat,NoTelp,Id,JenisKelamin,Kwn);
    }
    public void setTanggalPendaftaran (Date tanggalPendaftaran){
        this.tanggalPendaftaran = tanggalPendaftaran;
    }
    public Date getTanggalPendaftaran(){
        return tanggalPendaftaran;
    }
    public String getIdPasien(){
        return idPasien;
    }
    
}
