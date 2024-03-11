import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite um numero inteiro: ");

        int A = scanner.nextInt();

        if (A > 10) {
            System.out.println("Numero maior que 10!");
        }
        if (A <= 10) {
            System.out.println("Numero menor ou igual a 10");
        }
        scanner.close();

    }

}
