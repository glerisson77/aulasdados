package aula07;

import vetor.Vetor;

public class aula07 {

    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(10);

        vetor.add("B");
        vetor.add("C");
        vetor.add("E");
        vetor.add("F");
        vetor.add("G");

        System.out.println(vetor.turnToString());

        vetor.add(0, "A");
        vetor.add(3, "D");

        System.out.println(vetor.turnToString());
    }
}
