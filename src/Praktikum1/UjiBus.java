/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author WINDOWS 10
 */
public class UjiBus {
    public static void main(String[] args) {
        int password;
        
        Bus busBesar = new Bus(40);
        busBesar.cetak();
        
        busBesar.getpenumpang (123);
        busBesar.cetak();
        
        busBesar.getpenumpang (121);
        busBesar.cetak();
        
        busBesar.getpenumpang (123);
        busBesar.cetak();
        
        System.out.println("Rata-rata Penumpang : "+busBesar.getAverage());
    }
}
