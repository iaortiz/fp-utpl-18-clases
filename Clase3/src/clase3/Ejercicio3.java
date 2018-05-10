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
/*- Solución que permita calcular y presentar los valores de X y Y, teniendo como dato de entrada el valor de X 
   y obtener el de Y en base a las siguientes restricciones:
Si X<0 entonces Y=3*X+10
Si X>0 entonces Y=X**2+6
Si X==0 entonces Y=1
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int x;
        int y;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un valor para X");
        x = entrada.nextInt();
        if (x < 0) {
            y = 3 * x + 10;
            System.out.printf("El valor de Y  es: %s \n", y);
        } else {
            if (x > 0) {
                y = x * 2 + 6;
                System.out.printf("El valor de Y  es: %s \n", y);
            } else {
                if (x == 0) {
                    y = 1;
                    System.out.printf("El valor de Y  es: %s \n", y);

                }
            }
        }
    }

}
