import java.util.Scanner;
public class ex15{

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double [][] ponto1  = new double[2][2];;
        double [][] ponto2 = new double[2][2];

        for(int i = 0; i<2; i++){
            System.out.println("Informe Vetor 1[0][" + i + "]: ");
            ponto1[0][i] = scanner.nextInt();
        }

        for(int i = 0; i<2; i++){
            System.out.println("Informe Vetor [1][" + i + "]: ");
            ponto2[1][i] = scanner.nextInt();
        }

        double resultado = Math.sqrt(Math.pow((ponto2[1][0] - ponto1[0][0]), 2) + Math.pow((ponto2[1][1] - ponto1[0][1]), 2));
        
        System.out.println("Distância entre os pontos: " + resultado);

        scanner.close();
    }
}