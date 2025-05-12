
package com.mycompany.calculadora;

/**
 * @author Mishelle Nuñez
 */
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        //Instancias
        OperacionesMatematicas calculo = new OperacionesMatematicas(); 
        Scanner ingreso = new Scanner(System.in);
        boolean salir = false;
        char opcion;
        //Menu de opciones
        do{
        System.out.println("--- CALCULADORA ---");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Potencia");
        System.out.println("6. Raiz cuadrada");
        System.out.println("7. Salir");
        System.out.println("8. Salir");
        opcion =ingreso.next().charAt(0);
        
        
            switch (opcion){
                case '1':
                    System.out.println("Ingrese el primer valor: ");
                    double a1 = ingreso.nextDouble();
                    System.out.println("Ingrese el segundo valor: ");
                    double b1 = ingreso.nextDouble();
                    System.out.println("Resultado: "+ calculo.sumar(a1, b1));
                    break;
                case '2':
                    System.out.println("Ingrese el primer valor: ");
                    double a2 = ingreso.nextDouble();
                    System.out.println("Ingrese el segundo valor: ");
                    double b2 = ingreso.nextDouble();
                    System.out.println("Resultado: "+ calculo.restar(a2, b2));
                    break;
                case '3':
                    System.out.println("Ingrese el primer valor: ");
                    double a3 = ingreso.nextDouble();
                    System.out.println("Ingrese el segundo valor: ");
                    double b3 = ingreso.nextDouble();
                    System.out.println("Resultado: "+ calculo.multiplicar(a3, b3));
                    break;
                case '4':
                    System.out.println("Ingrese el primer valor: ");
                    double a4 = ingreso.nextDouble();
                    System.out.println("Ingrese el segundo valor: ");
                    double b4 = ingreso.nextDouble();
                    System.out.println("Resultado: "+ calculo.dividir(a4, b4));
                    break;
                case '5':
                    System.out.println("Ingrese la base: ");
                    double base = ingreso.nextDouble();
                    System.out.println("Ingrese el exponente: ");
                    double exponente = ingreso.nextDouble();
                    System.out.println("Resultado: "+ calculo.potencia(base, exponente));
                    break;
                case '6':
                    System.out.println("Ingrese el valor: ");
                    double valor = ingreso.nextDouble();
                    System.out.println("Resultado: "+ calculo.raizCuadrada(valor));
                    break;
                case '7':
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
        }
        }while(opcion !='8');
        
    ingreso.close();
    System.out.println(" -_- ");
   }
}

