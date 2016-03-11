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
public class Pasien extends Orang{
    private String idPasien;
    private String tanggalPendaftaran;
    public Pasien (String Nama, String TanggalLahir, String Alamat, String NoTelp, String Id, String JenisKelamin, String Kwn, String tanggalPendaftaran){
        super(Nama,TanggalLahir,Alamat,NoTelp,Id,JenisKelamin,Kwn);
        setTanggalPendaftaran(tanggalPendaftaran);
    }
    public void setTanggalPendaftaran (String tanggalPendaftaran){
        this.tanggalPendaftaran = tanggalPendaftaran;
    }
    public String getTanggalPendaftaran(){
        return tanggalPendaftaran;
    }
    public String getIdPasien(){
        return idPasien;
    }
    
}
