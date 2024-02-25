package POO.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> disponiveis = new ArrayList<>();

    public Biblioteca() {
        this.disponiveis = new ArrayList<>();
    }

    public void adicionarLivros(Livro dispLivro) {
        disponiveis.add(dispLivro);
    }

    public void verificarLivros() {
        System.out.println("Livros Disponíveis na Biblioteca:");
        for (Livro livro : disponiveis) {
            System.out.println(livro.toString());
        }
    }

    public void emprestarLivro(Livro livro) {
        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro não disponível para empréstimo.");
        }
    }

    public void removerLivros(Livro dispLivro) {
        disponiveis.remove(dispLivro);
    }

}
