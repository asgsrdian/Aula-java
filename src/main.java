import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        // criando um objeto do tipo aluno
        /*
         * Aluno aluno1 = new Aluno();
         * // setando valores do obj aluno1
         * 
         * aluno1.matricula = "AL01";
         * aluno1.nome = "jose";
         * aluno1.nota1 = 9.7f;
         * aluno1.nota2 = 3.2f;
         * 
         * Aluno aluno2 = new Aluno();
         * aluno2.matricula = "AL02";
         * aluno2.nome = "ricardo";
         * aluno2.nota1 = 3.2f;
         * aluno2.nota2 = 7.89f;
         * 
         * aluno1.calcularMedia();
         * aluno2.calcularMedia();
         */

        List<Aluno> turma = new ArrayList<Aluno>();

        Aluno aluno1 = new Aluno("AL01", "Jose", 9.7f, 3.2f);
        Aluno aluno2 = new Aluno("AL02", "ricardo", 3.2f, 7.89f);

        aluno1.calcularMedia();
        aluno2.calcularMedia();

        turma.add(aluno1);
        turma.add(aluno2);

    }

}
