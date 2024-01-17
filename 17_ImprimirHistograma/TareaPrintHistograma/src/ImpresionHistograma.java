import java.util.Scanner;

public class ImpresionHistograma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arreglo = new int[12];

        System.out.println("Ingrese 12 números enteros entre 1 y 6:");
        for (int i=0; i<arreglo.length; i++){
            int numIn = scan.nextInt();
            if (numIn>=1 && numIn<=6){
               arreglo[i] = numIn;
            }else {
                System.err.println("ERROR: Ingrese un número válido.");
                i--;
            }
        }

        int cont1=0;
        int cont2=0;
        int cont3=0;
        int cont4=0;
        int cont5=0;
        int cont6=0;

        for(int num:arreglo){
            switch (num){
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
                case 6:
                    cont6++;
                    break;
            }
        }

        System.out.println();

        System.out.println("El histograma generado por el sistema es:");
        System.out.print("1: ");
        for (int i=0; i<cont1; i++){
            System.out.print("*");
        }
        System.out.println();

        System.out.print("2: ");
        for (int i=0; i<cont2; i++){
            System.out.print("*");
        }
        System.out.println();

        System.out.print("3: ");
        for (int i=0; i<cont3; i++){
            System.out.print("*");
        }
        System.out.println();

        System.out.print("4: ");
        for (int i=0; i<cont4; i++){
            System.out.print("*");
        }
        System.out.println();

        System.out.print("5: ");
        for (int i=0; i<cont5; i++){
            System.out.print("*");
        }
        System.out.println();

        System.out.print("6: ");
        for (int i=0; i<cont6; i++){
            System.out.print("*");
        }

    }
}
