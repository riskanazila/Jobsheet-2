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
public class Bus {
    private double penumpang;
    private double maxPenumpang;
    private double penumpangBaru;
    private double counter;
    
    public Bus (double maxPenumpang)
    {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    
    public void addpenupang (double penumpang)
    {
        double temp;
        temp = this.penumpang+penumpang;
        if(temp >= maxPenumpang)
        {
            System.out.println("Penumpang Melebihi kuota");
        }
        else
        {
            this.penumpang = temp;
            counter++;
        }
    }
    
    
    public void getpenumpang(double password)
    {
        if (password == 123)
        {
            System.out.println("\nPassword Benar");
        }
        else
        {
            System.out.println("\nPassword Salah");
        }
    }
    public double getAverage()
    {
        return penumpang/counter;
    }
    public void cetak()
    {
        System.out.println("Penumpang Bus sekarang adalah "+penumpang);
        System.out.println("Penumpang maksimum seharusnya "+maxPenumpang);
    }
}
