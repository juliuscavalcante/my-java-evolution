package javacollections.iterable.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSample {

    /* Documentação: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/List.html
     *
     * Principais características:
     * garantir a ordem de isernção;
     * permitir adição, atualização, leitura e remoção sem regras adicionais;
     * permitir ordenação através de Comparator
     *
     */

    public static void main(String[] args) {

        List<String> cores = new ArrayList<>();

        cores.add("Preto");
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Amarelo");
        cores.add("Vermelho");
        cores.add("Branco");

        System.out.println("Lista original:\n" + cores);

        // substitui o conteúdo de acordo com o index
        cores.set(2, "Cinza");
        System.out.println("\nLista com substituição:\n" + cores);

        // Ordena em ordem alfabética
        Collections.sort(cores);
        System.out.println("\nLista ordenada:\n" + cores);

        // Remove o conteúdo de acordo com o index
        cores.remove(1);

        // Remove o conteúdo de acordo com o nome
        cores.remove("Preto");
        System.out.println("\nLista com remoção:\n" + cores);

        // Retorna um elemento de acordo com o index informado
        String cor = cores.get(3);
        System.out.println("\nCor determinada:\n" + cor);

        // Retorna a posição de determinado item da lista
        int posicao = cores.indexOf("Branco");
        System.out.println("\nPosição da cor informada:\n" + posicao);

        // Informa o tamanho da lista
        int tamanho = cores.size();
        System.out.println("\nTamanho da lista:\n" + tamanho);

        // Retorna true ou false para dado existente ou não na lista
        boolean exists = cores.contains("Verde");
        System.out.println("\nA lista contém a item informado:\n" + exists);


        // Navega nos itens da lista:
        System.out.println("\nLista Cores: ");
        Iterator<String> iterator = cores.listIterator();
        while (iterator.hasNext()) {
            System.out.println(" - " + iterator.next());
        }

        // Limpa a lista completamente
        cores.clear();

        // Verifica se a lista está vazia
        boolean vazia = cores.isEmpty();
        System.out.println("\nA lista está vazia:\n" + vazia);
    }
}

