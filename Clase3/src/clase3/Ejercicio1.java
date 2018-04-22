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
// Una solución que permia leer el número de día (un valor entre 1 y 7) 
// e imprima Lunes si es 1, Martes si es 2, ... , Domingo si es 7.
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int day;
        System.out.println("Ingrese el número de un día");
        day = entrada.nextInt();

        switch (day) {
            case 1:
                System.out.printf("L U N E S");
                break;

            case 2:
                System.out.printf("M A R T E S");
                break;

            case 3:
                System.out.printf("M I É R C O L E S");
                break;

            case 4:
                System.out.printf("J U E V E S");
                break;

            case 5:
                System.out.printf("V I E R N E S");
                break;

            case 6:
                System.out.printf("S Á B A D O");
                break;
                
            case 7:
                System.out.printf("D O M I N G O");
                break;

            default:
                System.out.println("El número ingresado no tiene día asignado");
                

        }
    }

}
