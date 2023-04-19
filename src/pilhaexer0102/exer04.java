package pilhaexer0102;

import pilha.Livro;
import pilha.Pilha;

import java.util.Stack;

public class exer04 {

    public static void main(String[] args) {
        Stack<Livro> livros = new Stack<Livro>();

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

        livros.push(livro1);
        livros.push(livro2);
        livros.push(livro3);
        livros.push(livro4);

        while (!livros.isEmpty()) {
            System.out.println(livros.pop().toString());
        }

        System.out.println(livros.size());

    }
}
