package SistemaDeVendas;

public class Produto {
    private String nomeProduto;
    private double precoProduto;
    private int quantidade;
    
    public Produto(String nomeProduto, double precoProduto, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidade = quantidade;
    }
    
    public double getPrecoTotal() {
        return precoProduto * quantidade;
    }
    
    public String getNomeProduto() {
        return nomeProduto;
    }
    
    public double getPrecoProduto() {
        return precoProduto;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    @Override
    public String toString() {
        return nomeProduto + " - " + quantidade + " x " + precoProduto + " = " + getPrecoTotal();
    }
}