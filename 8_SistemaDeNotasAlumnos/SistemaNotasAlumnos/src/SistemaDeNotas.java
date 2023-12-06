import java.util.Scanner;

public class SistemaDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = 0.0;
        System.out.println("A continuación, se le pedirá que ingrese 20 notas finales del 1 al 7: ");

        double sumaNotas = 0.0;
        double sumaMayor5 = 0.0;
        int cantNotasMayor5 = 0;
        double sumaMenor4 = 0.0;
        int cantNotasMenor4 = 0;
        int cantNotas1 = 0;

        for (int i = 0; i<20; i++){
            System.out.print("Ingrese la nota " + (i+1) + ": ");
            nota = scanner.nextDouble();

            if(nota<=0 || nota>7){
                System.out.println("ERROR: Nota inválida");
                break;
            } else {
                if(nota>5){
                    sumaMayor5 += nota;
                    cantNotasMayor5++;
                }
                if(nota<4){
                    sumaMenor4 += nota;
                    cantNotasMenor4++;
                }
                if(nota==1){
                    cantNotas1++;
                }
                sumaNotas += nota;
            }
        }

        if (nota<=0 || nota>7){
            System.exit(0);
        }

            double promTotal = sumaNotas/20;
            double promNotasMayor5 =  sumaMayor5/cantNotasMayor5;
            double promNotasMenor4 = sumaMenor4/cantNotasMenor4;

            System.out.println("Promedio total: " + promTotal);
            System.out.println("Promedio de las notas mayores a 5: " + promNotasMayor5);
            System.out.println("Promedio de notas inferiores a 4: " + promNotasMenor4);
            System.out.println("Cantidad de notas 1: " + cantNotas1);


    }
}
