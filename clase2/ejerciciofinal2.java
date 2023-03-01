package clase2;

import java.util.Scanner;

/* Se solicita realizar un programa que permita ingresar tres temperaturas correspondientes 
a diferentes momentos de un día y determinar cuál es el promedio de las temperaturas y 
si existe alguna temperatura que sea mayor al promedio. */

public class ejerciciofinal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp1, temp2, temp3, promedio;
        boolean hayMayorPromedio = false;

        System.out.print("Ingrese la primera temperatura: ");
        temp1 = sc.nextDouble();
        System.out.print("Ingrese la segunda temperatura: ");
        temp2 = sc.nextDouble();
        System.out.print("Ingrese la tercera temperatura: ");
        temp3 = sc.nextDouble();

        promedio = (temp1 + temp2 + temp3) / 3;

        System.out.println("El promedio de las temperaturas es: " + promedio);

        if (temp1 > promedio || temp2 > promedio || temp3 > promedio) {
            hayMayorPromedio = true;
        }

        if (hayMayorPromedio) {
            System.out.println("Hay al menos una temperatura mayor al promedio.");
        } else {
            System.out.println("No hay ninguna temperatura mayor al promedio.");
        }
    }
}
