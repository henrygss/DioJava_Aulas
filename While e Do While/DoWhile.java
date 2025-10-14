public class DoWhile 
{
    public static void main(String[] args) 
    {
        int numero = 1;
        
        do{
            System.out.println(numero);
            numero += numero;
        }
        while (numero < 50);
    }    
}
