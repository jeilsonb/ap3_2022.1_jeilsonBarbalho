package br.com.jeilsonbarbalho.ap3.aula6.questoes.projetolivro;

/* 
A classe Livro possui os atributos titulo, qtdPaginas e paginasLidas. 
Esses atributos devem ser marcados com o modificador de acordo com a imagem.
Crie os métodos get e set para cada um dos atributos.
Crie dois construtores para a classe: o primeiro recebe 3 parâmetros, 
representando cada um dos atributos da classe. O segundo recebe apenas um parâmetro, representando o atributo título.
Crie o método verificarProgresso que deverá calcular a porcentagem de leitura do livro até o momento.
Para o cálculo do progresso isso, deverá usar os valores dos atributos qtdPaginas e paginasLidas, através da formula:
porcentagem = paginasLidas * 100 / qtdPaginas.
O valor da porcentagem deverá ser mostrado na tela conforme a mensagem: 
“Você já leu X por cento do livro”, onde o valor de X é o valor calculado pela fórmula apresentada.
Crie uma classe TestaLivro.java. Essa classe possuirá apenas o método main que servirá para testar a classe Livro.
Crie um objeto pequenoPrincipe do tipo Livro. Utilize o construtor que recebe apenas o título como parâmetro e 
passe o valor “O Pequeno Príncipe”;
Altere o atributo qtdPaginas para 98.
Escreva na tela a mensagem: “O livro X possui Y páginas”, onde no lugar de X deverá aparecer o valor do atributo titulo e, 
no lugar de Y deverá aparecer o valor do atributo qtdPaginas do objeto pequenoPrincipe.
Altere a quantidade de paginasLidas para 20;
Chame o método verificarProgresso.
Altere a quantidade de paginasLidas para 50;
Chame o método verificarProgresso.
Crie um novo objeto chamado meuLivro. Utilize o construtor que recebe os 3 parâmetros e passe as informações do livro 
que você está lendo no momento (ou do último livro que você leu).
Escreva na tela a mensagem: “O livro X possui Y páginas”, onde no lugar de X deverá aparecer o valor doatributo 
titulo e, no lugar de Y deverá aparecer o valor do atributo qtdPaginas do objeto meuLivro.
*/

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