package aula09;

import vetor.Vetor;

import java.util.Arrays;

public class aula09 {

    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(3);

        vetor.add("B");
        vetor.add("G");
        vetor.add("D");
//        vetor.add("E");
        vetor.add("F");

        System.out.println(vetor.turnToString());

        vetor.remove(1);

        System.out.println(vetor.turnToString());

        int pos = vetor.busca("E");
        if (pos > -1){
            vetor.remove(pos);
        }else {
            System.out.println("elemento E não existe no vetor");
        }

        System.out.println(vetor.turnToString());

    }
}
