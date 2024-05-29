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
public class Pengajuan {
    private String id_pengajuan;
    private String id_ail;
    private String status;
    private String nama_barang;
    private String tanggal_pengajuan;
    private int jumlah;
    private int harga;
    private int total_harga;
    private String id_lab;
  public String getId_Pengajuan() {
        return id_pengajuan;
    }

    public void setId_Pengajuan(String id_pengajuan) {
        this.id_pengajuan = id_pengajuan;
    }
    public String getId_Ail() {
        return id_ail;
    }

    public void setId_Ail(String id_ail) {
        this.id_ail = id_ail;
    }
     public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
     public String getNama_Barang() {
        return nama_barang;
    }

    public void setNama_Barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }
     
    
      public String getTanggal_Pengajuan() {
        return tanggal_pengajuan;
    }

    public void setTanggal_Pengajuan(String tanggal_pengajuan) {
        this.tanggal_pengajuan = tanggal_pengajuan;
    }
      public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
      public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
      public int getTotal_Harga() {
        return total_harga;
    }

    public void setTotal_Harga(int total_harga) {
        this.total_harga = total_harga;
    }
     public String getId_Lab() {
        return id_lab;
    }

    public void setId_Lab(String id_lab) {
        this.id_lab = id_lab;
    }
}
