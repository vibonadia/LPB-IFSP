package exemploUsoInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // cria uma lista e armazena 3 pessoas nela
        List<Pessoa> listaPessoas = new ArrayList<>();

        Pessoa p1 = new Pessoa("Maria", 20);
        Pessoa p2 = new Pessoa("Joana", 18);
        Pessoa p3 = new Pessoa("Asdrubal", 19);

        listaPessoas.add(p1);
        listaPessoas.add(p2);
        listaPessoas.add(p3);

        // imprime a lista de pessoas
        System.out.println("Lista original");
        imprimePessoas(listaPessoas);

        // Ordena a lista de pessoas. 
        // Posso usar o método "sort" da classe Collecions para ordenar qualquer lista
        // para isso é necessário que a classe dos objetos da lista implemente
        // a interface "Comparable"
        // Neste exemplo a classe "Pessoa" implementa a interface "Comparable"
        Collections.sort(listaPessoas);
        
        System.out.println("Lista após a ordenação por nome");
        imprimePessoas(listaPessoas);
        
        // Posso usar o método "sort" para ordenar qualquer lista, 
        // desde que eu informe como comparar os objetos da lista. 
        // Uma forma de fazer isso, é passar como parâmetro para o método sort
        // um objeto de uma classe que implementa a interface "ComparadorIdade"
        // Neste exemplo, o objeto "comparaIdade" é da classe ComparadorIdade que
        // implementa a interface "ComparadorIdade"
        ComparadorIdade comparaIdade = new ComparadorIdade();
        Collections.sort(listaPessoas, comparaIdade);

        System.out.println("Lista após a ordenação por idade");
        imprimePessoas(listaPessoas);

    }

    private static void imprimePessoas(List<Pessoa> pessoas) {
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }

}
