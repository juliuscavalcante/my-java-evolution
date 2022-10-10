package javafundamentos.lang;

import java.lang.Integer;

public class IntegerSample {

    public static void main(String[] args) {

        /**
         *  classe Integer envolve um valor do tipo primitivo int em um objeto
         *
         *  Link da documentação oficial oracle versão 17
         *  https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/Integer.html
         */

        // Métodos de teste
        metodoMaxAndMin(4, 5);


    }

    public static void metodoMaxAndMin(Integer n1, Integer n2) {

        /** retorna o maior e menor valor passado */

        System.out.println("Maior valor: " + Integer.max(n1,n2));
        System.out.println("Menor valor: " + Integer.min(n1,n2));
    }
}

