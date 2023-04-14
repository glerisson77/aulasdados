package aula161718;

import pilha.Pilha;

import java.util.Stack;

public class aula161718 {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        pilha.empilha(10);
        pilha.empilha(11);
        pilha.empilha(12);
        pilha.empilha(13);
        pilha.empilha(14);

//        System.out.println(pilha.toString());

        Stack<Integer> stack = new Stack<Integer>();

        System.out.println(stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.peek());

    }
}
