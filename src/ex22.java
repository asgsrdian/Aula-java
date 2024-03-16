import java.util.Scanner;

public class ex22 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double[] numero = new double[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Vetor[" + i +"]: ");
            numero[i] = scanner.nextDouble();

        }

        for(int i = 0; i < 5; i++){
            if(numero[i]>0){
                System.out.println("Vetor [" + i +"]: " + numero[i] + "\né positivo.");
            }
            else if(numero[i] == 0){
                System.out.println("Vetor [" + i +"]: " + numero[i] + "\né Zero.");


            }
            else{
                System.out.println("Vetor [" + i +"]: " + numero[i] + "\né negativo.");
            }
        }

        scanner.close();
    }
}
