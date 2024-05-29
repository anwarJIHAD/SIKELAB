/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import akses.Akses;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class PengajuanM {
     public Pengajuan[] getDaftarPengajuan() {
        Pengajuan[] daftarPengajuan = null;
        Pengajuan tempAju = null;
         String pwd ="";
        String login = "root";
        Connection con = null;
        ResultSet rs =null;
        ArrayList listAju = new ArrayList();
        Akses db = new Akses("sikelab",login,pwd);
        String sql = "Select pengajuan.*, ail.nama_ail as ail from pengajuan, ail where pengajuan.id_ail=ail.id_ail";
        try {
            
            con=db.connect();
            rs=db.executeQuery(sql);
            

            while(rs.next()){
                tempAju = new Pengajuan();
                tempAju.setId_Pengajuan(rs.getString("id_pengajuan"));
                tempAju.setId_Ail(rs.getString("ail"));
                tempAju.setStatus(rs.getString("status"));
                tempAju.setNama_Barang(rs.getString("nama_barang"));
                tempAju.setJumlah(rs.getInt("jumlah"));
                tempAju.setHarga(rs.getInt("harga"));
                tempAju.setTotal_Harga(rs.getInt("total_harga"));
                tempAju.setTanggal_Pengajuan(rs.getString("tanggal_pengajuan"));
                tempAju.setId_Lab(rs.getString("id_lab"));
                listAju.add(tempAju);
            }
            daftarPengajuan = new Pengajuan[listAju.size()];
            listAju.toArray(daftarPengajuan);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                db.disconnect();
                return daftarPengajuan;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
     
     public Pengajuan getPengajuanById(String id_pengajuan){
         Pengajuan tempAju = new Pengajuan();
        try {
          String pwd ="";
          String login = "root";
          Connection con = null;
          ResultSet rs =null;
          Akses db = new Akses("sikelab",login,pwd);
          con = db.connect();
          rs = db.executeQuery("select pengajuan.*, ail.nama_ail as nama, lab.ruangan as lab from pengajuan, lab, ail where pengajuan.id_ail=ail.id_ail and pengajuan.id_lab=lab.id_lab and id_pengajuan = '"+id_pengajuan+"'");
          while(rs.next()){
               tempAju.setId_Pengajuan(rs.getString("id_pengajuan"));
                tempAju.setId_Ail(rs.getString("nama"));
                tempAju.setStatus(rs.getString("status"));
                tempAju.setNama_Barang(rs.getString("nama_barang"));
                tempAju.setJumlah(rs.getInt("jumlah"));
                tempAju.setHarga(rs.getInt("harga"));
                tempAju.setTotal_Harga(rs.getInt("total_harga"));
                tempAju.setTanggal_Pengajuan(rs.getString("tanggal_pengajuan"));
                tempAju.setId_Lab(rs.getString("lab"));
          }

    } catch (Exception e) {
     // TODO Auto-generated catch block
     e.printStackTrace();
    } 
        return tempAju;
     }
     
     public Pengajuan getPengajuanAIL(String id_pengajuan){
         Pengajuan tempAju = new Pengajuan();
        try {
          String pwd ="";
          String login = "root";
          Connection con = null;
          ResultSet rs =null;
          Akses db = new Akses("sikelab",login,pwd);
          con = db.connect();
          rs = db.executeQuery("select pengajuan.* from pengajuan where id_pengajuan='"+id_pengajuan+"'");
          while(rs.next()){
               tempAju.setId_Pengajuan(rs.getString("id_pengajuan"));
                tempAju.setId_Ail(rs.getString("nama"));
                tempAju.setStatus(rs.getString("status"));
                tempAju.setNama_Barang(rs.getString("nama_barang"));
                tempAju.setJumlah(rs.getInt("jumlah"));
                tempAju.setHarga(rs.getInt("harga"));
                tempAju.setTotal_Harga(rs.getInt("total_harga"));
                tempAju.setTanggal_Pengajuan(rs.getString("tanggal_pengajuan"));
                tempAju.setId_Lab(rs.getString("lab"));
          }

    } catch (Exception e) {
     // TODO Auto-generated catch block
     e.printStackTrace();
    } 
        return tempAju;
     }
     
      public boolean update1(Pengajuan dtPg){
        boolean success = false;
        String pwd ="";
        String login = "root";
        Akses db = new Akses("sikelab",login,pwd);
        Connection con = null;
        String update=null;
        try{
         update = "update pengajuan set nama_barang = '"+dtPg.getNama_Barang()+"',jumlah='"+dtPg.getJumlah()+"',harga='"+dtPg.getHarga()+"',total_harga='"+dtPg.getTotal_Harga()+"'where id_pengajuan= '"+dtPg.getId_Pengajuan()+"'";
        con=db.connect();
        int baris = db.executeUpdate(update);
        if(baris>0)success = true;
        } 
        catch(ClassNotFoundException e){
             e.printStackTrace();
         } catch (SQLException e) {
             e.printStackTrace();
         }
        finally{
           try{
               db.disconnect();
               
           }
           catch(SQLException e){
               e.printStackTrace();
           }
        }
        return success;
     }
     
     public boolean update(Pengajuan dtPg){
        boolean success = false;
        String pwd ="";
        String login = "root";
        Akses db = new Akses("sikelab",login,pwd);
        Connection con = null;
        String insert=null;
        try{
         insert = "update pengajuan set status = '"+dtPg.getStatus()+"' where id_pengajuan= '"+dtPg.getId_Pengajuan()+"'";
        con=db.connect();
        int baris = db.executeUpdate(insert);
        if(baris>0)success = true;
        } 
        catch(ClassNotFoundException e){
             e.printStackTrace();
         } catch (SQLException e) {
             e.printStackTrace();
         }
        finally{
           try{
               db.disconnect();
               
           }
           catch(SQLException e){
               e.printStackTrace();
           }
        }
        return success;
     }
}
