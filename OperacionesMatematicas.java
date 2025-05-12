
package com.mycompany.calculadora;

/**
 * @author Mishelle Nuñez
 */
public class OperacionesMatematicas {
    
    // Métodos para operaciones básicas
    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero.");
        }
        return a / b;
    }

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double raizCuadrada(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(valor);
    }
}
