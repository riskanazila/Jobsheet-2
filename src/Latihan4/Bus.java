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
public class Bus {
    public int penumpang;
    public int maxPenumpang;
    
    public Bus(int maxPenumpang)
    {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    public void addpenumpang (int penumpang)
    {
        int temp;
        temp = this.penumpang+penumpang;
        if (temp > maxPenumpang)
        {
            System.out.println("Penumpang melebihi kuota");
        }
        else
        {
            this.penumpang = temp;
        }
    }
    public void getPenumpang (int password)
    {
        if (password==24)
        {
            System.out.println("Pasword Benar");
        }
        else
        {
            System.out.println("Password Salah");
        }
    }
    public void cetakPenumpang()
    {
        System.out.println("Penumpang Bus sekarang = "+penumpang);
        System.out.println("Maksimum Penumpang yang seharusnya adalah = "+maxPenumpang);
    }
}
