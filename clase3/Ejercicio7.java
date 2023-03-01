package clase3;

/* Genere una clase que tenga los métodos para realizar la codificación y  
 * decodificación de un string, dado un número de desplazamiento. 
 
Por ejemplo, con desplazo de 1:
“hola que tal” -> “ipmbarvfaubm”
h -> i
o -> p
con desplazo de 2
“hola que tal” -> “jqncbswgbvcn”
h -> j
o -> q
*/

public class Ejercicio7 {

    // Método para codificar un string dado un número de desplazamiento
    public static String codificar(String mensaje, int desplazamiento) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    c = (char) ((c + desplazamiento - 'A') % 26 + 'A');
                } else {
                    c = (char) ((c + desplazamiento - 'a') % 26 + 'a');
                }
            }
            resultado.append(c);
        }
        return resultado.toString();
    }

    // Método para decodificar un string dado un número de desplazamiento
    public static String decodificar(String mensaje, int desplazamiento) {
        return codificar(mensaje, 26 - desplazamiento);
    }
    
}



