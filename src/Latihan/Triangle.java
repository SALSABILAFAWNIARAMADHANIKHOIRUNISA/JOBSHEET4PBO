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
public class Triangle extends Shape {
//private member variables
    private int base;
    private int height; 
    //construktor
    public Triangle(String color, int base, int height){
        super(color);
        this.base = base;
        this.height = height;
    }
    @Override
    public String toString(){
        return"Triangle[base =" + base + ", height = " + height + "," + super.toString() + "]";
    }
    //override the inherited getArea()
    @Override
    public double getArea(){
        return 0.5*base*height;
    }
}