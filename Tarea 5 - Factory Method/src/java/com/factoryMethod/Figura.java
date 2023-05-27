/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.factoryMethod;

/**
 * La interfaz `Figura` define los métodos necesarios para calcular el perímetro y el área de una figura geométrica.
 */
public interface Figura {
    
    /**
     * El método `perimetro` calcula el perímetro de la figura geométrica en base a los valores proporcionados.
     * @param v1 Valor 1 necesario para el cálculo del perímetro.
     * @param v2 Valor 2 necesario para el cálculo del perímetro.
     * @param v3 Valor 3 necesario para el cálculo del perímetro.
     * @param v4 Valor 4 necesario para el cálculo del perímetro.
     * @return El perímetro de la figura geométrica.
     */
    double perimetro(double v1, double v2, double v3, double v4);
    
    /**
     * El método `area` calcula el área de la figura geométrica en base a los valores proporcionados.
     * @param v1 Valor 1 necesario para el cálculo del área.
     * @param v2 Valor 2 necesario para el cálculo del área.
     * @param v3 Valor 3 necesario para el cálculo del área.
     * @return El área de la figura geométrica.
     */
    double area(double v1, double v2, double v3);
    
}

