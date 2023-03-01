package clase2;

/*  Utilizando la sentencia while, imprima todos los números entre 2 variables “a” y “b”. 
 *  Su código puede arrancar (por ejemplo): 
 *  int numeroInicio = 5; 
 *  int numeroFin = 14;
 *  Se deberían mostrar los números: 5,6,7,8,9,10,11,12,13,14  
 *  */


public class ejercicio1 {
    public static void main(String[] args) {
        int numeroInicio = 5;
        int numeroFin = 14;

        int contador = numeroInicio;

        while (contador <= numeroFin) {
            System.out.print(contador + " ");
            contador++;
        }
    }
}
