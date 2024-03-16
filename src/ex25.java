import java.util.Scanner;

public class ex25 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[5];
        double soma = 0;

        for(int i = 0; i < 5; i++){
            System.out.println("Vetor ["+ i +"]: ");
            vetor[i] = scanner.nextDouble();

        }

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        for(int i = 0; i < 5; i++){
            if(vetor[i] == numero){
                soma= soma+1;
            }
        }
        System.out.println("Vezes que apareceu: " + soma);

        scanner.close();
    }
}
