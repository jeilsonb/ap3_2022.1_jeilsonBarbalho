package br.com.jeilsonbarbalho.ap3.aula6.questoes.projetofilme;

/* 
A classe Filme.java deve possuir dois atributos privados: título e duracaoEmMinutos.
Crie um construtor para a classe que recebe 2 parâmetros, cada um representando um dos atributos da classe.
Crie os métodos de acesso (get e set) para os atributos titulo e duracaoEmMinutos.
Crie um método exibirDuracaoEmHoras que converta o valor em minutos para horas e apresente a mensagem 
“O filme TITULO possui X horas e Y minutos de duração”. Por exemplo, 
dado o filme com título Titanic que possui 194 minutos de duração, a mensagem que deverá ser exibida para o usuário será: 
“O filme Titanic possui 3 horas e 14 minutos de duração”
Crie a classe TestaFilme.java que possua um método main() de modo que seja possível testar a classe Filme.
Crie um objeto umFilmeQualquer do tipo Filme. Utilize o construtor da classe passando os valores “Os Vingadores”, 
para o atributo título, e 142 para o atributo duracaoEmMinutos.
Chame o método exibirDuracaoEmHoras() para mostrar quantas horas o filme possui.
Crie um objeto meuFilmeFavorito do tipo Filme, cujo título deve ser o título do seu filme favorito e a 
duração deve ser iniciada em 100 minutos.
Altere o atributo duracaoEmMinutos do objeto meuFilmeFavorito para a duração correta do filme.
Chame o método exibirDuracaoEmHoras() do objeto meuFilmeFavorito para mostrar quantas horas/minutos o filme possui.
Exiba a mensagem: “Os filmes no catálogo são X e Y”, onde no lugar de X, 
deverá aparecer o título do umFilmeQualquer e no lugar de Y deverá aparecer o título do meuFilmeFavorito.
*/

public class TestaFilme {
    public static void main(String[] args) throws Exception {
        Filme umFilmeQualquer = new Filme("Os Vingadores", 142);
        umFilmeQualquer.exibirDuracaoEmHoras();

        Filme meuFilmeFavorito = new Filme("Your Name", 100);
        meuFilmeFavorito.setDuracaoEmMinutos(108);
        meuFilmeFavorito.exibirDuracaoEmHoras();

        System.out.println("\nOs filmes no catálogo são " + umFilmeQualquer.getTitulo() + " e " + meuFilmeFavorito.getTitulo());
    }
}