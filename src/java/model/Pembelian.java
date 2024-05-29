/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ASUS
 */
public class Pembelian {
    private String id_pembelian;
    private String id_ail;
    private String id_lab;
    private String id_pengajuan;
    private String id_anggaran;
    private String status;
    private String bukti_pembelian;
    private String tanggal_pembelian;
    private int jumlah;
    private int total_harga;
    private String tanggal_pengajuan;
    public String getId_Pembelian() {
        return id_pembelian;
    }

    public void setId_Pembelian(String id_pembelian) {
        this.id_pembelian = id_pembelian;
    }
    public String getId_Ail() {
        return id_ail;
    }

    public void setId_Ail(String id_ail) {
        this.id_ail = id_ail;
    }
     public String getId_Pengajuan() {
        return id_pengajuan;
    }

    public void setId_Pengajuan(String id_pengajuan) {
        this.id_pengajuan = id_pengajuan;
    }
     public String getId_Anggaran() {
        return id_anggaran;
    }

    public void setId_Anggaran(String id_anggaran) {
        this.id_anggaran = id_anggaran;
    }
      public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
      public String getBukti_Pembelian() {
        return bukti_pembelian;
    }

    public void setBukti_Pembelian(String bukti_pembelian) {
        this.bukti_pembelian = bukti_pembelian;
    }
      public String getTanggal_Pembelian() {
        return tanggal_pembelian;
    }

    public void setTanggal_Pembelian(String tanggal_pembelian) {
        this.tanggal_pembelian = tanggal_pembelian;
    }
    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public int getTotal_Harga() {
        return total_harga;
    }

    public void setTotal_Harga(int total_harga) {
        this.total_harga = total_harga;
    }
    public String getTanggal_Pengajuan() {
        return tanggal_pengajuan;
    }

    public void setTanggal_Pengajuan(String tanggal_pengajuan) {
        this.tanggal_pengajuan = tanggal_pengajuan;
    }
     public String getId_Lab() {
        return id_lab;
    }

    public void setId_Lab(String id_lab) {
        this.id_lab = id_lab;
    }
}
