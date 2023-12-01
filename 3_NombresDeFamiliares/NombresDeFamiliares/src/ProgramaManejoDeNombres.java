import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre de un familiar:");
        String nombreUno = scanner.nextLine();
        String nombreUnoMod = manejarNombre(nombreUno);

        System.out.print("Ingresa el nombre de otro familiar:");
        String nombreDos = scanner.nextLine();
        String nombreDosMod = manejarNombre(nombreDos);

        System.out.print("Ingresa el nombre de un último familiar:");
        String nombreTres = scanner.nextLine();
        String nombreTresMod = manejarNombre(nombreTres);

        System.out.println("");

        System.out.print(nombreUnoMod + "_" + nombreDosMod + "_" + nombreTresMod);
    }

    private static String manejarNombre(String x){
        String nombreModificado = x.toUpperCase().charAt(1) + "." + x.substring(x.length()-2);
        return nombreModificado;
    }

}
