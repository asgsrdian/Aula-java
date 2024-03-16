import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Horas: ");
        Double horas = scanner.nextDouble();

        System.out.println("Velocidade media: ");
        Double velocidade = scanner.nextDouble();

        Double KmPercorrido = horas * velocidade;

        String litro = String.format("%.2f", KmPercorrido / 12);

        System.out.print("Litros Gastos: " + litro);

        scanner.close();
    }    
}
