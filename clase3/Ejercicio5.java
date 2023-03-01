package clase3;

/*   Desarrollar un programa que permita procesar el puntaje obtenido por n concursantes en una competencia 
     (el puntaje tiene que ser entre 1 y 100). Para ello, grabar en un vector los puntajes obtenidos, se pide:
	a.    Mostrar los tres mejores puntajes generados.
    b.    Mostrar cuántos puntajes superaron el valor de 90.
    c.    Mostrar la diferencia entre el mayor y el menor puntaje.
    d.    Mostrar la cantidad de concursantes que quedaron descalificados, 
          esto es si su puntaje es menor a 30.

 */


import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario el número de concursantes
        System.out.print("Ingrese el número de concursantes: ");
        int n = scanner.nextInt();
        
        // Crear un vector para almacenar los puntajes
        int[] puntajes = new int[n];
        
        // Pedir al usuario los puntajes y almacenarlos en el vector
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el puntaje del concursante " + (i+1) + ": ");
            puntajes[i] = scanner.nextInt();
        }
        
        // Mostrar los tres mejores puntajes generados
        Arrays.sort(puntajes);
        System.out.println("Los tres mejores puntajes son:");
        for (int i = n-1; i >= Math.max(n-3, 0); i--) {
            System.out.println(puntajes[i]);
        }
        
        // Mostrar cuántos puntajes superaron el valor de 90
        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (puntajes[i] > 90) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " puntajes que superaron el valor de 90.");
        
        // Mostrar la diferencia entre el mayor y el menor puntaje
        int diferencia = puntajes[n-1] - puntajes[0];
        System.out.println("La diferencia entre el mayor y el menor puntaje es " + diferencia + ".");
        
        // Mostrar la cantidad de concursantes que quedaron descalificados
        contador = 0;
        for (int i = 0; i < n; i++) {
            if (puntajes[i] < 30) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " concursantes que quedaron descalificados.");
        
        scanner.close();
    }
}

