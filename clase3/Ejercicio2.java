package clase3;

/*  Desarrollar un programa que permita cargar una lista de n elementos, 
 * con números cuyos valores estén entre 10 y 50. Se pide:
 
a.    Mostrar los datos cargados.
b.    Mostrar el porcentaje de números pares del vector.
c.    Generar y mostrar un segundo vector con todos aquellos números múltiplos de 3. 
*/


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // a. Cargar una lista de n elementos con números entre 10 y 50
        System.out.print("Ingrese la cantidad de elementos que desea cargar en la lista: ");
        int n = scanner.nextInt();

        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int num = random.nextInt(41) + 10; // Se genera un número aleatorio entre 10 y 50
            lista.add(num); // Se agrega el número a la lista
        }

        // b. Mostrar el porcentaje de números pares del vector
        int pares = 0;
        for (int num : lista) {
            if (num % 2 == 0) {
                pares++;
            }
        }
        double porcentajePares = ((double) pares / n) * 100;
        System.out.println("El porcentaje de números pares en la lista es: " + porcentajePares + "%");

        // c. Generar y mostrar un segundo vector con todos aquellos números múltiplos de 3
        ArrayList<Integer> multiplosTres = new ArrayList<>();
        for (int num : lista) {
            if (num % 3 == 0) {
                multiplosTres.add(num);
            }
        }
        System.out.println("El segundo vector con los múltiplos de tres es: " + multiplosTres);
    }
}
