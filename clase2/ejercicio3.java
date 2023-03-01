package clase2;

import java.util.Scanner;

/*  A lo del ejercicio1, con una variable extra, elija si se deben mostrar los números pares o impares  */

public class ejercicio3 {
    public static void main(String[] args) {
        int numeroInicio = 5;
        int numeroFin = 14;

        Scanner input = new Scanner(System.in);
        System.out.print("Elija qué tipo de números mostrar ('p' para pares, 'i' para impares): ");
        String opcion = input.nextLine();

        int contador = numeroInicio;

        while (contador <= numeroFin) {
            if (opcion.equals("p") && contador % 2 == 0) {
                System.out.print(contador + " ");
            } else if (opcion.equals("i") && contador % 2 == 1) {
                System.out.print(contador + " ");
            }
            contador++;
        }
    }
}

/* En este código, primero se definen las variables numeroInicio y numeroFin con los valores iniciales
 *  deseados. Luego, se utiliza la clase Scanner para pedir al usuario que elija qué tipo de números
 *   mostrar ("p" para pares o "i" para impares).
 */

/* Después de leer la opción elegida por el usuario, se utiliza un bucle while para iterar desde 
 * el valor de numeroInicio hasta el valor de numeroFin. En cada iteración del bucle, se comprueba 
 * si el valor actual de contador es par o impar, según la opción elegida por el usuario. Si la 
 * opción es "p" y el valor de contador es par, o si la opción es "i" y el valor de contador es impar, 
 * entonces se muestra en la pantalla utilizando el método System.out.print(), seguido de un espacio 
 * en blanco para separar los números.
 */

/* Si el valor de contador no cumple con las condiciones para ser mostrado, entonces no se muestra nada 
 * y se pasa al siguiente número. Después de mostrar todos los números pares o impares entre numeroInicio
 * y numeroFin, el programa termina.
 */

