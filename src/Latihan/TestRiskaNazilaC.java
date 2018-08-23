/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author WINDOWS 10
 */
public class TestRiskaNazilaC {
    public static void main(String[] args) {
        RiskaNazilaC biodata = new RiskaNazilaC();
        biodata.setNamaAyah("Yuli Eko Tjahjono");
        biodata.setNamaIbu("Siti Munawaroh");
        biodata.setNamaSendiri("Riska Nazila Cahyani");
        biodata.setNamaSaudara("Tidak punya saudara");
        biodata.setAlamat("Jl Cendana No.53c");
        biodata.setHobi("Nonton Anime, Baca komik, novel, dan buku lainnya kecuali buku pelajaran");
        biodata.setCitaCita("Animator");
        biodata.setUmur(16);
        
        System.out.println("                        ^^^^^^^Biodata^^^^^^^       ");
        System.out.println("Nama Ayah    : " + biodata.getNamaAyah());
        System.out.println("Nama Ibu     : " + biodata.getNamaIbu());
        System.out.println("Nama Sendiri : " + biodata.getNamaSendiri());
        System.out.println("Nama Saudara : " + biodata.getNamaSaudara());
        System.out.println("Alamat       : " + biodata.getAlamat());
        System.out.println("Hobi         : " + biodata.getHobi());
        System.out.println("Cita - cita  : " + biodata.getHobi());
        System.out.println("Umur         : " + biodata.getUmur());
    }
}
