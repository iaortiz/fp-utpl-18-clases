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
/*- En una empresa dedicada a la venta de balones, si se compra uno se hace un descuento de 50%, si se compra 
2 descuento de 70%, se compra 3 o más se descuenta 80%. Generar la solución que permita leer el número 
de balones a comprar, el precio de cada balón y el valor final a cancelar.

 */
public class Ejercicio4 {

    public static void main(String[] args) {
        double precio;
        double descuento;
        double subtotal;
        double total;
        int balones;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número de balones comprados");
        balones = entrada.nextInt();
        System.out.println("Ingrese el precio del balón");
        precio = entrada.nextDouble();
        subtotal = precio * balones;

        if (balones == 1) {
            descuento = subtotal * 0.5;
            total = subtotal - descuento;
            System.out.printf("Cantidad de Balones: %s \n", balones);
            System.out.printf("Precio unitario: %s \n", precio);
            System.out.printf("El valor a pagar es: %s ", total);
        } else {
            if (balones == 2) {
                descuento = subtotal * 0.7;
                total = subtotal - descuento;
                System.out.printf("Cantidad de Balones: %s \n", balones);
                System.out.printf("Precio unitario: %s \n", precio);
                System.out.printf("El valor a pagar es: %s ", total);
            } else {
                if (balones == 3) {
                    descuento = subtotal * 0.8;
                    total = subtotal - descuento;
                    System.out.printf("Cantidad de Balones: %s \n", balones);
                    System.out.printf("Precio unitario: %s \n", precio);
                    System.out.printf("El valor a pagar es: %s ", total);
                }
            }
        }
    }

}
