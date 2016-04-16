/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import sisfopasieninap.*;

/**
 *
 * @author Ananda Faisal F
 */
public class Dokter extends Orang {
    private String JenisDokter;
    private String Keahlian;
    private String IdDokter;
    
    public Dokter (String Nama, String TanggalLahir, String Alamat, String NoTelp, String Id, String JenisKelamin, String Kwn){
        super(Nama,TanggalLahir,Alamat,NoTelp,Id,JenisKelamin,Kwn);
    }

    public String getJenisDokter() {
        return JenisDokter;
    }

    public void setJenisDokter(String JenisDokter) {
        this.JenisDokter = JenisDokter;
    }

    public String getKeahlian() {
        return Keahlian;
    }

    public void setKeahlian(String Keahlian) {
        this.Keahlian = Keahlian;
    }

    public String getIdDokter() {
        return IdDokter;
    }

    public void setIdDokter(String IdDokter) {
        this.IdDokter = IdDokter;
    }
      
    public String View() {
        return "Nama = "+super.getNama()+
                "\nTanggal Lahir   = "+super.getTanggalLahir()+
                "\nAlamat          = "+super.getAlamat()+
                "\nNo. Telpon      = "+super.getNoTelp()+
                "\nId Dokter       = "+super.getId()+
                "\nJenis Kelamin   = "+super.getJenisKelamin()+
                "\nKewarganegaraan = "+super.getKwn()+
                "\nJenis Dokter    = "+JenisDokter +
                "\nKeahlian        = "+Keahlian;
    }
}
