import java.util.Scanner;

public class EjercicioMenorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cantidad de números a comparar: ");
        int cantidad = scanner.nextInt();
        int menor = Integer.MAX_VALUE;

        if (cantidad<10){
            System.out.println("ERROR: La cantidad mínima de números debe ser 10... Intenta nuevamente.");
        } else {
            for (int i = 0; i<cantidad; i++){
                System.out.print("Ingresa el valor del número entero " + (i+1) + ": ");
                int numeroIn = scanner.nextInt();
                menor = (numeroIn<menor) ? numeroIn:menor;
            }

            System.out.println("El menor de los números enteros comparados es: " + menor);

            if(menor<10){
                System.out.println("El número menor es menor que 10!");
            } else {
                System.out.println("El numero menor es igual o mayor que 10");
            }

        }

    }
}
