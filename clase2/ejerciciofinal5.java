package clase2;

/* Un comercio necesita informar el importe final a pagar a un determinado proveedor. 
 * Para ello debe ingresar la categoría (que puede ser categoría ’A’ o ’B’) y el importe original a abonar. 
 * Considerar las siguientes condiciones para el cálculo del importe final a pagar: 
 * Si el cliente es categoría A y el monto a pagar supera a los 10000 pesos debe aplicarse un 
 * descuento del 5 %. Si el cliente es categoría B y el importe a pagar oscila entre 15000 y 25000 pesos 
 * debe aplicarse un descuento del 2 %. Para ambas categorías en caso de no cumplirse las condiciones 
 * especificadas no se aplicará ningún tipo de descuento sobre el importe que se le debe abonar.
 */

import java.util.Scanner;

public class ejerciciofinal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la categoría (A o B): ");
        String categoria = sc.nextLine();

        System.out.print("Ingrese el importe original a abonar: ");
        double importe = sc.nextDouble();

        double descuento = 0.0;

        if (categoria.equals("A") && importe > 10000) {
            descuento = importe * 0.05;
        } else if (categoria.equals("B") && importe >= 15000 && importe <= 25000) {
            descuento = importe * 0.02;
        }

        double importeFinal = importe - descuento;

        System.out.println("Importe original a abonar: $" + importe);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Importe final a pagar: $" + importeFinal);

        sc.close();
    }
}
