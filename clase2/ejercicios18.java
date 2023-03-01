package clase2;

/*  Se dispone de diez pares ordenados (X,Y) de números, 
 * a los cuales se debe calcular la suma de todas 
 * las X y la suma de todas las Y. Imprimir los resultados.
 */

public class ejercicios18 {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] y = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int sumX = 0;
        int sumY = 0;

        for (int i = 0; i < 10; i++) {
            sumX += x[i];
            sumY += y[i];
        }

        System.out.println("Suma de todas las X: " + sumX);
        System.out.println("Suma de todas las Y: " + sumY);
    }
}
