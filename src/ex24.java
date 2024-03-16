import java.util.Scanner;

public class ex24 {

        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);

            double[] vetor = new double[5];
            double numero = 10;

            for(int i = 0; i < 5; i++){
                System.out.println("Vetor [" + i +"]: ");
                vetor[i] = scanner.nextDouble();
            }

            for(int i= 0; i < 5; i++){
                if(vetor[i] < numero){
                    System.out.println("Indice: "+ i);
                }
            }
            scanner.close();
        }
}
