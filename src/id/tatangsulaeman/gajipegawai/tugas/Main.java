/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.gajipegawai.tugas;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan gaji Pegawai
 */
public class Main {
    public static void main(String [] args){
        GajiPegawai dataGajiPg = new GajiPegawai();
        
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        
        dataGajiPg.setNama("Rizki Adam Kurniawan");
        dataGajiPg.setAlamat("Jalan Semar dlm 4 no 72/66");
        dataGajiPg.setUangTansport(250000);
        dataGajiPg.setUangTunjangan(300000);
        dataGajiPg.setGajiPokok(4500000);
        dataGajiPg.totalGaji(dataGajiPg.getUangTunjangan(), dataGajiPg.getUangTansport(), dataGajiPg.getGajiPokok());
        dataGajiPg.tampilData(dataGajiPg.getNama(), dataGajiPg.getAlamat(), dataGajiPg.getUangTunjangan(), dataGajiPg.getUangTansport(), dataGajiPg.getGajiPokok(), dataGajiPg.totalGaji(dataGajiPg.getUangTunjangan(), dataGajiPg.getUangTansport(), dataGajiPg.getGajiPokok()));
    }
}
