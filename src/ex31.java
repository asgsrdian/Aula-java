import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

        System.out.println("Digite os elementos do vetor 1:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do vetor 2:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        int produtoEscalar = 0;
        for (int i = 0; i < vetor1.length; i++) {
            produtoEscalar += vetor1[i] * vetor2[i];
        }

        System.out.println("Produto escalar entre os vetores:");
        System.out.println(produtoEscalar);

        scanner.close();
    }
}

