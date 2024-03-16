import java. util.Scanner;

public class ex21 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double[] numero = new double[5];

        double soma = 0;

        for(int i = 0;i < 5; i++){
            System.out.println("Digite Vetor [" + (i+1) + "]: ");
            numero[i] = scanner.nextDouble();

            soma= soma + numero[i];
        }

        double media = soma / 5;

        System.out.println("Média dos valores: " + media);

        for(int i  = 0; i < 5; i++){
            if(numero[i]>media){
                System.out.println("Vetor[" + i + "] Maior que Media.");
            }
            else if(numero[i] == media){
                System.out.println("Vetor[" + i + "] igual que Media.");
            }
            else{
                System.out.println("Vetor[" + i + "] menor que Media.");
            }
        }
        
        scanner.close();

    }
}
