import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Nota 3: ");
        double nota3 = scanner.nextDouble();

        String resultado= String.format("%.2f", 3 / ((1/nota1) + (1/nota2) + (1/nota3)));

        System.out.println("Media Harmonica: " + resultado);

        scanner.close();
    }    
}
