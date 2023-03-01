package clase2;

//  Para leer una serie de cincuenta números enteros y contar cuántos son mayores que 100

import java.util.Scanner;

public class ejerciciofinal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int i = 1; i <= 50; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int num = scanner.nextInt();
            if (num > 100) {
                count++;
            }
        }
        System.out.println("Hay " + count + " números mayores que 100.");
    }
}
