import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Ingresar la medida del radio(cm):");
        double radio = scanner.nextDouble();
        double area = Math.PI * Math.pow(radio,2);
        String areaRedondeado = df.format(area);
        System.out.println("El área del círculo es: " + areaRedondeado + "cm^2");
    }
}
