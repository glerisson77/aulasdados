package pilhaexer01;

import pilha.Pilha;

import javax.swing.*;
import java.util.Scanner;

public class exer01 {

    public static void main(String[] args) {

        Pilha<Integer> integerPilha  = new Pilha<Integer>();

        Scanner scan = new Scanner(System.in);

        for (int i=1; i<=10; i++){
            System.out.println("Entre com umnúmero");

            int num = scan.nextInt();

            if (num % 2 ==0){
                System.out.println("Empilhando " + num);
                integerPilha.empilha(num);
            }else {
                Integer desempilhado = integerPilha.desempilha();

                if (desempilhado == null){
                    System.out.println("Pilha está vazia");
                }else {
                    System.out.println("Número ímpar, desempilhando um elemento da pilha" + desempilhado);
                }
            }
        }

        System.out.println("Todos os números foram lidos, desempilhando números da pilha");

        while (integerPilha.estaVazia()){
            System.out.println("Desempilhando um elemento da pilha" + integerPilha.desempilha());
        }

        System.out.println("Todos os elementos foram desempilhados");
    }


}
