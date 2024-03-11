import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe numero: ");
        int A = scanner.nextInt();

        switch (A) {
            case 1:
                System.out.println("Uma");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;

            default:
                System.out.println("Número inválido!");

                break;
        }
        scanner.close();
    }
}
