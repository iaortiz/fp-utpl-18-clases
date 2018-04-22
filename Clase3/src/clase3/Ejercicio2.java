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
- Una empresa dedicada a vender teléfonos celulares, en base a las siguientes consideraciones:
	- Si el cliente es de tipo 1 se le descuenta 10%
	- Si el cliente es de tipo 2 se le descuenta 20%
	- Si el cliente es de tipo 3 se le descuenta 30%
La solución debe imprimir el siguiente reporte:
	Nombre: Luis Alvarez
	Tipo de Cliente: 1
	Cantidad de Celulares: 20
	Precio por cada celular: 300
	Subtotal a pagar: cantidad de celulares * precio c/celular
	Descuento: (se debe obtener el descuento)
	Valor final a pagar: Subtotal - Descuento.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        String nombre;
        int TipoCliente;
        int CantCel;
        double PrecCel;
        double Subtotal;
        double Descuento;
        double Pagar;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del cliente");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el tipo de cliente");
        TipoCliente = entrada.nextInt();
        System.out.println("Ingrese la cantidad de celulares");
        CantCel = entrada.nextInt();
        System.out.println("Ingrese el precio de los celulares");
        PrecCel = entrada.nextDouble();
        if (TipoCliente == 1) {
            System.out.printf("Cliente: %s \n", nombre);
            System.out.printf("Tipo de Cliente: %s \n", TipoCliente);
            System.out.printf("Cantidad de Celulares: %s \n", CantCel);
            System.out.printf("Precio de cada celular: %s \n", PrecCel);
            Subtotal = PrecCel * CantCel;
            System.out.printf("SubTotal a pagar: %s \n", Subtotal);
            Descuento = Subtotal * 0.1;
            System.out.printf("Decuento del : %s \n", Descuento);
            Pagar = Subtotal - Descuento;
            System.out.printf("Valor a pagar: %s \n ", Pagar);

        } else {
            if (TipoCliente == 2) {
                System.out.printf("Cliente: %s \n", nombre);
                System.out.printf("Tipo de Cliente: %s \n", TipoCliente);
                System.out.printf("Cantidad de Celulares: %s \n", CantCel);
                System.out.printf("Precio de cada celular: %s \n", PrecCel);
                Subtotal = PrecCel * CantCel;
                System.out.printf("SubTotal a pagar: %s \n", Subtotal);
                Descuento = Subtotal * 0.2;
                System.out.printf("Decuento del : %s \n", Descuento);
                Pagar = Subtotal - Descuento;
                System.out.printf("Valor a pagar: %s \n ", Pagar);
            } else {
                if (TipoCliente == 3) {
                    System.out.printf("Cliente: %s \n", nombre);
                    System.out.printf("Tipo de Cliente: %s \n", TipoCliente);
                    System.out.printf("Cantidad de Celulares: %s \n", CantCel);
                    System.out.printf("Precio de cada celular: %s \n", PrecCel);
                    Subtotal = PrecCel * CantCel;
                    System.out.printf("SubTotal a pagar: %s \n", Subtotal);
                    Descuento = Subtotal * 0.3;
                    System.out.printf("Decuento del : %s \n", Descuento);
                    Pagar = Subtotal - Descuento;
                    System.out.printf("Valor a pagar: %s \n ", Pagar);
                }
            }
        }

    }
}
