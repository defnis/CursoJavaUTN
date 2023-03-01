package clase1;

/*  Un vehículo parte de la ciudad de Córdoba y se dirige a Buenos Aires por autopista.
 *  La distancia aproximada entre ambas ciudades es de 800 kilómetros. El vehículo se desplaza con 
 *  velocidad promedio de 122 km/h. Desarrolle un programa que calcule el tiempo total en horas que
 *  demorará ese vehículo en llegar a Buenos Aires
 */

public class ejercicio2 {
    public static void main(String[] args) {
        double distancia = 800.0; // distancia en kilómetros
        double velocidad = 122.0; // velocidad promedio en km/h
        double tiempoEnHoras = distancia / velocidad; // cálculo del tiempo en horas

        System.out.println("El tiempo de viaje es de " + tiempoEnHoras + " horas.");
    }
}
