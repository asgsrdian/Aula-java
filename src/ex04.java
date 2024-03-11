import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe primeiro numero:");
        int A = scanner.nextInt();

        System.out.println("Informe segundo numero:");
        int B = scanner.nextInt();
        scanner.close();

        int Soma = A + B;
        int Sub = A - B;
        float div = A / B;

        System.out.println("Soma= " + Soma);
        System.out.println("Subtração= " + Sub);
        System.out.println("Divisão= " + div);
    }

}
