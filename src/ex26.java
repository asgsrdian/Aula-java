import java.util.Scanner;

public class ex26 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double[] nota = new double[5];
        double[] peso = new double[5];


        for(int i = 0; i < 5; i++){
            System.out.println("Nota " + (i+1)+": ");
            nota[i] = scanner.nextDouble();

        }

        for(int i = 0; i < 5; i++){
            System.out.println("Peso " + (i+1) + ": ");
            peso[i]  = scanner.nextDouble();


        }

        double notaPonderada = 0;
        double SomaPeso = 0;

        for (int i = 0; i < 5; i++) {
            notaPonderada = notaPonderada + (nota[i] * peso[i]);
            SomaPeso = SomaPeso + peso[i];

        }

        String resultado =  String.format("%.2f", notaPonderada/SomaPeso);

        System.out.println("Media ponderada: " + resultado);

        scanner.close();
    }
}
