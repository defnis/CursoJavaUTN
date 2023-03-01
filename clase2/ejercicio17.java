package clase2;

/* Desarrollar un programa que permita ingresar las coordenadas de n puntos en el plano, 
 * e informe: En qué cuadrante se encuentra cada uno. Determinar cuántos puntos se encuentran 
 * en el primer o tercer cuadrante.
 */

import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de puntos: ");
        int n = sc.nextInt();

        int cuadrante1 = 0;
        int cuadrante2 = 0;
        int cuadrante3 = 0;
        int cuadrante4 = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Punto " + i);
            System.out.print("Ingrese la coordenada x: ");
            double x = sc.nextDouble();
            System.out.print("Ingrese la coordenada y: ");
            double y = sc.nextDouble();

            if (x > 0 && y > 0) {
                System.out.println("El punto se encuentra en el primer cuadrante.");
                cuadrante1++;
            } else if (x < 0 && y > 0) {
                System.out.println("El punto se encuentra en el segundo cuadrante.");
                cuadrante2++;
            } else if (x < 0 && y < 0) {
                System.out.println("El punto se encuentra en el tercer cuadrante.");
                cuadrante3++;
            } else if (x > 0 && y < 0) {
                System.out.println("El punto se encuentra en el cuarto cuadrante.");
                cuadrante4++;
            } else {
                System.out.println("El punto se encuentra sobre algún eje.");
            }
        }

        System.out.println("Cantidad de puntos en el primer cuadrante: " + cuadrante1);
        System.out.println("Cantidad de puntos en el segundo cuadrante: " + cuadrante2);
        System.out.println("Cantidad de puntos en el tercer cuadrante: " + cuadrante3);
        System.out.println("Cantidad de puntos en el cuarto cuadrante: " + cuadrante4);
        System.out.println("Cantidad de puntos en el primer o tercer cuadrante: " + (cuadrante1 + cuadrante3));

        sc.close();
    }
}

