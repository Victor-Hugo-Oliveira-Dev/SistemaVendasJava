package SistemaDeVendas;

public class Vendedor {
    private String nomeVendedor;
    private String matricula;
    
    public Vendedor(String nomeVendedor, String matricula) {
        this.nomeVendedor = nomeVendedor;
        this.matricula = matricula;
    }
    
    // Getters
    public String getNomeVendedor() {
        return nomeVendedor;
    }
    
    public String getMatricula() {
        return matricula;
    }
}