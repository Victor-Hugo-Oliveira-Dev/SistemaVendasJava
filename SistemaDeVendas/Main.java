package SistemaDeVendas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        
        System.out.println("----- Sistema de Vendas -----");
        
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("Digite o CPF do cliente: ");
        String CPF = scanner.nextLine();
        
        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();
        
        System.out.print("Digite o número de matrícula do vendedor: ");
        String matricula = scanner.nextLine();
        
        int opcao;
        do {
            System.out.println("\n----- Cadastro de Produtos -----");
            System.out.print("Nome do produto: ");
            String nomeProduto = scanner.nextLine();
            
            System.out.print("Preço do produto: ");
            double precoProduto = scanner.nextDouble();
            
            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
            
            produtos.add(new Produto(nomeProduto, precoProduto, quantidade));
            
            System.out.print("\nDigite 1 para adicionar outro produto ou 2 para finalizar: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
        } while (opcao == 1);
        
        double precoTotal = produtos.stream()
            .mapToDouble(Produto::getPrecoTotal)
            .sum();
            
        double bonus = precoTotal >= 1000 ? precoTotal * 0.2 : 0;
        
        // Chamada corrigida do método imprimir
        ImprimirCupomFiscal.imprimir(nomeCliente, CPF, nomeVendedor, matricula, 
                                    produtos, precoTotal, bonus);
        
        scanner.close();
    }
}