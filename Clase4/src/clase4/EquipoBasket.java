/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

import java.util.Scanner;

/**
 *
 * @author Israel Existe una consideración, si el usuario ingresa la estatura de
 * un estudiante como menor a 1.20, el programa deberá considerar la edad como
 * 1.20 obligatoriamente, esto debido a una restricción en el reglamento para
 * ingreso al equipo.
 */
public class EquipoBasket {

    public static void main(String[] args) {
        double suma = 0;
        double promedio;
        double estatura;
        int contador = 1;
        boolean edades = true;
        Scanner entrada = new Scanner(System.in);
        String cadfin = ("Edad Estudiante\n");
        while (edades) {
            System.out.println("Ingrese una estatura");
            estatura = entrada.nextDouble();
            if (estatura < 1.20) {
                estatura = 1.20;
            }
            suma = suma + estatura;
            cadfin = cadfin + String.format("%.2f\n", estatura);
            contador = contador + 1;
            entrada.nextLine();
            System.out.println("¿Escriba SI en caso de ingresar más estaturas o ingrese NO para salir?");
            String respuesta = entrada.nextLine();
            if (respuesta.equals("SI") ) {
                edades = true;
            } else {
                if (respuesta.equals("NO")) {
                    edades = false;
                }
            }
        }
        contador = contador - 1;
        promedio = suma / contador;
        System.out.println(".........................................................................................");
        System.out.printf("Reporte de Estaturas:\n\n%s\nPromedio de estaturas: %.2f\nReporte generado:Dep. Deportes\n",
                cadfin, promedio);

    }

}
