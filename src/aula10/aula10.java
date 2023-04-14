package aula10;

import vetor.Vetor;
import vetor.VetorObject;

public class aula10 {

    public static void main(String[] args) throws Exception {

        Pessoa pessoa1 = new Pessoa("Caio", 10, "M");
        Pessoa pessoa2 = new Pessoa("Alan", 11, "M");
        Pessoa pessoa3 = new Pessoa("Maria", 13, "F");

        VetorObject vetorObject = new VetorObject(3);

        vetorObject.add(pessoa1);
        vetorObject.add(pessoa2);
        vetorObject.add(pessoa3);

        System.out.println(vetorObject.turnToString());

        int pos = vetorObject.busca(pessoa1);
        if (pos > -1){
            System.out.println("existe");
        }else {
            System.out.println("não existe");
        }
    }
}
