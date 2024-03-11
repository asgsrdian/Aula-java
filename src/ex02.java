import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor digite numero 1: ");
        int A = scanner.nextInt();

        System.out.print("Por favor digite numero 2: ");
        int B = scanner.nextInt();

        System.out.println("A soma do primeiro numero  mais a soma do segundo numero é  " + (A + B) + " !!!");

        scanner.close();
    }

}
