/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.factoryMethod;

/**
 * La clase `FiguraCirculo` es una implementación de la interfaz `Figura` para representar un círculo.
 */
public class FiguraCirculo implements Figura {
    
    /**
     * El método `perimetro` calcula el perímetro de un círculo en base al diámetro proporcionado.
     * @param diametro El diámetro del círculo.
     * @param isnull1 Parámetro nulo, no se utiliza en el cálculo del perímetro del círculo.
     * @param isnull2 Parámetro nulo, no se utiliza en el cálculo del perímetro del círculo.
     * @param isnull3 Parámetro nulo, no se utiliza en el cálculo del perímetro del círculo.
     * @return El perímetro del círculo.
     */
    @Override
    public double perimetro(double diametro, double isnull1, double isnull2, double isnull3){
        double perimetro = 3.1416 * diametro;
        return perimetro;
    }
    
    /**
     * El método `area` calcula el área de un círculo en base al perímetro y al radio proporcionados.
     * @param perimetro El perímetro del círculo.
     * @param radio El radio del círculo.
     * @param isNull Parámetro nulo, no se utiliza en el cálculo del área del círculo.
     * @return El área del círculo.
     */
    @Override
    public double area(double perimetro, double radio, double isNull){
        double area = (perimetro * radio) / 2;
        return area;
    }
    
}
