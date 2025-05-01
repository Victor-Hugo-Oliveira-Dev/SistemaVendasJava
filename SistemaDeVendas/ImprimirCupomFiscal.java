package SistemaDeVendas;

import java.util.List;

public class ImprimirCupomFiscal {
    public static void imprimir(String nomeCliente, String CPF, String nomeVendedor, 
                              String matricula, List<Produto> produtos, double precoTotal, double bonus) {
        System.out.println("\n----- Cupom Fiscal -----");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("CPF: " + CPF);
        System.out.println("Vendedor: " + nomeVendedor);
        System.out.println("Matrícula: " + matricula);
        
        System.out.println("\n--- Itens ---");
        for (Produto p : produtos) {
            System.out.println(p.getNomeProduto() + "\t" + p.getQuantidade() + " x " + 
                             String.format("R$ %.2f", p.getPrecoProduto()) + " = " + 
                             String.format("R$ %.2f", p.getPrecoTotal()));
        }
        
        System.out.println("\nTotal: " + String.format("R$ %.2f", precoTotal));
        
        if (bonus > 0) {
            System.out.println("Bônus do vendedor: " + String.format("R$ %.2f", bonus));
        }
        
        System.out.println("-----------------------");
    }
}