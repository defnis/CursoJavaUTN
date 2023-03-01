package clase2;

/* Calcular el total de comisiones que se debe abonar a los vendedores por sus ventas realizadas, 
 * para ello se deberá ingresar la categoría del vendedor y el total de la venta 
 * (el proceso termina cuando se ingrese una categoría igual a cero), la comisión se calcula 
 * con un porcentaje del total de venta según la categoría del vendedor.  Hay cuatro categorías de 
 * vendedores (1 a 3):
 * 
    Categoría 1: cobra una comisión de 5%
    Categoría 2: cobra una comisión de 10%
    Categoría 3: cobra una comisión de 15%
*/

import java.util.Scanner;

public class ejercicios112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int categoria;
        double venta, comision, totalComisiones = 0;
        
        do {
            System.out.print("Ingrese la categoría del vendedor (1 a 3): ");
            categoria = sc.nextInt();
            if (categoria == 0) {
                break;
            }
            System.out.print("Ingrese el total de venta: $");
            venta = sc.nextDouble();
            
            switch (categoria) {
                case 1:
                    comision = venta * 0.05;
                    break;
                case 2:
                    comision = venta * 0.1;
                    break;
                case 3:
                    comision = venta * 0.15;
                    break;
                default:
                    System.out.println("Categoría inválida.");
                    continue;
            }
            
            totalComisiones += comision;
            System.out.println("La comisión del vendedor es: $" + comision);
        } while (categoria != 0);
        
        System.out.println("El total de comisiones a abonar es: $" + totalComisiones);
    }
}
