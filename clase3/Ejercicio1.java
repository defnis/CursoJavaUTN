package clase3;

/* Desarrollar un programa que permita cargar las temperaturas promedio en cada mes del país, 
 * con estos datos se pide:
 * 
a.    Mostrar los datos cargados.
b.    Mostrar el promedio anual de temperaturas.
c.    Mostrar los meses del año en los que la temperatura fue mayor a la temperatura promedio de todo el año.
d.    Mostrar el promedio de temperaturas para un determinado trimestre, ingresar 
	el rango de los tres meses al comenzar el programa.
*/

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declaración de variables
        double[] temperaturas = new double[12];
        double sumaTemperaturas = 0;
        double promedioAnual = 0;
        int mesMayorTemperatura = 0;
        int contadorMesesMayorPromedio = 0;

        // Carga de temperaturas
        System.out.println("Ingrese las temperaturas promedio de cada mes:");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Mes " + (i+1) + ": ");
            temperaturas[i] = input.nextDouble();
            sumaTemperaturas += temperaturas[i];
        }

        // Cálculo del promedio anual de temperaturas
        promedioAnual = sumaTemperaturas / temperaturas.length;

        // Mostrar los datos cargados
        System.out.println("Temperaturas cargadas:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Mes " + (i+1) + ": " + temperaturas[i]);
        }

        // Mostrar el promedio anual de temperaturas
        System.out.println("Promedio anual de temperaturas: " + promedioAnual);

        // Mostrar los meses con temperaturas mayores al promedio anual
        System.out.println("Meses con temperaturas mayores al promedio anual:");
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > promedioAnual) {
                System.out.println("Mes " + (i+1) + ": " + temperaturas[i]);
                contadorMesesMayorPromedio++;
            }
        }
        if (contadorMesesMayorPromedio == 0) {
            System.out.println("No hubo meses con temperaturas mayores al promedio anual.");
        }

        // Mostrar el promedio de temperaturas para un trimestre
        System.out.print("Ingrese el rango de los tres meses para calcular el promedio trimestral (1-12): ");
        int mesInicio = input.nextInt();
        int mesFin = input.nextInt();

        double sumaTemperaturasTrimestre = 0;
        int contadorMesesTrimestre = 0;

        for (int i = mesInicio-1; i < mesFin; i++) {
            sumaTemperaturasTrimestre += temperaturas[i];
            contadorMesesTrimestre++;
        }

        double promedioTrimestral = sumaTemperaturasTrimestre / contadorMesesTrimestre;

        System.out.println("Promedio trimestral de temperaturas: " + promedioTrimestral);
    }
}

