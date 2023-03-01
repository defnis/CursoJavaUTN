package clase2;

import java.util.Scanner;

/* Se necesita desarrollar un programa que permita calcular la suma de tres números. 
 * Si el resultado es mayor a 50 dividir por 2, en caso contrario elevar el resultado al cubo.
 */

public class ejerciciofinal1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();

        int suma = numero1 + numero2 + numero3;

        if (suma > 50) {
            double resultado = suma / 2.0;
            System.out.println("El resultado es: " + resultado);
        } else {
            double resultado = Math.pow(suma, 3);
            System.out.println("El resultado es: " + resultado);
        }
    }

}
