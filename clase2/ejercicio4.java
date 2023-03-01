package clase2;

public class ejercicio4 {
    public static void main(String[] args) {
        int numeroInicio = 5;
        int numeroFin = 14;

        for (int i = numeroFin; i >= numeroInicio; i--) {
            if (i % 2 == 0) {     // En caso de querer ver los impares solo se cambia el 0 por el 1.
                System.out.print(i + " ");
            }
        }
    }
}
