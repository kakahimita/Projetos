package ex066_udemy;

import entidades.Cliente;
import entidades.Ordem;
import entidades.OrdemItens;
import entidades.Produto;
import entidades.enums.OrdemStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author kakah
 */
public class Ex066_Udemy {


    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("data de Aniversario (DD/MM/YYYY): ");
        Date aniversario = sdf.parse(sc.next());
        
        Cliente cliente = new Cliente(nome, email, aniversario);
        
        System.out.println("Entre com os dados do pedido: ");
        System.out.print("Status: ");
        OrdemStatus status = OrdemStatus.valueOf(sc.next());
        
        Ordem ordem = new Ordem(new Date(), status, cliente);
        
        System.out.print("Quantos items o pedido vai ter?: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            System.out.println("digite #" + i + " item data:");
            System.out.print("Nome do produto: ");
            sc.nextLine(); // Limpar buffer de entrada
            String nomeProduto = sc.nextLine();
            System.out.print("Preço do produto: ");
            double precoProduto = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();
            
            Produto produto = new Produto(nomeProduto, precoProduto);
            
            OrdemItens it = new OrdemItens(quantidade, precoProduto, produto);
            
            ordem.adicionarItem(it);
        }
        
        System.out.println();
        System.out.println(ordem);
        
        sc.close();
    }
}
