import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/* Eu havia feito public class OrdenacaoNumeros implements Comparable<Integer>
porém, não faz sentido, já que a classe não é  um Integer e nem precisa ser comparável a um Integer  */ 
public class OrdenacaoNumeros{

    private List<Integer> listaNumeros;

    //Este atributo é desnecessário, pois serve apenas para o método compareTo(), que no caso nem foi utilizado, segundo o chat
    //private int numero;

    public OrdenacaoNumeros(){
        this.listaNumeros = new ArrayList<>();
    }

    /* Este método, nesse caso, é desnecessário, pois a classe não representa objetos comparáveis entre si,
     * e porque eu não deveria estar ordenando objetos do tipo OrdenacaoNumeros, mas sim pelo Integer, que já é 
     * naturalmente comparável
     
    public int compareTo(Integer n) {
        // TODO Auto-generated method stub
        return Integer.compare(n, numero);
    } */



    /*public int getNumero() {
        return numero;
    } */


    /*Não era necessário instanciar um new Integer(numero), como eu havia feito
    public void adicionarNumero(int numero){
        listaNumeros.add(new Integer(numero));
    }
    */

    //Forma correta
    public void adicionarNumero(int numero){
        listaNumeros.add(numero);

    }


    public List<Integer> ordenarAscendente(){

        List<Integer> ordenarPorMenor = new ArrayList<>(listaNumeros);

        Collections.sort(ordenarPorMenor);

        return ordenarPorMenor;

    }

    public List<Integer> ordenarDescendente(){

        List <Integer> ordenarPorMaior = new ArrayList<>(listaNumeros);


        Collections.sort(ordenarPorMaior);
        Collections.reverse(ordenarPorMaior);

        return ordenarPorMaior;

        /*Aqui eu poderia ter feito simplesmente:
        
        ordenarPorMaior.sort(Collection.reverseOrder());
        */
    }

    public static void main(String[] args) {
        
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(20);
        ordenacaoNumeros.adicionarNumero(-5);
        ordenacaoNumeros.adicionarNumero(30);
        ordenacaoNumeros.adicionarNumero(50000);
        ordenacaoNumeros.adicionarNumero(40);
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(-5);
        ordenacaoNumeros.adicionarNumero(-10);
        ordenacaoNumeros.adicionarNumero(0);


        System.out.println(ordenacaoNumeros.ordenarAscendente());

        System.out.println(ordenacaoNumeros.ordenarDescendente());



    }


}