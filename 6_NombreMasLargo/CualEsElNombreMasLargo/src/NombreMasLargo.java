import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog("Ingresar el nombre completo de un primer familiar o amigo(a):");
        String nombre2 = JOptionPane.showInputDialog("Ingresar el nombre completo de un primer familiar o amigo(a):");
        String nombre3 = JOptionPane.showInputDialog("Ingresar el nombre completo de un primer familiar o amigo(a):");

        String[] nom1 = nombre1.split(" ");
        String[] nom2 = nombre2.split(" ");
        String[] nom3 = nombre3.split(" ");

        String nombreMasLargo="";

        nombreMasLargo = (nom1[0].length()>nom2[0].length()) ? nombre1:nombre2;
        String[] largo = nombreMasLargo.split(" ");
        nombreMasLargo = (largo[0].length()>nom3[0].length()) ? nombreMasLargo:nombre3;

        System.out.println("La persona con el nombre más largo es: " + nombreMasLargo);

        }
}
