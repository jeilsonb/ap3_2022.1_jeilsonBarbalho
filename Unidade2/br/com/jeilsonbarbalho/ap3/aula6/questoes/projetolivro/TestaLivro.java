package br.com.jeilsonbarbalho.ap3.aula6.questoes.projetolivro;

public class TestaLivro {
    public static void main(String[] args) throws Exception {
        Livro pequenoPrincipe = new Livro("O Pequeno Príncipe");
        pequenoPrincipe.setQtdPaginas(98);

        System.out.println("\nO livro "+ pequenoPrincipe.getTitulo() +" possui "+ pequenoPrincipe.getQtdPaginas()+" páginas");

        pequenoPrincipe.setPaginasLidas(20);
        pequenoPrincipe.verificarProgresso();

        pequenoPrincipe.setPaginasLidas(50);
        pequenoPrincipe.verificarProgresso();

        Livro meuLivro = new Livro("Harry Potter e a Pedra Filosofal", 208, 137);
        System.out.println("\nO livro "+ meuLivro.getTitulo() +" possui "+ meuLivro.getQtdPaginas()+" páginas");

        meuLivro.setPaginasLidas(137);
        meuLivro.verificarProgresso();
    }
}