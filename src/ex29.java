import java.util.Scanner;
public class ex29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorB[i] = scanner.nextInt();
        }

        int[] vetorC = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            if (i % 2 == 0) {
                vetorC[i] = vetorA[i]; 
            } else {
                vetorC[i] = vetorB[i]; 
            }
        }

         System.out.println("Vetor C:");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println(); 
        scanner.close();
    }
}