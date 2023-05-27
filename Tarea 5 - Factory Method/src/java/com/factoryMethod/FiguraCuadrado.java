/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.factoryMethod;

/**
 * La clase `FiguraCuadrado` es una implementación de la interfaz `Figura` para representar un cuadrado.
 */
public class FiguraCuadrado implements Figura {
    
    /**
     * El método `perimetro` calcula el perímetro de un cuadrado en base a las longitudes de sus lados.
     * @param lado1 Longitud del lado 1 del cuadrado.
     * @param lado2 Longitud del lado 2 del cuadrado.
     * @param lado3 Longitud del lado 3 del cuadrado.
     * @param lado4 Longitud del lado 4 del cuadrado.
     * @return El perímetro del cuadrado.
     */
    @Override
    public double perimetro(double lado1, double lado2, double lado3, double lado4){
        double perimetro = lado1 + lado2 + lado3 + lado4;
        return perimetro;
    }
    
    /**
     * El método `area` calcula el área de un cuadrado en base a la base y la altura proporcionadas.
     * @param base Longitud de la base del cuadrado.
     * @param altura Longitud de la altura del cuadrado.
     * @param isNull Parámetro nulo, no se utiliza en el cálculo del área del cuadrado.
     * @return El área del cuadrado.
     */
    @Override
    public double area(double base, double altura, double isNull){
        double area = base * altura;
        return area;
    }
    
}
