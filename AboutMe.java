package aulas;

import java.util.Scanner;
import java.util.Locale;

public class AboutMe
{
    public static void main(String [] args)
    {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try{

        
        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        //Imprimindo os dados recebidos pelo usuário
        System.out.println("Olá, meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho" + " " + idade + " anos");
        System.out.println("Minha altura é de" + " " + altura + "m"); 
        }
        finally
        {
            scanner.close();
        }


        /*String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);*/

        



    }
}