import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o numero: ");
        int A = scanner.nextInt();

        if (A >= 50) {
            System.out.println("Maior que ou igual 50.");
        } else {
            System.out.println("Menor que 50.");
        }
        scanner.close();

    }

}
