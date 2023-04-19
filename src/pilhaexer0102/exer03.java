package pilhaexer0102;

import pilha.Livro;
import pilha.Pilha;

public class exer03 {

    public static void main(String[] args) {

        Pilha<Livro> livros = new Pilha<Livro>(20);

        Livro livro1 = new Livro();
        livro1.setNome("livro1");
        livro1.setAutor("autorlivro1");
        livro1.setAnoLancamento(2010);
        livro1.setIsbn("AS4FDSG");

        Livro livro2 = new Livro();
        livro2.setNome("livro2");
        livro2.setAutor("autorlivro2");
        livro2.setAnoLancamento(2010);
        livro2.setIsbn("SDF55D5");

        Livro livro3 = new Livro();
        livro3.setNome("livro3");
        livro3.setAutor("autorlivro3");
        livro3.setAnoLancamento(2010);
        livro3.setIsbn("DS5D45X");

        Livro livro4 = new Livro();
        livro4.setNome("livro4");
        livro4.setAutor("autorlivro4");
        livro4.setAnoLancamento(2012);
        livro4.setIsbn("T4G5FC4CX5");

        livros.empilha(livro1);
        livros.empilha(livro2);
        livros.empilha(livro3);
        livros.empilha(livro4);

        while (!livros.estaVazio()){
            System.out.println(livros.desempilha().toString());
        }

        System.out.println(livros.tamanho());
    }
}
