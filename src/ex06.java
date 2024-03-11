import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe Grau em celsius: ");
        int A = scanner.nextInt();

        System.out.println("Graus em Fahrenheit: " + (9 * A + 160) / 5 + "°F");

        scanner.close();
    }

}
