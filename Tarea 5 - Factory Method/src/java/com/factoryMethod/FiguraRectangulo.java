/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.factoryMethod;

/**
 *
 * @author pablo
 */
public class FiguraRectangulo implements Figura {
    
    @Override
    public double perimetro(double lado1, double lado2, double lado3, double lado4){
        
        double perimetro = lado1 + lado2 + lado3 + lado4;
        
        return perimetro;
    }
    
    @Override
    public double area(double base, double altura, double isNull){
        
        double area = base * altura;
        
        return area;
    }
    
}
