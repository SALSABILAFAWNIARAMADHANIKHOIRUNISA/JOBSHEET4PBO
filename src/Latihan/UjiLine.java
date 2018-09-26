/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Hp
 */
public class UjiLine {
    public static void main(String [] args){
        Line line = new Line(13, 37, 28, 4);
        Line line2 = new Line(34, 23, 16, 9);
        
        System.out.println("Panjang Angka Objek 1 = " + line.getLength());
        System.out.println("Panjang Angka Objek 2 = " + line2.getLength());
        System.out.println(" ");
        
        System.out.println("Perbandingan Objek 1 > Objek 2 = "+line.isGreater(line,line2));
        System.out.println("Perbandingan Objek 1 < Objek 2 = "+line.isLess(line,line2));
       
    }
}
