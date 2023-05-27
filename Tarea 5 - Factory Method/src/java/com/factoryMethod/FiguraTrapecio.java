/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.factoryMethod;

/**
 *
 * @author pablo
 */
public class FiguraTrapecio implements Figura {
    
    @Override
    public double perimetro(double lado1, double lado2, double lado3, double lado4){
        
        double perimetro = lado1 + lado2 + lado3 + lado4;
        
        return perimetro;
    }
    
    @Override
    public double area(double baseMayor, double baseMenor, double altura){
        
        double area = ((baseMayor + baseMenor) * altura) / 2;
        
        return area;
    }
    
}
