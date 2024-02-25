package POO.Biblioteca;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Autor autor1 = new Autor("Greg Mckeown", 47, "Inglês");
        Autor autor2 = new Autor("Dale Carnegie", 67, "Estadunisense");

        Livro livro1 = new Livro("Essencialismo", 2020, autor1);
        Livro livro2 = new Livro("Como fazer amigos e influenciar pessoas", 2019, autor2);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivros(livro1);
        biblioteca.adicionarLivros(livro2);

        biblioteca.verificarLivros();

        biblioteca.emprestarLivro(livro1);
        biblioteca.emprestarLivro(livro2);

        biblioteca.verificarLivros();

    }

}
