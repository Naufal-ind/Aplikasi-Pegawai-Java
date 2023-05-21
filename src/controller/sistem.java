/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Naufal Indiartow
 */
public class sistem {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private String sql;
    public String nik;
     public String nama;
      public String jenis_kelamin;
       public String alamat;
        public String jabatan;
         public String no_telp;
          public String email;
          
        public void simpan()throws SQLException{
            conn = koneksi.getKoneksi();
            sql = "INSERT INTO pegawai(nik,nama,jenis_kelamin,alamat,jabatan,no_telp,email)VALUES(?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, nik);
                pst.setString(2, nama);
                    pst.setString(3, jenis_kelamin);
                        pst.setString(4, alamat);
                            pst.setString(5, jabatan);
                                pst.setString(6, no_telp);
                                    pst.setString(7, email);
                                    pst.execute();
                                    pst.close();
        }
        
        public void rubah()throws SQLException{
            conn = koneksi.getKoneksi();
            String sql = "UPDATE pegawai SET nama=?,jenis_kelamin=?,alamat=?,jabatan=?,no_telp=?,email=? WHERE nik=?";
             pst = conn.prepareStatement(sql);
                pst.setString(1, nama);
                    pst.setString(2, jenis_kelamin);
                        pst.setString(3, alamat);
                            pst.setString(4, jabatan);
                                pst.setString(5, no_telp);
                                    pst.setString(6, email);
                                                pst.setString(7, nik);
                                    pst.execute();
                                    pst.close();
            
        }
        
        public void hapus()throws SQLException{
            conn = koneksi.getKoneksi();
            String sql = "DELETE FROM pegawai WHERE nik=?";
            try{
                pst = conn.prepareStatement(sql);
                pst.setString(1, nik);
                pst.execute();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        public ResultSet UpdateJTable()throws SQLException{
            conn = koneksi.getKoneksi();
            String sql = "SELECT nik,nama,jenis_kelamin,alamat,jabatan,no_telp,email FROM pegawai";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
        }
        
        public ResultSet cari(String nama)throws SQLException{
            conn = koneksi.getKoneksi();
            String sql = "SELECT*FROM pegawai WHERE nama LIKE ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, nama + "%");
            rs = pst.executeQuery();
            return rs;
        }
    
    
}
