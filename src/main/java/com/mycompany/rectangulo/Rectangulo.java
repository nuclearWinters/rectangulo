/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rectangulo;

/**
 *
 * @author Armando
 */
public class Rectangulo {
    public Rectangulo(double ancho, double altura){
        setAncho(ancho);
        setAltura(altura);
    }
                 
    private double ancho = 1.0;
    private double altura = 1.0;
    public void calcularPerimetro () {
        System.out.println((ancho*2)+(2*altura) + " metros.");
    }
    public void calcularArea () {
        System.out.println((ancho*altura) + " metros cuadrados.");
    }
    void setAncho (double ancho) {
        if (ancho > 0.0 && ancho < 20.0) {
            this.ancho = ancho;
        } else {
            throw new ArithmeticException("El ancho debe ser mayor a 0.0 y menor a 20.0");
        }
        
    }
    void setAltura (double altura) {
        if (altura > 0.0 && altura < 20.0) {
            this.altura = altura;
        } else {
            throw new ArithmeticException("La altura debe ser mayor a 0.0 y menor a 20.0");
        }
    }
    public static void main (String arg[]){
        Rectangulo hey = new Rectangulo(1.0, 19.0);
        hey.calcularArea();
        hey.calcularPerimetro();
    }
}
