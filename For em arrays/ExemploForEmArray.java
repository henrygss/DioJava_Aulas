public class ExemploForEmArray
{
    public static void main(String[] args) {
        String alunos[] = {"Henry", "Gabriel", "Silva", "Felipe", "John", "Arnold"};

        for (int i = 0; i < alunos.length; i++)
        {
            System.out.println("Aluno do índice " + i + ": " + alunos[i] );
        }
    }
}