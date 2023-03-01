package clase2;

import java.util.Scanner;

/* Dado el siguiente texto, vamos a atacar el siguiente problema: 
 “determinar si una persona pertenece al segmento de ingresos altos”. Del i al iii, la idea 
 es hacerlo en papel y lápiz y sólo implementar el cuarto.

“Son hogares que declaran reunir alguna de las siguientes condiciones, considerando a todas y todos 
los convivientes:
Ingresos mensuales totales del hogar equivalentes o superiores a $489.083 (3,5 canastas básicas para
un hogar tipo 2 según el INDEC).
Tener 3 o más vehículos con una antigüedad menor a 5 años.
Tener 3 o más inmuebles.
Poseer una embarcación, una aeronave de lujo o ser titular de activos societarios que demuestren
capacidad económica plena. ”Tomado de https://www.argentina.gob.ar/subsidios el 07/12/2022
Lea atentamente el texto, primero que nada piense cuáles son las variables de entrada.*/

public class ejerciciofinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los ingresos mensuales totales del hogar:");
        double ingresosMensuales = sc.nextDouble();

        System.out.println("Ingrese la cantidad de vehículos con antigüedad menor a 5 años:");
        int cantidadVehiculos = sc.nextInt();

        System.out.println("Ingrese la cantidad de inmuebles:");
        int cantidadInmuebles = sc.nextInt();

        System.out.println("¿Posee una embarcación, aeronave de lujo o es titular de activos societarios que demuestren capacidad económica plena? (si/no):");
        String poseeActivos = sc.next();

        boolean esIngresosAltos = false;

        if (ingresosMensuales >= 489083) {
            esIngresosAltos = true;
        } else if (cantidadVehiculos >= 3) {
            esIngresosAltos = true;
        } else if (cantidadInmuebles >= 3) {
            esIngresosAltos = true;
        } else if (poseeActivos.equalsIgnoreCase("si")) {
            esIngresosAltos = true;
        }

        if (esIngresosAltos) {
            System.out.println("La persona pertenece al segmento de ingresos altos.");
        } else {
            System.out.println("La persona no pertenece al segmento de ingresos altos.");
        }
    }
}
