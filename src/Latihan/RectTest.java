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
public class RectTest {
    public static void main(String[]args){
        Rect r1 = new Rect(1,1,4,4);
        Rect r2 = new Rect(2,3,5,6);
        Rect a = r1.union(r2);
        Rect b = r1.intersection(r2);
        
        if (r2.isInside(r2.x1, r2.y1)==true)
            System.out.println("<"+r2.x1+","+r2.y1+"> is inside the Union");
        System.out.println(r1+" union "+r2+ " = "+a);
        System.out.println(r1+" intersect "+r2+" = "+b);
    }
}
