import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe numero 1: ");
        int A = scanner.nextInt();

        System.out.print("Informe numero 2: ");
        int B = scanner.nextInt();

        if (A == B) {
            System.out.println("Os numeros informados são iguais");
        }

        else if (A != B && A > B) {
            System.out.println("São diferente e o maior numero é " + A);
        } else {
            System.out.println("São diferente e o maior numero é " + B);
        }
        scanner.close();
    }
}
