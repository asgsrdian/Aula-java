import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        int indiceMaior = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > vetor[indiceMaior]) {
                indiceMaior = i;
            }
        }

        int temp = vetor[indiceMaior];
        vetor[indiceMaior] = vetor[vetor.length - 1];
        vetor[vetor.length - 1] = temp;

        System.out.println("Vetor atualizado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
