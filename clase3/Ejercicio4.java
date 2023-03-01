package clase3;


/* Se pide un programa que cargue n elementos numéricos entre 1 y 100 inclusive en una lista y 
 * realice lo siguiente:
 
a.    Mostrar los datos cargados.
b.    Buscar un elemento x dentro de la lista (x se ingresa por teclado). Si no existe, informarlo. 
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        // Solicitar al usuario la cantidad de elementos que desea cargar en la lista
        System.out.print("Ingrese la cantidad de elementos a cargar en la lista: ");
        int n = sc.nextInt();

        // Cargar n elementos numéricos aleatorios entre 1 y 100 inclusive en la lista
        for (int i = 0; i < n; i++) {
            int num = (int) (Math.random() * 100) + 1;
            numeros.add(num);
        }

        // Mostrar los datos cargados en la lista
        System.out.println("Los datos cargados en la lista son:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        // Buscar un elemento x dentro de la lista
        System.out.print("Ingrese el elemento a buscar en la lista: ");
        int x = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == x) {
                encontrado = true;
                System.out.println("El elemento " + x + " se encuentra en la lista.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El elemento " + x + " no se encuentra en la lista.");
        }

    }

}

