import java.util.Scanner;
import java.util.Locale;

public class AboutMe
{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try
        {
            System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        //Imprimindo os dados recebidos pelo usuário
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        }
        catch(java.util.InputMismatchException e)
        {
            System.out.println("Os campos idade e altura precisam ser numéricos!");
        }
        finally
        {
            scanner.close();
        }
        

    }
}