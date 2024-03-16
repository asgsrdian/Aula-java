import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Raio: ");
        Double raio = scanner.nextDouble();

        System.out.print("Altura: ");
        Double altura = scanner.nextDouble();

        String volume = String.format("%.2f", 3.14 * (raio * raio) * altura);
        
        System.out.print("Volume do cilindro: " + volume);

        scanner.close();
    }    
}
