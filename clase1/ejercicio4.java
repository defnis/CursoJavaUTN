package clase1;

import java.util.Scanner;

/*  Conociendo el precio de lista de un artículo, determinar: Precio de venta al contado (5% de descuento) 
 * Precio de venta con tarjeta (10% de recargo). 
 */

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Leer el precio de lista del artículo
        System.out.print("Ingrese el precio de lista del artículo: ");
        double precioLista = input.nextDouble();

        // Calcular el precio de venta al contado con un 5% de descuento
        double precioContado = precioLista * 0.95;
        System.out.println("Precio de venta al contado: " + precioContado);

        // Calcular el precio de venta con tarjeta con un 10% de recargo
        double precioTarjeta = precioLista * 1.1;
        System.out.println("Precio de venta con tarjeta: " + precioTarjeta);

        input.close();
    }
}
