package clase1;

import java.util.Scanner;

/* Calcular el descuento y el monto a pagar por un medicamento en una farmacia 
 * (cargar por teclado el precio de ese medicamento) sabiendo que todos los medicamentos 
 * tienen un descuento del 5 %. Mostrar el precio actual, el monto del descuento y 
 * el monto final a pagar.
 */

public class ejercicio5 {
   public static void main(String[] args) {
       
       // Crear un objeto Scanner para leer la entrada del usuario
       Scanner entrada = new Scanner(System.in);

       // Pedir al usuario que ingrese el precio del medicamento
       System.out.print("Ingrese el precio del medicamento: ");
       double precio = entrada.nextDouble();

       // Calcular el descuento y el monto final
       double descuento = precio * 0.05;
       double precioFinal = precio - descuento;

       // Mostrar el precio actual, el descuento y el precio final
       System.out.printf("El precio actual es: $%.2f\n", precio);
       System.out.printf("El descuento es: $%.2f\n", descuento);
       System.out.printf("El precio final a pagar es: $%.2f\n", precioFinal);
   }
}

