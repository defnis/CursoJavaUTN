package clase2;

/*  Ingresar n números enteros y calcular el promedio de los números ingresados y
 *  el porcentaje de números mayores a 100 respecto del total.
 */

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números que desea ingresar: ");
        int n = input.nextInt();

        int[] numeros = new int[n];

        // Pedir al usuario que ingrese los n números enteros
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número entero: ");
            numeros[i] = input.nextInt();
        }

        // Calcular la suma de los números ingresados
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        // Calcular el promedio
        double promedio = (double) suma / n;
        System.out.println("El promedio de los números ingresados es: " + promedio);

        // Contar la cantidad de números mayores a 100
        int mayoresA100 = 0;
        for (int numero : numeros) {
            if (numero > 100) {
                mayoresA100++;
            }
        }

        // Calcular el porcentaje de números mayores a 100
        double porcentajeMayoresA100 = (double) mayoresA100 / n * 100;
        System.out.println("El porcentaje de números mayores a 100 es: " + porcentajeMayoresA100 + "%");

        input.close();
    }
}

