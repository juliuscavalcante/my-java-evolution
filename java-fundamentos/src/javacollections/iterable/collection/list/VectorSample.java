package javacollections.iterable.collection.list;

import java.util.List;
import java.util.Vector;

public class VectorSample {
    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        // Adicionando esportes ao Vector
        esportes.add("Futebol");
        esportes.add("Natação");
        esportes.add("Musculação");
        esportes.add("Corrida");

        System.out.println(esportes);

        // Alterando o valor do index 1 (Natação) do Vector
        esportes.set(1, "Jiu-Justu");
        System.out.println(esportes);

        // Removendo o index 3 (Corrida) do Vector
        esportes.remove(3);
        System.out.println(esportes);

        // Retornando o valor do index 0 do Vector
        System.out.println(esportes.get(0));

        // Compara se dois valores do Vector são iguais
        System.out.println(esportes.get(0).equals(esportes.get(1)));

        // Retorna se o Vector contém um valor específico
        System.out.println(esportes.contains("Futebol"));

        // Percorre entre os valores
        for (String esp : esportes) {
            System.out.println("- " + esp);
        }

        // Retorna um int com o tamanho do Vector
        System.out.println(esportes.size());

        // Limpa um Vector
        esportes.clear();

        // Retorna se o Vector está vazio ou não
        System.out.println(esportes.isEmpty());

    }
}
