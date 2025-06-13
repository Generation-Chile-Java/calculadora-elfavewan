import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora básica :)");

        System.out.println("Ingresa el primer número:");
        int numeroUno = teclado.nextInt();

        System.out.println("Ingresa el segundo número:");
        int numeroDos = teclado.nextInt();

        int suma = numeroUno + numeroDos;
        int resta = numeroUno - numeroDos;
        int multiplicacion = numeroUno * numeroDos;
        int division = numeroUno / numeroDos;
        int modulo = numeroUno % numeroDos;

        System.out.println("Resultados:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

teclado.close();
    }
}