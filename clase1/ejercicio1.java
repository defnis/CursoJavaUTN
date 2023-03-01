package clase1;
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el valor de la base
        System.out.print("Ingrese el valor de la base del triángulo: ");
        double base = entrada.nextDouble();
        
        // Calcular la altura del triángulo (altura = base^2)
        double altura = Math.pow(base, 2);
        
        // Calcular el área del triángulo (área = base * altura / 2)
        double area = base * altura / 2;
        
        // Mostrar el resultado al usuario
        System.out.println("El área del triángulo es: " + area);
    }
}
