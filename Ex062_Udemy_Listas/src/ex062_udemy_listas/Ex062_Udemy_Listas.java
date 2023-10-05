package ex062_udemy_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author kakah
 */
public class Ex062_Udemy_Listas {


    public static void main(String[] args) {
        
        // Udemy - Listas
        
        /* Listas em java são coleções de objetos que podem ser
         * alteradas em tempo de execução. elas são implementadas pela 
         * classe List, que é uma interface presente na API Collections.
         *
         * Tipo (interface): List
         * classes que implementam: ArraysList, LinkedList, etc.
         *
         * Vantagens:
         * Tamanho variável
         * Facilidade para se realizar inserções e deleções
         *
         * Desvantagens:
         * Acesso sequencial aos elementos *
        */
        /* Alguns comandos da Lista:
         *
         * Tamanho da Lista: size()
         *
         * Inserir elemento na lista: add(obj), add(int, obj)
         *
         * Remover elementos da lista: remove(obj), remove(int),
         * removeIf(Predicate)
         * 
         * Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
         *
         * Filtrar lista com base em precidado:
         * List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
         * 
         * Encontrar primeira ocorrência com base em predicado:
         * Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
        */

        List<String> list = new ArrayList<>();
        
        list.add("Mariz");
        list.add("joao");
        list.add("luis");
        list.add("ana");
        
        // inserir um novo elemento na posição 2
        list.add(2, "marco");
        
        // imprimir o tamanho da lista
        System.out.println(list.size());
        
        // remover iten da lista
        list.remove("ana");
        list.remove(0);
        for (String x : list) {
            System.out.println(x);
        }
        
        System.out.println("------------------");
        
        // removendo lista com 'predicado'
        // removendo todos da lista que tenham 'M'
        list.removeIf(x -> x.charAt(0) == 'm');
        
        for (String x : list) {
            System.out.println(x);
        }
        
        System.out.println("------------------");
        
        // para encontrar a posição de algum elemento na lista
        System.out.println("Posição de luis: " + list.indexOf("luis"));
        // quando n for encontrado nenhum iten na lista e retornado -1
        System.out.println("Posição de ana: " + list.indexOf("ana"));
        
        System.out.println("------------------");
        
        // Para filtrar a lista com pessoas que tem 'L' em seu nome:
        // utilizando predicado.
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'l').collect(Collectors.toList());
        
        for (String x : result) {
            System.out.println(x);
        }
        
        System.out.println("------------------");
        
        /* vamos supor que vc queira encontrar o primeiro elemento
         * que comece com a letra 'j' utilizando predicado
        */
        String nome = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
        System.out.println(nome);
        
    }

}
