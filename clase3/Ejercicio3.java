package clase3;

/* Desarrollar un programa que permita cargar las notas de alumnos obtenidos en el primer examen
 *  de un curso, se pide:
a.    Mostrar el promedio de notas del curso.
b.    Mostrar la cantidad de notas superiores al promedio.
c.    Mostrar  la lista de notas ordenada de manera ascendente.
d.    Buscar si al menos un alumno obtuvo la nota x, siendo x una nota ingresada por teclado.

*/


import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la cantidad de notas a ingresar
        System.out.print("Ingrese la cantidad de notas a ingresar: ");
        int cantidadNotas = scanner.nextInt();

        // Declarar un arreglo para almacenar las notas
        double[] notas = new double[cantidadNotas];

        // Pedir al usuario que ingrese las notas
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Ingrese la nota del alumno " + (i+1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calcular el promedio de notas
        double sumaNotas = 0;
        for (double nota : notas) {
            sumaNotas += nota;
        }
        double promedio = sumaNotas / cantidadNotas;

        // Mostrar el promedio de notas del curso
        System.out.println("El promedio de notas del curso es: " + promedio);

        // Contar la cantidad de notas superiores al promedio
        int cantidadNotasSuperioresAlPromedio = 0;
        for (double nota : notas) {
            if (nota > promedio) {
                cantidadNotasSuperioresAlPromedio++;
            }
        }

        // Mostrar la cantidad de notas superiores al promedio
        System.out.println("La cantidad de notas superiores al promedio es: " + cantidadNotasSuperioresAlPromedio);

        // Ordenar la lista de notas de manera ascendente
        Arrays.sort(notas);

        // Mostrar la lista de notas ordenada
        System.out.println("La lista de notas ordenada es: " + Arrays.toString(notas));

        // Buscar si al menos un alumno obtuvo la nota x
        System.out.print("Ingrese la nota que desea buscar: ");
        double notaBuscada = scanner.nextDouble();

        boolean notaEncontrada = false;
        for (double nota : notas) {
            if (nota == notaBuscada) {
                notaEncontrada = true;
                break;
            }
        }

        if (notaEncontrada) {
            System.out.println("La nota " + notaBuscada + " fue encontrada en la lista de notas.");
        } else {
            System.out.println("La nota " + notaBuscada + " no fue encontrada en la lista de notas.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

