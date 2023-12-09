import java.util.Scanner;

public class TareaMultiSinMulti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero para la multiplicación: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero para la multiplicación: ");
        int num2 = scanner.nextInt();

        int suma = 0;

        if (num2<0){
            num2 = -(num2);

            for (int i = 0; i<num2; i++){
                suma += num1;
            }

            suma = -(suma);

        } else if (num2>0) {
            for (int i = 0; i<num2; i++){
                suma += num1;
            }
        } else {
            suma=0;
        }

        System.out.println("El resultado de la multiplicación es: " + suma);

    }
}
