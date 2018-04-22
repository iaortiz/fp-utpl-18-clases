/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**
 *
 * @author Israel
 */
/*
 La conversión de grados Celcius (C) a Fahrenheit (F) se realiza con la siguiente expresión matemática:
F = (9/5)*C+32
La conversión de Fahrenheit (F) a grados Celcius (C) se realiza con la siguiente expresión matemática:
F = (F-32)5/9
Generar la solución que permita obtener por parte de usuario el tipo de conversión que desea realizar y 
posterior presentación del resultado requerido.
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int resp;
        double F;
        double C;
        System.out.println("Escriba 1 si desea hacer conversion de Celcius a Fahrenheit o  2 para conversión de Fahrenheit a Celcius");
        resp = entrada.nextInt();

        if (resp == 1) {
            System.out.println("Ingrese los grados Celcius");
            C = entrada.nextDouble();
            F = ( (9*C)/5) + 32;
            System.out.printf("Los grados Fahrenheit son: %s \n", F);
        } else {
            if (resp == 2) {
                System.out.println("Ingrese los grados Fahrenheit");
                F = entrada.nextDouble();
                C = 5*(F-32)/9;
                System.out.printf("Los grados Fahrenheit son: %s \n", C);
            }
        }

    }

}
