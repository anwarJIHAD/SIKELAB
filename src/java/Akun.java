/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harlem
 */
public class Akun {
    public String id_akun, nama, email, password, no_hp, role;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId_akun(String id_akun) {
        this.id_akun = id_akun;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public String getId_akun() {
        return id_akun;
    }

    public String getNama() {
        return nama;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
}
