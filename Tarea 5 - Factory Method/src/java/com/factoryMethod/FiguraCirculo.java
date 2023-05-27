/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.factoryMethod;

/**
 *
 * @author pablo
 */
public class FiguraCirculo implements Figura {
    
    @Override
    public double perimetro(double diametro, double isnull1, double isnull2, double isnull3){
        
        double perimetro = 3.1416 * diametro;
        
        return perimetro;
    }
    
    @Override
    public double area(double perimetro, double radio, double isNull){
        
        double area = (perimetro * radio) / 2;
        
        return area;
    }
    
}
