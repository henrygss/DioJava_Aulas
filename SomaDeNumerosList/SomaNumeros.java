import java.util.List;
import java.util.ArrayList;


public class SomaNumeros {
    
    /*Fiz dessa forma:
    private List<Numeros> listaNumeros;
    */

    //Forma correta:
    private List<Integer> listaNumeros;
    //Cria uma lista do tipo Integer para armazenar os números inteiros.

    public SomaNumeros(){
        this.listaNumeros = new ArrayList<>(); 
    }

    public void adicionarNumero(int numero){

        listaNumeros.add(numero);
    }

    public int calcularSoma(){

       
        int somarNumeros = 0;

        if (!listaNumeros.isEmpty()){
            for (int n : listaNumeros){
             somarNumeros += n;
            }
        }else {
            throw new RuntimeException("A lista está vazia");
        }
        
        //Dessa forma, o programa simplesmente retorna 0, mesmo se a lista estiver vazia
        return somarNumeros;
    }

    public int encontrarMaiorNumero(){
        
        /*Fiz dessa forma:
        int numero = 0;
        Porém, isso pode dar problema se todos os números forem negativos ou maiores que 100, por exemplo.
        */

        //Forma correta:
        int maiorNumero = Integer.MIN_VALUE;
        //Técnica padrão para este tipo de operação
        //Aqui, são usados os maiores valores possíveis para garantir que qualquer número real da lista irá sobrescrevê-los corretamente

        if (!listaNumeros.isEmpty()){
            for (int n : listaNumeros){
                if (n > maiorNumero){

                    maiorNumero = n;

                }   
            }
        }else{
            throw new RuntimeException("A lista está vazia");
        }

        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        
        /*Fiz dessa forma:
        int numero = 100;
        Porém, isso pode dar problema se todos os números forem negativos ou maiores que 100, por exemplo.
        */

        //Forma correta:
        int menorNumero = Integer.MAX_VALUE;

        if (!listaNumeros.isEmpty()){
            for (int n : listaNumeros){
                if (n < menorNumero){

                    menorNumero = n;

                }   
            }
        }else{
            throw new RuntimeException("A lista está vazia");
        }

        return menorNumero;

    }

    public void exibirNumeros(){

        /*A forma que fiz acaba imprimindo baseado no método ToString, que toda vez terá, nesse caso, 'Número: 10, Número: 20...'
        System.out.println(listaNumeros);
        */

        //Forma correta:
        System.out.println(this.listaNumeros);
    }


    public static void main(String[] args) {
        
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(40);
        somaNumeros.adicionarNumero(50);
        somaNumeros.adicionarNumero(110);
        somaNumeros.adicionarNumero(-5);
        somaNumeros.adicionarNumero(50);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(1);






        System.out.println(somaNumeros.calcularSoma());
        somaNumeros.exibirNumeros();

        System.out.println(somaNumeros.encontrarMaiorNumero());
        
        System.out.println(somaNumeros.encontrarMenorNumero());

    }


}