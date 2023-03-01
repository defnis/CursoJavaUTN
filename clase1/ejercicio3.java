package clase1;

import java.util.Scanner;


//  Leer dos números y calcular: La suma de sus cuadrados. El promedio de sus cubos. 

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Leer los dos números
        System.out.print("Ingrese el primer número: ");
        double num1 = input.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = input.nextDouble();

        // Calcular la suma de sus cuadrados
        double sumaCuadrados = Math.pow(num1, 2) + Math.pow(num2, 2);
        System.out.println("La suma de los cuadrados es: " + sumaCuadrados);

        // Calcular el promedio de sus cubos
        double promedioCubos = (Math.pow(num1, 3) + Math.pow(num2, 3)) / 2;
        System.out.println("El promedio de los cubos es: " + promedioCubos);

        // Cerrar el objeto Scanner
        input.close();
    }
}
