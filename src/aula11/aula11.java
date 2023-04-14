package aula11;

import aula10.Pessoa;
import vetor.VetorObject;


public class aula11 {

    public static void main(String[] args) throws Exception {

        Pessoa pessoa1 = new Pessoa("nome", 10, "F");

        Lista<Pessoa> lista = new Lista<Pessoa>(1);

        lista.add(pessoa1);
//        lista.add();
    }
}
