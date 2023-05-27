/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.factoryMethod;

/**
 * La clase `AreaFactory` es responsable de calcular el área de diferentes figuras geométricas utilizando el método Factory.
 */
public class AreaFactory {
        /**
     * El método `obtenerArea` calcula el área de una figura geométrica específica en base a los valores proporcionados.
     * @param v1 Valor 1 necesario para el cálculo del área.
     * @param v2 Valor 2 necesario para el cálculo del área.
     * @param v3 Valor 3 necesario para el cálculo del área.
     * @param tipoFigura Tipo de figura geométrica para la cual se desea calcular el área.
     * @return El área de la figura geométrica.
     */
    
    public double obtenerArea(double v1, double v2, double v3, TipoFigura tipoFigura){
        double area = 0;
        
        switch(tipoFigura){
        case TRIANGULO:
            FiguraTriangulo figuraTriangulo = new FiguraTriangulo();
            area = figuraTriangulo.area(v1, v2, v3);
            break;
        case CUADRADO:
            FiguraCuadrado figuraCuadrado = new FiguraCuadrado();
            area = figuraCuadrado.area(v1, v2, v3);
            break;
        case ROMBO:
            FiguraRombo figuraRombo = new FiguraRombo();
            area = figuraRombo.area(v1, v2, v3);
            break;
        case TRAPECIO:
            FiguraTrapecio figuraTrapecio = new FiguraTrapecio();
            area = figuraTrapecio.area(v1, v2, v3);
            break;
        case CIRCULO:
            FiguraCirculo figuraCirculo = new FiguraCirculo();
            area = figuraCirculo.area(v1, v2, v3);
            break;
        case RECTANGULO:
            FiguraRectangulo figuraRectangulo = new FiguraRectangulo();
            area = figuraRectangulo.area(v1, v2, v3);
            break;
        }
        
        return area;
    }
    
}
