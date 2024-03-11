import java.util.ArrayList;
import java.util.List;

public class java {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        String itemParaAdicionar = "Hello";

        // Adicionando a string à lista 5 vezes
        for (int i = 0; i < 5; i++) {
            lista.add(itemParaAdicionar);
        }

        System.out.println(lista);
    }
}
