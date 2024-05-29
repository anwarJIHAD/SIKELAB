/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import akses.Akses;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class PembelianM {
     public Pembelian[] getDaftarPembelian() {
        Pembelian[] daftarPembelian = null;
        Pembelian tempBeli = null;
         String pwd ="";
        String login = "root";
        Connection con = null;
        ResultSet rs =null;
        ArrayList listPembelian = new ArrayList();
        Akses db = new Akses("sikelab",login,pwd);
         String sql = "Select pembelian.*, ail.nama_ail as ail, pengajuan.nama_barang as namaB,"
                + "pengajuan.jumlah as jlh, pengajuan.total_harga as tot, "
                + "pengajuan.tanggal_pengajuan as tgl, anggaran.jumlah_anggaran as anggaran, lab.ruangan as lab from pembelian, pengajuan, anggaran, lab, ail where pengajuan.id_ail=ail.id_ail and pengajuan.id_lab = lab.id_lab and pembelian.id_anggaran=anggaran.id_anggaran and pembelian.id_pengajuan = pengajuan.id_pengajuan ";
        
        try {
            
            con=db.connect();
            rs=db.executeQuery(sql);
            
            String nim = null;

            while(rs.next()){
                tempBeli = new Pembelian();
                tempBeli.setId_Pembelian(rs.getString("id_pembelian"));
                tempBeli.setId_Ail(rs.getString("ail"));
                tempBeli.setId_Pengajuan(rs.getString("namaB"));
                tempBeli.setJumlah(rs.getInt("jlh"));
                tempBeli.setTotal_Harga(rs.getInt("tot"));
                tempBeli.setId_Anggaran(rs.getString("anggaran"));
                tempBeli.setStatus(rs.getString("status"));
                tempBeli.setBukti_Pembelian(rs.getString("bukti_pembelian"));
                tempBeli.setTanggal_Pembelian(rs.getString("tanggal_pembelian"));
                 tempBeli.setTanggal_Pengajuan(rs.getString("tgl"));
                 tempBeli.setId_Lab(rs.getString("lab"));
                listPembelian.add(tempBeli);
            }
            daftarPembelian = new Pembelian[listPembelian.size()];
            listPembelian.toArray(daftarPembelian);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                db.disconnect();
                return daftarPembelian;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
     public Pembelian[] getPembelianById(String id_ail){
         Pembelian[] DaftarBeli =  null;
       
       Pembelian tempBeli = new Pembelian();
       String pwd ="";
        String login = "root";
        Connection con = null;
        ResultSet rs =null;
        ArrayList listBeli = new ArrayList();
        Akses db = new Akses("sikelab",login,pwd);
        String sql = "Select pembelian.*, pengajuan.nama_barang as namaB,"
                + "pengajuan.jumlah as jlh, pengajuan.total_harga as tot, "
                + "pengajuan.tanggal_pengajuan as tgl, anggaran.jumlah_anggaran as anggaran, lab.ruangan as lab from pembelian, pengajuan, anggaran, lab where pengajuan.id_lab = lab.id_lab and pembelian.id_anggaran=anggaran.id_anggaran and pembelian.id_pengajuan = pengajuan.id_pengajuan and pembelian.id_ail='"+id_ail+"'";
        
        try{
            con=db.connect();
            rs=db.executeQuery(sql);
            
            while(rs.next()){
                tempBeli = new Pembelian();
               tempBeli.setId_Pembelian(rs.getString("id_pembelian"));
                tempBeli.setId_Ail(rs.getString("id_ail"));
                tempBeli.setId_Pengajuan(rs.getString("namaB"));
                tempBeli.setJumlah(rs.getInt("jlh"));
                tempBeli.setTotal_Harga(rs.getInt("tot"));
                tempBeli.setId_Anggaran(rs.getString("anggaran"));
                tempBeli.setStatus(rs.getString("status"));
                tempBeli.setBukti_Pembelian(rs.getString("bukti_pembelian"));
                tempBeli.setTanggal_Pembelian(rs.getString("tanggal_pembelian"));
                 tempBeli.setTanggal_Pengajuan(rs.getString("tgl"));
                 tempBeli.setId_Lab(rs.getString("lab"));
                
                listBeli.add(tempBeli);
            }
            DaftarBeli=new Pembelian[listBeli.size()];
            listBeli.toArray(DaftarBeli);
        }
       
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                db.disconnect();
                return DaftarBeli;
            }catch(SQLException e){
                e.printStackTrace();
                return null;
            }
        }
        
     }
    public boolean update(Pembelian dtPg){
        boolean success = false;
        String pwd ="";
        String login = "root";
        Akses db = new Akses("sikelab",login,pwd);
        Connection con = null;
        String insert=null;
        try{
         insert = "update pembelian set bukti_pembelian = '"+dtPg.getBukti_Pembelian()+"' where id_pembelian= '"+dtPg.getId_Pembelian()+"'";
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
    public Pembelian getBeliById(String id_pembelian){
         Pembelian tempBeli = new Pembelian();
        try {
          String pwd ="";
          String login = "root";
          Connection con = null;
          ResultSet rs =null;
          Akses db = new Akses("sikelab",login,pwd);
          con = db.connect();
          rs = db.executeQuery("select * from pembelian where id_pembelian = '"+id_pembelian+"'");
          while(rs.next()){
              tempBeli.setId_Pembelian(rs.getString("id_pembelian"));
                tempBeli.setId_Ail(rs.getString("id_ail"));
                tempBeli.setId_Pengajuan(rs.getString("namaB"));
                tempBeli.setJumlah(rs.getInt("jlh"));
                tempBeli.setTotal_Harga(rs.getInt("tot"));
                tempBeli.setId_Anggaran(rs.getString("anggaran"));
                tempBeli.setStatus(rs.getString("status"));
                tempBeli.setBukti_Pembelian(rs.getString("bukti_pembelian"));
                tempBeli.setTanggal_Pembelian(rs.getString("tanggal_pembelian"));
                 tempBeli.setTanggal_Pengajuan(rs.getString("tgl"));
                 tempBeli.setId_Lab(rs.getString("lab"));
          }

    } catch (Exception e) {
     // TODO Auto-generated catch block
     e.printStackTrace();
    } 
        return tempBeli;
     }
    public Pembelian[] getDataBeliAil(String id_akun){
         Pembelian[] DaftarBeli =  null;
       
       Pembelian tempBeli = new Pembelian();
       String pwd ="";
        String login = "root";
        Connection con = null;
        ResultSet rs =null;
        ArrayList listBeli = new ArrayList();
        Akses db = new Akses("sikelab",login,pwd);
        String sql = "Select distinct pembelian.*, ail.nama_ail as ail, pengajuan.nama_barang as namaB,"
                + "pengajuan.jumlah as jlh, pengajuan.total_harga as tot, "
                + "pengajuan.tanggal_pengajuan as tgl, anggaran.jumlah_anggaran as anggaran, lab.ruangan as lab from pembelian,akun, pengajuan, anggaran, lab, ail where pengajuan.id_ail=ail.id_ail and pengajuan.id_lab = lab.id_lab and pembelian.id_anggaran=anggaran.id_anggaran and pembelian.id_pengajuan = pengajuan.id_pengajuan and ail.id_akun='"+id_akun+"'";
          try{
            con=db.connect();
            rs=db.executeQuery(sql);
            
            while(rs.next()){
                tempBeli = new Pembelian();
               tempBeli.setId_Pembelian(rs.getString("id_pembelian"));
                tempBeli.setId_Ail(rs.getString("ail"));
                tempBeli.setId_Pengajuan(rs.getString("namaB"));
                tempBeli.setJumlah(rs.getInt("jlh"));
                tempBeli.setTotal_Harga(rs.getInt("tot"));
                tempBeli.setId_Anggaran(rs.getString("anggaran"));
                tempBeli.setStatus(rs.getString("status"));
                tempBeli.setBukti_Pembelian(rs.getString("bukti_pembelian"));
                tempBeli.setTanggal_Pembelian(rs.getString("tanggal_pembelian"));
                 tempBeli.setTanggal_Pengajuan(rs.getString("tgl"));
                 tempBeli.setId_Lab(rs.getString("lab"));
                
                listBeli.add(tempBeli);
            }
            DaftarBeli=new Pembelian[listBeli.size()];
            listBeli.toArray(DaftarBeli);
        }
       
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                db.disconnect();
                return DaftarBeli;
            }catch(SQLException e){
                e.printStackTrace();
                return null;
            }
        }
    }
}
