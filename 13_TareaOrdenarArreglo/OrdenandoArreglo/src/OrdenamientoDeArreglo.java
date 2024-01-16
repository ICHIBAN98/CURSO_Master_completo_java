import java.util.Scanner;

public class OrdenamientoDeArreglo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arregloEnteros = new int[10];

        System.out.println("Ingrese 10 números enteros:");
        for (int i=0; i<arregloEnteros.length; i++) {
            int numIn = scan.nextInt();
            arregloEnteros[i] = numIn;
        }

        int[] arregloEnterosOrdenado = new int[10];
        int atras, delante;
        int j=0,k=0;
        for (int i=0; i<arregloEnteros.length/2; i++){
            atras = arregloEnteros[(arregloEnteros.length)-1-j];
            delante = arregloEnteros[j];
            arregloEnterosOrdenado[k] = atras;
            arregloEnterosOrdenado[k+1] = delante;
            j++;
            k+=2;
        }

        System.out.println("El nuevo orden del arreglo es:");
        for (int i=0; i<arregloEnterosOrdenado.length; i++){
            System.out.println("número " + i + " = " + arregloEnterosOrdenado[i]);
        }

    }
}
