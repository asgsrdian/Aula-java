import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor digite numero 1: ");
        int A = scanner.nextInt();

        System.out.print("Por favor digite numero 2: ");
        int B = scanner.nextInt();

        if (A > B) {
            System.out.println("Numero " + A + " maior");
        } else {
            System.out.println("Numero " + B + " maior");
        }

        if (A == B) {
            System.out.println("Numero invalido");
        }

        scanner.close();
    }

}
