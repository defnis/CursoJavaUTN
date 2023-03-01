package clase2;

/*  Se ingresan los datos de las ventas de un comercio, código del producto, cantidad vendida y precio unitario, se pide informar:
a.     La cantidad de ventas ingresadas.
b.     El importe total de ventas.
c.    La cantidad de ventas cuyo valor esté comprendido entre 100 y 300 unidades.
d.     Indicar si hubo una cantidad de ventas inferior a 50 unidades.
*/

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar los resultados
        int cantidadVentas = 0;
        double importeTotalVentas = 0;
        int cantidadVentasEntre100y300 = 0;
        boolean huboVentasMenoresA50 = false;

        // Pedir al usuario el número de ventas a ingresar
        System.out.print("Ingrese el número de ventas: ");
        int numVentas = scanner.nextInt();

        // Bucle para ingresar los datos de cada venta
        for (int i = 1; i <= numVentas; i++) {
            // Pedir el código del producto
            System.out.printf("Ingrese código del producto #%d: ", i);
            int codigoProducto = scanner.nextInt();

            // Pedir la cantidad vendida del producto
            System.out.printf("Ingrese cantidad vendida del producto #%d: ", i);
            int cantidadVendida = scanner.nextInt();

            // Pedir el precio unitario del producto
            System.out.printf("Ingrese precio unitario del producto #%d: ", i);
            double precioUnitario = scanner.nextDouble();

            // Actualizar las variables correspondientes
            cantidadVentas++;
            importeTotalVentas += cantidadVendida * precioUnitario;

            if (cantidadVendida < 50) {
                huboVentasMenoresA50 = true;
            }

            double valorVenta = cantidadVendida * precioUnitario;
            if (valorVenta >= 100 && valorVenta <= 300) {
                cantidadVentasEntre100y300++;
            }
        }

        // Imprimir los resultados
        System.out.printf("Cantidad de ventas ingresadas: %d%n", cantidadVentas);
        System.out.printf("Importe total de ventas: %.2f%n", importeTotalVentas);
        System.out.printf("Cantidad de ventas con valor entre 100 y 300 unidades: %d%n", cantidadVentasEntre100y300);

        if (huboVentasMenoresA50) {
            System.out.println("Se registraron ventas con cantidad inferior a 50 unidades.");
        } else {
            System.out.println("No se registraron ventas con cantidad inferior a 50 unidades.");
        }
    }
}

