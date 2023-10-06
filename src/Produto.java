public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeInicial) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeInicial;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEmEstoque += quantidade;
            System.out.println(quantidade + " unidades de " + nome + " adicionadas ao estoque.");
        } else {
            System.out.println("A quantidade a ser adicionada deve ser maior que zero.");
        }
    }

    public void vender(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            System.out.println(quantidade + " unidades de " + nome + " vendidas.");
        } else if (quantidade <= 0) {
            System.out.println("A quantidade a ser vendida deve ser maior que zero.");
        } else {
            System.out.println("Estoque insuficiente para vender " + quantidade + " unidades de " + nome + ".");
        }
    }

    public void exibirEstoque() {
        System.out.println("Estoque atual de " + nome + ": " + quantidadeEmEstoque + " unidades.");
    }
}
