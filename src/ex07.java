import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o numero: ");
        int A = scanner.nextInt();

        if (A <= 200 && A >= 100) {
            System.out.println("O numero está no intervalo entre 100 e 200.");
        } else {
            System.out.println("O numero nao está no intervalo entre 100 e 200.");
        }
        scanner.close();

    }

}
