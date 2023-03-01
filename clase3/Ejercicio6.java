package clase3;

/* Utilizando solo tipos primitivos, String (solo usar método length), vectores, 
   iteraciones simples y condicionales, genere una clase por ejercicio que posea los siguientes métodos:

   Dado un String y una letra, que cuente la cantidad de apariciones de la letra en el String
   Dados 3 números y un orden (ascendente o decreciente) que ordene los mismos y los retorne en un vector de 3
   dado un vector de números, y un número X, que sume todos los números > X y retorne el resultado
*/

public class Ejercicio6 {
    
    public static int contarLetra(String str, char letra) {
        int contador = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }
    
    public static int[] ordenarNumeros(int a, int b, int c, boolean ascendente) {
        int[] numeros = {a, b, c};
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                boolean swap = ascendente ? (numeros[i] > numeros[j]) : (numeros[i] < numeros[j]);
                if (swap) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
        return numeros;
    }
    
    
}




