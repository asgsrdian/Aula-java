import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva valor 1: ");
        int a = scanner.nextInt();

        System.out.print("Escreva valor 2: ");
        int b = scanner.nextInt();

        System.out.print("Escreva valor 3: ");
        int c = scanner.nextInt();

        int temp;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Ordem crescente: " + a + ", " + b + ", " + c);

        scanner.close();

    }

}