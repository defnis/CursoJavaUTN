package clase2;

/* Se quiere calcular e imprimir el cuadrado de cada número de una serie de n elementos, 
 * los que se leen de a uno por vez.
 */

import java.util.Scanner;

public class ejercicio14 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Ingrese la cantidad de elementos: ");
      int n = sc.nextInt();
      
      int[] serie = new int[n];
      System.out.println("Ingrese los elementos uno por uno:");
      for (int i = 0; i < n; i++) {
         serie[i] = sc.nextInt();
      }
      
      System.out.println("Los cuadrados de la serie son:");
      for (int i = 0; i < n; i++) {
         int cuadrado = serie[i] * serie[i];
         System.out.println(cuadrado);
      }
   }
}

