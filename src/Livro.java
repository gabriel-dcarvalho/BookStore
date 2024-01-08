public class Livro {

    String nome;
    String descricao;
    double valor;
    String ISBN;
    Autor autor;

    void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do livro ");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + ISBN);

        if (this.temAutor()) {
            autor.mostrarDetalhes();
        }
        System.out.println("--");
    }

    public boolean aplicaDescontoDe(double porcentagem) {
        this.valor -= this.valor * porcentagem;
        return false;
    }

    boolean temAutor() {
        return this.autor != null;
    }

    void adicionaValor(double valor) {
        this.valor = valor;
    }

    double retornaValor() {
        return this.valor;
    }

}

