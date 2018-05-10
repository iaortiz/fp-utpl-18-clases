/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

import java.util.Scanner;

/**
 *
 * @author Israel
 */
public class Edades {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int limite = 0;
        int contador = 1;
        int suma = 0;
        int edad = 0;
        String cadenafinal = String.format("%s\t%s\n", "Edad", "Suma");
        System.out.println("Ingrese el número de edades");
        limite = entrada.nextInt();
        while (contador <= limite) {
            //   System.out.println("Ingrese la edad");
            edad = entrada.nextInt();
            suma = edad + suma;
            //  System.out.printf("%d\t%d\n", edad, suma);
            cadenafinal = String.format("%s%d\t%d\n", cadenafinal, edad, suma);
            contador = contador + 1;
            System.out.println(".............................................");
        }
        System.out.printf("%s", cadenafinal);
    }
}
