import java.util.Scanner;
public class ex16 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Nota 1: ");
        double nota1= scanner.nextDouble();

        System.out.println("Nota 2: ");
        double nota2= scanner.nextDouble();

        System.out.println("Nota 3: ");
        double nota3= scanner.nextDouble();

        double media= (nota1 + nota2 + nota3) / 3;

        System.out.printf("--Media: %.2f", media);

        scanner.close();
        
    }
}
