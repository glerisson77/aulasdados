package aula15;

import pilha.Pilha;

public class Aula15 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha.estaVazio());

        pilha.empilha(10);
        pilha.empilha(11);
        pilha.empilha(12);
        pilha.empilha(13);
        pilha.empilha(14);

        System.out.println(pilha.estaVazio());
    }
}
