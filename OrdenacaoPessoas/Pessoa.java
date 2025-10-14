
//Implementando a interface Comparable para que seja possível criar e usar os métodos ordenarPorIdade e ordenarPorAltura

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    //Procure manter os métodos das interfaces após o construtor

    //Através do método .compare, que receberá dois inteiros, o Integer irá verificar(comparar) pra saber qual será o maior inteiro
    public int compareTo(Pessoa p){
        return Integer.compare(idade, p.getIdade());
    }


    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getAltura(){
        return altura;
    }

    @Override
    public String toString() {
        
        return "Pessoa: { " + "nome: " + getNome() + " | idade: " + getIdade() + " | altura: " + getAltura() + " }" ;
    }
 
}

//Criando a classe Comparator. O correto seria criar outro arquivo

class ComparatorPorAltura implements Comparator<Pessoa> {


    public int compare(Pessoa p1, Pessoa p2){
    
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
    
}    
