public class RegrasDeDesconto {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.adicionaValor(59.90);
        System.out.println("Valor atual: " + livro.retornaValor());

        livro.valor -= livro.valor * 0.1;
        System.out.println("Valor com desconto: " + livro.retornaValor());
    }
}
