package clase2;

import java.util.Scanner;

// Realizar un programa que tome tres números, y los muestre ordenados de mayor a menor.

public class ejerciciofinal4 {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Ingrese el primer número: ");
      int num1 = input.nextInt();
      
      System.out.print("Ingrese el segundo número: ");
      int num2 = input.nextInt();
      
      System.out.print("Ingrese el tercer número: ");
      int num3 = input.nextInt();
      
      // Compara los números para ordenarlos
      if (num1 > num2) {
         int temp = num1;
         num1 = num2;
         num2 = temp;
      }
      
      if (num2 > num3) {
         int temp = num2;
         num2 = num3;
         num3 = temp;
      }
      
      if (num1 > num2) {
         int temp = num1;
         num1 = num2;
         num2 = temp;
      }
      
      System.out.println("Los números ordenados son: " + num3 + " " + num2 + " " + num1);
   }
}
