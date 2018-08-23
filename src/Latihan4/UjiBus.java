/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author WINDOWS 10
 */
public class UjiBus {
    public static void main(String[] args) {
        Bus Bus = new Bus(5);
        Bus.getPenumpang(17);
        Bus.getPenumpang(24);
        Bus.cetakPenumpang();
        
        Bus.addpenumpang (2);
        Bus.cetakPenumpang();
        
        Bus.addpenumpang (1);
        Bus.cetakPenumpang();
        
        Bus.addpenumpang (2);
        Bus.cetakPenumpang();
        
        Bus.addpenumpang (2);
        Bus.cetakPenumpang();
        
    }
}
