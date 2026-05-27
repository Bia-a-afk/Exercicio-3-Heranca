import java.util.Scanner;

public class SistemaProdutos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);




        // PRODUTO ESTADUAL
        
        System.out.println("=== PRODUTO ESTADUAL ===");

        System.out.print("Descricao: ");
        String desc1 = entrada.nextLine();

        System.out.print("Valor: ");
        float valor1 = entrada.nextFloat();

        ProdutoEstadual produto1 =
                new ProdutoEstadual(desc1, valor1);

        produto1.exibir();




        // LIMPAR BUFFER
        entrada.nextLine();




        // PRODUTO NACIONAL

        System.out.println("\n=== PRODUTO NACIONAL ===");

        System.out.print("Descricao: ");
        String desc2 = entrada.nextLine();

        System.out.print("Valor: ");
        float valor2 = entrada.nextFloat();

        ProdutoNacional produto2 =
                new ProdutoNacional(desc2, valor2);

        produto2.exibir();




        // LIMPAR BUFFER
        entrada.nextLine();




        // PRODUTO IMPORTADO

        System.out.println("\n=== PRODUTO IMPORTADO ===");

        System.out.print("Descricao: ");
        String desc3 = entrada.nextLine();

        System.out.print("Valor: ");
        float valor3 = entrada.nextFloat();

        ProdutoImportado produto3 =
                new ProdutoImportado(desc3, valor3);

        produto3.exibir();




        entrada.close();
    }
}