package pratica39;


import entidades.Product;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author kakah
 */
public class Pratica39 {


    public static void main(String[] args) throws ParseException{
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> p = new ArrayList<Product>();
        
        System.out.print("Quantos produtos: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Produto #" + i + " data:");
            System.out.print("comum, usado, importado (c/u/i)?:");
            String opcao = sc.next();
            System.out.print("nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("preco: ");
            double preco = sc.nextDouble();

            if (opcao.equals("i")) {
                System.out.print("Valor adicional: ");
                double valorAdicional = sc.nextDouble();

                p.add(new ProdutoImportado(nome, preco, valorAdicional));
            } else if (opcao.equals("u")) {
                System.out.print("data de compra (dd/MM/yyyy):");
                LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                p.add(new ProdutoUsado(nome, preco, data));
            } else {
                break;
            }
        }
        
        System.out.println("");
        System.out.println("PRICE TAG:");
        for (Product it : p) {
            System.out.println(it.valorIten());
        }
        sc.close();
    }

}
