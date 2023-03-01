package clase2;

/* Leer una serie de números enteros, que contenga como máximo veinte elementos, en caso de ingresar 
 * un valor negativo o la cantidad de números ingresados supere los veinte, detener el proceso e informar 
 * mediante un mensaje cuántos son mayores que 100.
 * */


import java.util.Scanner;

public class ejerciciofinal7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[20];
        int cantidad = 0;
        
        System.out.println("Ingrese hasta 20 numeros enteros:");
        
        for (int i = 0; i < 20; i++) {
            int numero = input.nextInt();
            if (numero < 0) {
                break;
            }
            numeros[i] = numero;
            cantidad++;
        }
        
        int mayoresQue100 = 0;
        for (int i = 0; i < cantidad; i++) {
            if (numeros[i] > 100) {
                mayoresQue100++;
            }
        }
        
        System.out.println("Cantidad de numeros mayores que 100: " + mayoresQue100);
    }
}

