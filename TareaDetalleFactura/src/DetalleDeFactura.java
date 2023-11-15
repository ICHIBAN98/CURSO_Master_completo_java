import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        System.out.println("Ingrese el nombre o descripción de la Factura:");
        Scanner scanner = new Scanner(System.in);
        String nombreFactura = scanner.nextLine();

        System.out.println("Ingrese el precio del primer producto(S/.):");
        double precioUno = scanner.nextDouble();
        System.out.println("Ingrese el precio del segundo producto(S/.):");
        double precioDos = scanner.nextDouble();

        double montoBruto = precioUno+precioDos;
        double impuesto = montoBruto*0.19;
        double montoTotal = montoBruto+impuesto;

        System.out.println("La factura " + nombreFactura + " tiene como monto bruto S/." + montoBruto + ", el cual tiene un impuesto de S/." + impuesto + ".");
        System.out.println("Por lo tanto, el monto total es S/." + montoTotal);

    }
}
