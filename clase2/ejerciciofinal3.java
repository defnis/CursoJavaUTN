package clase2;

import java.util.Scanner;

public class ejerciciofinal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la edad mínima establecida
        System.out.print("Ingrese la edad mínima para el trabajo: ");
        int edadMinima = scanner.nextInt();

        // Leer las edades de los postulantes
        System.out.print("Ingrese la edad del primer postulante: ");
        int edad1 = scanner.nextInt();

        System.out.print("Ingrese la edad del segundo postulante: ");
        int edad2 = scanner.nextInt();

        System.out.print("Ingrese la edad del tercer postulante: ");
        int edad3 = scanner.nextInt();

        // Verificar si todas las edades cumplen con la edad mínima
        boolean cumplenEdadMinima = (edad1 >= edadMinima) && (edad2 >= edadMinima) && (edad3 >= edadMinima);

        // Mostrar el resultado
        if (cumplenEdadMinima) {
            System.out.println("Todos los postulantes cumplen con la edad mínima para el trabajo.");
        } else {
            System.out.println("No todos los postulantes cumplen con la edad mínima para el trabajo.");
        }
    }
}

