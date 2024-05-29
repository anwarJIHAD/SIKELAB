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
public class AilM {
     public Ail[] getDaftarAil() {
        Ail[] daftarAil = null;
        Ail tempAil = null;
         String pwd ="";
        String login = "root";
        Connection con = null;
        ResultSet rs =null;
        ArrayList listAil = new ArrayList();
        Akses db = new Akses("sikelab",login,pwd);
        String sql = "Select * from ail";
        try {
            
            con=db.connect();
            rs=db.executeQuery(sql);
            
            String nim = null;

            while(rs.next()){
                tempAil = new Ail();
                tempAil.setId_Ail(rs.getString("id_ail"));
                tempAil.setNama_Ail(rs.getString("nama_ail"));
                tempAil.setNo_Hp(rs.getString("no_hp"));
             
                listAil.add(tempAil);
            }
            daftarAil = new Ail[listAil.size()];
            listAil.toArray(daftarAil);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                db.disconnect();
                return daftarAil;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
     public Ail getAilById(String id_ail){
         Ail tempAil = new Ail();
        try {
          String pwd ="";
          String login = "root";
          Connection con = null;
          ResultSet rs =null;
          Akses db = new Akses("sikelab",login,pwd);
          con = db.connect();
          rs = db.executeQuery("select * from ail where id_ail = '"+id_ail+"'");
          while(rs.next()){
               tempAil.setId_Ail(rs.getString("id_ail"));
                tempAil.setNama_Ail(rs.getString("nama_ail"));
                tempAil.setNo_Hp(rs.getString("no_hp"));
          }

    } catch (Exception e) {
     // TODO Auto-generated catch block
     e.printStackTrace();
    } 
        return tempAil;
     }
}
