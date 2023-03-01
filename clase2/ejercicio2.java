package clase2;

// Del ejercicio1 mostrar solo los numeros pares.

public class ejercicio2 {
    public static void main(String[] args) {
        int numeroInicio = 5;
        int numeroFin = 14;

        int contador = numeroInicio;

        while (contador <= numeroFin) {
            if (contador % 2 == 0) {
                System.out.print(contador + " ");
            }
            contador++;
        }
    }
}

/* En este código, se usa un bucle while para iterar desde el valor de numeroInicio hasta el valor de 
 * numeroFin. En cada iteración del bucle, se comprueba si el valor actual de contador es par o no 
 * utilizando el operador módulo %. Si el valor de contador es divisible por 2 sin dejar un resto, 
 * entonces se trata de un número par y se muestra en la pantalla utilizando el método System.out.print(), 
 * seguido de un espacio en blanco para separar los números.
 * Si el valor de contador es impar, entonces no se muestra nada y se pasa al siguiente número. Después 
 * de mostrar todos los números pares entre numeroInicio y numeroFin, el programa termina.
 */