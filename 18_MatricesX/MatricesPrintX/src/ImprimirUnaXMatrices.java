import java.util.Scanner;

public class ImprimirUnaXMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un valor entero para \"n\": ");
        int n = scanner.nextInt();

        System.out.println("La matriz resultante es:");
        System.out.println();

        String[][] matriz = new String[n][n];

        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                if (i==j || (i+j==n-1)){
                    matriz[i][j] = "X";
                    System.out.print(matriz[i][j]);
                } else {
                    matriz[i][j] = "_";
                    System.out.print(matriz[i][j]);
                }
            }
            System.out.println();
        }
    }
}
