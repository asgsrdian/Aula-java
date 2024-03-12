import java.util.Scanner;

public class ex14{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro termo da progressão aritmética:");
        int primeiroTermo = scanner.nextInt();

        System.out.println("Digite a ordem do termo desejado:");
        int ordem = scanner.nextInt();

        System.out.println("Digite a razão da progressão aritmética:");
        int razao = scanner.nextInt();

        int resultado = calcularTermo(primeiroTermo, ordem, razao);
        System.out.println("O " + ordem + "-ésimo termo da progressão aritmética é: " + resultado);

        scanner.close();
    }

    public static int calcularTermo(int primeiroTermo, int ordem, int razao) {

        int termo = primeiroTermo + (ordem - 1) * razao;
        return termo;
    }
}