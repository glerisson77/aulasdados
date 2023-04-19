package pilhaexer0102;

import pilha.Pilha;

import java.util.Scanner;

public class exer02 {

    public static void main(String[] args) {

        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <=10 ; i++) {

            int num = scan.nextInt();

            if (num==0){
                Integer desempilhado = par.desempilha();

                if (desempilhado == null){
                    System.out.println("Pilha par vazia: ");
                }else {

                    System.out.println("Desempilhando da pilha par" + desempilhado);
                }
            }

//            desempilhado = impar.desempilha();
//
//            if (desempilhado == null){
//                System.out.println("Pilha impar vazia: ");
//            }else {
//                System.out.println("Desempilhando da pilha impar" + desempilhado);
//            }

            if (num % 2 == 0){
                System.out.println("Número " + num + " empilhado");
                par.empilha(num);
            }else {
                impar.empilha(num);
                System.out.println("Número " + num + " empilhado");
            }

        }
    }
}
