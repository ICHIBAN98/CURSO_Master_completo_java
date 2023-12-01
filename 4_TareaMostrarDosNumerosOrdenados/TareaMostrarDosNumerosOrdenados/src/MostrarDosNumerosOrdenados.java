import java.util.Scanner;

public class MostrarDosNumerosOrdenados {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un primer número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese un segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("");

        String resultado = (num1>num2)? "mayor: " + num1 + "\nmenor: " + num2 : "mayor: " + num2 + "\nmenor: " + num1;

        System.out.println("Este es el orden:\n" + resultado);

    }
}
