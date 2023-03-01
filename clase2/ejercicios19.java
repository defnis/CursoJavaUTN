package clase2;

/* ngresar una serie de números por teclado que representan la cantidad de ventas realizadas en un comercio,
 *  la carga termina cuando se ingrese una cantidad negativa. Con estos datos se pide:
 
a.      Informar la cantidad de ventas ingresadas.
b.      Cantidad de ventas con 400, 500 y 600 unidades.
c.      Indicar si hubo una cantidad de ventas inferior a 100 unidades.
*/

import java.util.Scanner;

public class ejercicios19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ventas, cantidadVentas = 0, cantidad400 = 0, cantidad500 = 0, cantidad600 = 0;
        boolean hayMenosDe100 = false;

        System.out.println("Ingrese la cantidad de ventas realizadas en el comercio:");
        ventas = sc.nextInt();

        while (ventas >= 0) {
            cantidadVentas++;

            if (ventas == 400) {
                cantidad400++;
            } else if (ventas == 500) {
                cantidad500++;
            } else if (ventas == 600) {
                cantidad600++;
            }

            if (ventas < 100) {
                hayMenosDe100 = true;
            }

            System.out.println("Ingrese la cantidad de ventas realizadas en el comercio:");
            ventas = sc.nextInt();
        }

        System.out.println("La cantidad de ventas ingresadas es: " + cantidadVentas);
        System.out.println("La cantidad de ventas con 400 unidades es: " + cantidad400);
        System.out.println("La cantidad de ventas con 500 unidades es: " + cantidad500);
        System.out.println("La cantidad de ventas con 600 unidades es: " + cantidad600);

        if (hayMenosDe100) {
            System.out.println("Hubo ventas con menos de 100 unidades.");
        } else {
            System.out.println("No hubo ventas con menos de 100 unidades.");
        }
    }
}

