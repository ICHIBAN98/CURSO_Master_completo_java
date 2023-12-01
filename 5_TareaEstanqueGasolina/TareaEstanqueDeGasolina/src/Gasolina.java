import java.util.Scanner;

public class Gasolina {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar medida actual de gasolina en litros: ");
        double gasolinaIn = scanner.nextDouble();

        if (gasolinaIn==70){
            System.out.println("Estanque lleno");
        } else if (70>gasolinaIn && gasolinaIn>=60) {
            System.out.println("Estanque casi lleno");
        } else if (60>gasolinaIn && gasolinaIn>=40) {
            System.out.println("Estanque  3/4");
        } else if (40>gasolinaIn && gasolinaIn>=35) {
            System.out.println("Medio Estanque");
        } else if (35>gasolinaIn && gasolinaIn>=20) {
            System.out.println("Suficiente");
        } else {
            System.out.println("Insuficiente");
        }

    }
}
