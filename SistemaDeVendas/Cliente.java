package SistemaDeVendas;

public class Cliente {
    private String nomeCliente;
    private String CPF;

    // Construtor correto - não é uma classe aninhada
    public Cliente(String nomeCliente, String CPF) {
        this.nomeCliente = nomeCliente;
        this.CPF = CPF;
    }

    // Adicione getters e setters
    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCPF() {
        return CPF;
    }
}