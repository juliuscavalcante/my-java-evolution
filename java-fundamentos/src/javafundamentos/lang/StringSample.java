package javafundamentos.lang;

public class StringSample {

    public static void main(String[] args) {
        /**
         * A classe String é utilizada para respresentar conteudos alfanumericos, exemplo:
         * JOSE, maria, NIJ-3323, 123@master
         *
         * Link documentação oficial oracle versão 18
         * https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/String.html
         */
        metodoConcat();
        metodoContains();
        metodoIsBlank();
        metodoLowerUpperCase();
        metodoCompareTo();



        //dinamica do emissor de cheque valor extenso
        //Exibir o valor cheque por extenso em 50 caracteres completados por *
        //Exemplo: Um mil e duzentos reais ***************** -
    }
    static void metodoLowerUpperCase(){
        /** métodos que tornam as palavras  minusculas respectivamente*/

        String nome = "JULIUS CAVALCANTE";
        String nomeMinusculo = nome.toLowerCase();
        System.out.println(nomeMinusculo);

        java.lang.String deNovoMaiusculo = nomeMinusculo.toUpperCase();
        System.out.println(deNovoMaiusculo);
    }
    static void metodoConcat(){
        /** O metódo concat realiza a junção entre dois alfanumericos,
         * podendo ser de forma recursiva já que o retonro
         * deste método é um nova String*/

        String nome = "julius";
        String sobrenome = "cavalcante";
        //gleyson sampaio
        String nomeCompleto = nome.concat( " ").concat(sobrenome);
        System.out.println(nomeCompleto);

    }
    static void metodoContains(){
        /** O metódo contains analisa se existe o texto passado como parametro
         * em uma determinada variável do tipo String retorna um valor boolean
         * verdadeiro ou falso*/

        String nome = "julius";
        String palavra = "cavalcante";
        Boolean resposta = nome.contains(palavra); //ver aplicabilidade de usar classes Wrappers (toString)

        System.out.println("O nome ".concat(nome).concat(" contains a plavara ")
                .concat(palavra).concat("?\nResposta:").concat( resposta.toString() ));

    }
    static void metodoIsBlank(){
        /** Retorna true se a string estiver vazia ou contiver apenas
         codepoints de espaço em branco, caso contrário, false.
         * método disponível desde versão 11
         * */

        String palavra= "";

        //antes do java 11
        boolean vazia = palavra.trim().length() == 0;
        System.out.println("A palavra está vazia? " + vazia);

        //com do java 11
        //vazia = palavra.isBlank();
        System.out.println("A palavra está vazia? " + vazia);


        //vamos ver a diferença entre isBlank versus isEmpty
        //https://howtodoinjava.com/java11/check-blank-string/#:~:text=isBlank()%20vs%20isEmpty(),not%20check%20the%20string%20length.
    }

    static void metodoCompareTo() {

        /* O método compareTo compara duas Strings lexicograficamente (por ordem alfabética).
        O método retorna um número negativo caso a primeira String esteja na frente na ordem e
        um positivo caso a segunda String venha primeiro. Também existe o compareToIgnoreCase
        que ignora a diferença entre letras maiúsculas e minúsculas*/


        String string1 = "HelloWorld";
        String string2 = "helloworld";

        int comparacao = string1.compareTo(string2);
        if (comparacao < 0) {
            System.out.println("A primeira String: '" + string1 + "' está na frente na ordem alfabética");
        } else if (comparacao > 0) {
            System.out.println("A segunda String: '" + string2 + "' está na frente na ordem alfabética");
        } else {
            System.out.println("As duas Strings: '" + string1 + " e " + string2 + "' emptam na ordem alfabética");
        }

        String string3 = "HelloWorld";
        String string4 = "HelloWorld";

        int comparacao2 = string3.compareToIgnoreCase(string4);
        if (comparacao2 < 0) {
            System.out.println("A primeira String: '" + string1 + "' está na frente na ordem alfabética");
        } else if (comparacao2 > 0) {
            System.out.println("A segunda String: '" + string2 + "' está na frente na ordem alfabética");
        } else {
            System.out.println("As duas Strings: '" + string1 + " e " + string2 + "' emptam na ordem alfabética");
        }
    }
}

