package Model;

public class Produto {

    int id;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade, int id){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Produto: " + this.getNome() + " preço: " + this.getPreco()  + " Quantidade: " + this.getQuantidade();
    }
}
