import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe Variavel A: ");
        int A = scanner.nextInt();

        System.out.print("Informe variavel B: ");
        int B = scanner.nextInt();

        System.out.println("Variavel A= " + A);
        System.out.println("Variavel B= " + B);

        int C = 0;
        C = A;
        A = B;
        B = C;

        System.out.println("Troca A: " + A);
        System.out.println("Troca B: " + B);
        scanner.close();

    }

}
