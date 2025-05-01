package SistemaDeVendas;

public class Pagamento {
    private double precoTotal;
    
    public Pagamento(double precoTotal) {
        this.precoTotal = precoTotal;
    }
    
    public double calcularAVista() {
        return precoTotal * 0.9; // 10% de desconto
    }
    
    public double calcularAPrazo() {
        return precoTotal * 1.08; // 8% de acréscimo
    }
}