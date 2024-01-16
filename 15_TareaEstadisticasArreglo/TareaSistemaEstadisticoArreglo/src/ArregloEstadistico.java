import java.util.Scanner;

public class ArregloEstadistico {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arreglo = new int[7];

        System.out.println("Ingrese 7 números enteros:");
        for (int i=0; i<arreglo.length; i++){
            arreglo[i] = scan.nextInt();
        }

        int contadorPositivos=0, contadorNegativos=0, contadorCeros=0;
        double sumaPositivos=0, sumaNegativos=0;
        for(int i=0; i<arreglo.length; i++){
            if (arreglo[i] > 0){
                sumaPositivos += arreglo[i];
                contadorPositivos++;
            }
            if (arreglo[i] == 0){
                contadorCeros++;
            }
            if (arreglo[i] < 0){
                sumaNegativos+=arreglo[i];
                contadorNegativos++;
            }
        }

        System.out.println("El promedio de los números positivos es: " + sumaPositivos/contadorPositivos);
        System.out.println("El promedio de los números negativos es: " + sumaNegativos/contadorNegativos);
        System.out.println("La cantidad de números CERO es: " + contadorCeros);

    }
}
