/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Naufal Indiartow
 */
public class coba {
    public static void main(String[]args){
        int hasil,bilsatu,bildua;
        
        System.out.println("coba penjumlahan");
        System.out.println("bilsatu = ");
        bilsatu = new Scanner(System.in).nextInt();
         System.out.println("bildua = ");
        bildua = new Scanner(System.in).nextInt();
        hasil = bilsatu+bildua;
        System.out.println("Hasil Penjumlahan= " + hasil);
        
    }
    
}
