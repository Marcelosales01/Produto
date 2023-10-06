
public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Produto A", 10.0, 50);

        produto.exibirEstoque();
        produto.adicionarEstoque(10);
        produto.exibirEstoque();
        produto.vender(30);
        produto.exibirEstoque();
    }
}