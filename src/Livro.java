public class Livro {

    String nome;
    String descricao;
    double valor;
    String ISBN;
    Autor autor;

    void MostrarDetalhes (){
        System.out.println("Mostrando detalhes do livro");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + ISBN);
        System.out.println("----------");
    }
}


