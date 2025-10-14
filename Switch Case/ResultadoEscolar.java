public class ResultadoEscolar
{
    public static void main(String[] args) {
        int nota = 4;
        String situacao = "";

        if(nota >=5 && nota <7)
        {
            situacao = "Recuperação";
        }
        else if (nota >=7)
        {
            situacao = "Aprovado";
        }
        else
        {
            situacao = "Reprovado";
        }


        switch (situacao)
        {
            case "Recuperação":
            {
                System.out.println(situacao);
                System.out.println("Procure estudar mais!");
                break;
            }
            case "Aprovado":
            {
                System.out.println(situacao);
                System.out.println("Parabéns, você está aprovado.");
                break;
            }
            case "Reprovado":
            {
                System.out.println(situacao);
                System.out.println("Você está reprovado.");
            }

        }
    }
}