import java.util.Scanner;

public class ImpresionMasAlto {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arreglo = new int[7];

        System.out.println("Ingrese 7 números entre 11 y 99:");
        for (int i=0; i<7; i++){
            int num = scan.nextInt();
            if(num<=99 && num>=11){
                arreglo[i]=num;
            }else {
                System.err.println("ERROR: Ingrese un número válido:");
                i--;
            }
        }

        int max = 0;
        for (int i=0; i<arreglo.length; i++){
            if (arreglo[i]>max){
                max = arreglo[i];
            }
        }

        System.out.println("el mayor número del arreglo es: " + max);

    }
}
