import java.util.Scanner;

public class MayorOcurrenciaTarea {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arreglo = new int[10];

        System.out.println("Ingrese 10 números enteros entre 1 y 9:");
        for (int i=0; i<arreglo.length; i++){
            int numIn = scan.nextInt();
            if(numIn>=1 && numIn <= 9){
                arreglo[i] = numIn;
            } else {
                System.err.println("ERROR: Ingrese un número válido:");
                i--;
            }
        }

        int i;
        int numMayorOcurrencia = 0;
        int cantOcurrencias = 0;
        int cantOcurrenciasMayor = 0;

        for(i=0; i<arreglo.length; i++){
            for(int j=0; j<arreglo.length; j++){
                if(arreglo[i]==arreglo[j]){
                    cantOcurrencias++;
                }
            }
            if(cantOcurrencias>cantOcurrenciasMayor){
                cantOcurrenciasMayor = cantOcurrencias;
                numMayorOcurrencia = arreglo[i];
            }
            cantOcurrencias=0;
        }

        System.out.println("El número de mayor ocurrencia es " + numMayorOcurrencia + " y se repite " + cantOcurrenciasMayor + " veces.");

    }
}
