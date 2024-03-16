import java.util.Scanner;

public class ex23 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double[] vetor1 = new double[5];
        double[] vetor2 = new double[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Vetor 1 [" + i + "]: ");
            vetor1[i] = scanner.nextDouble();

        }

        for(int i = 0; i < 5; i++){
            vetor2[i] = vetor1[i] * 2;
            System.out.println("Vetor 2[" + i + "]: " + vetor2[i]);
        }
        scanner.close();
    }
}
