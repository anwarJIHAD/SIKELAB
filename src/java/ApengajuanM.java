
import akses.Akses;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Pengajuan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS TUF GAMING
 */
public class ApengajuanM {
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
   
}
