
import com.mysql.jdbc.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harlem
 */
public class AkunDao {
    
    String url = "jdbc:mysql://localhost:3306/sikelab";
    String username = "root";
    String pwd = "";
    String sql = "SELECT * FROM akun WHERE email = ? AND password = ?";
    
    public boolean cekLogin(String email, String password){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection(url, username, pwd);
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) return true;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public String getId(String email, String password){
        String query = "SELECT id_akun FROM akun WHERE email = ? AND password = ?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection(url, username, pwd);
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) return rs.getString("id_akun");
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public String getNama(String email, String password){
        String query = "SELECT nama FROM akun WHERE email = ? AND password = ?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection(url, username, pwd);
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) return rs.getString("nama");
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public String getRole(String email, String password){
        String query = "SELECT role FROM akun WHERE email = ? AND password = ?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection(url, username, pwd);
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) return rs.getString("role");
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
//    public List<Akun> getAllAccount(){
//        List<Akun> list = new ArrayList<Akun>();
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = (Connection) DriverManager.getConnection(url, username, pwd);
//            PreparedStatement ps = con.prepareStatement("SELECT * FROM akun WHERE role = 'ail' OR = 'kalab'");
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                Akun a = new Akun();
//                a.setId_akun(rs.getString(1));
//                a.setNama(rs.getString(2));
//                a.setEmail(rs.getString(3));
//                a.setPassword(rs.getString(4));
//                a.setNo_hp(rs.getString(5));
//                a.setRole(rs.getString(6));
//                list.add(a);
//            }
//            con.close();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        return list;
//    }
}
