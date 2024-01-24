import java.util.Scanner;

public class MatrizImprimirH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dale un valor entero a \"n\":");
        String n = scanner.next();

        try {

            int m = Integer.parseInt(n);

            if (m <= 0) {
                System.err.println("ERROR, VALOR INVÁLIDO");
                System.exit(-1);
            }


            int[][] matriz = new int[m][m];

            System.out.println("El resultado es el siguiente:");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (j == 0) {
                        System.out.print(1);
                    } else if (i == matriz.length / 2) {
                        System.out.print(1);
                    } else if (j == matriz[i].length - 1 && i >= matriz.length / 2) {
                        System.out.print(1);
                    } else {
                        System.out.print(0);
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println("ERROR, VALOR INVÁLIDO");
            System.exit(-1);
        }

    }
}
