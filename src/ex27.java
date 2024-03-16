import java.util.Scanner;
public class ex27 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double[] vetor1 = new double[5];
        double[] vetor2 = new double[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Vetor[" + i +"]: ");
            vetor1[i] = scanner.nextDouble();
        }

        for(int i = 0; i < 5; i++){
            System.out.println("Vetor[" + i +"]: ");
            vetor2[i] = scanner.nextDouble();
        }

        boolean saoDiferentes = false;
        for(int i = 0; i < 5; i++){
            if(vetor1[i] != vetor2[i]){
                saoDiferentes = true;
                break;
            }
        }

        if(saoDiferentes){
            System.out.println("Os vetores são diferentes.");
        } else {
            System.out.println("Os vetores são iguais.");
        }


        
        scanner.close();


    }
}
