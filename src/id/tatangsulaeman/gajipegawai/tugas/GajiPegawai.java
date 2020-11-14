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
public class GajiPegawai {
    private String nama,alamat;
    private int uangTansport,uangTunjangan,gajiPokok,totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTansport() {
        return uangTansport;
    }

    public void setUangTansport(int uangTansport) {
        this.uangTansport = uangTansport;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }

    public int totalGaji(int uangTunjangan,int uangTransport,int gajiPokok){
        return uangTunjangan + uangTransport + gajiPokok;
    }
    
    public void tampilData(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok, int gajiTotal){
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Uang Transport : Rp. " + uangTransport);
        System.out.println("Uang Tunjangan : Rp. " + uangTunjangan);
        System.out.println("Gaji Pokok : Rp. " + gajiPokok);
        System.out.println("TOTAL GAJI : Rp. " + gajiTotal);
    }
}
