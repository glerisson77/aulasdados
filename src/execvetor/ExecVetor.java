package execvetor;

import aula11.Lista;

public class ExecVetor {
    public static void main(String[] args) throws Exception {
        Lista<String> lista = new Lista<String>(10);
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        lista.add("A");
        lista.add("E");

//        if (lista.contem("D")){
//            System.out.println("existe");
//        }else {
//            System.out.println("não existe");
//        }

//        System.out.println(lista.lastIndexOf("E"));
//        lista.remove("D");
//        System.out.println(lista.turnToString());

//        System.out.println(lista.obtem(2));

//        System.out.println(lista.turnToString());
//
//        lista.limparLista();
//
//        System.out.println(lista.turnToString());

    }
}
