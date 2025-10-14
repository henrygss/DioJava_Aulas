public class ResultadoEscolar
{
    public static void main(String[] args) {
        int nota = 4;
        
        String resultado = nota >=5 && nota <7 ? "Recuperação" : nota >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }
}