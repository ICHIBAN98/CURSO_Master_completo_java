import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class CalculoEdad {
    public static void main(String[] args) {
        Date fechaNacimiento = new Date();
        Date fechaActual = new Date();

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingresa tu fecha de nacimiento en el formato: \"yyyy-MM-dd\"");
        try {
          fechaNacimiento = sdf.parse(scan.next());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        long diferencia = fechaActual.getTime() - fechaNacimiento.getTime();
        long diferenciaEnAnios = (((((diferencia/1000)/60)/60)/24)/365);
        System.out.println("Edad del usuario: " + diferenciaEnAnios + " años");

    }
}
