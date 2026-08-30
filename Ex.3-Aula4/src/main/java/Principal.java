import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Livro livro = new Livro();
        CD cd = new CD();

        System.out.print("Nome do livro: ");
        livro.nome = scanner.nextLine();
        System.out.print("Autor: ");
        livro.autor = scanner.nextLine();
        System.out.print("Preço do livro: ");
        livro.preco = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Nome do CD: ");
        cd.nome = scanner.nextLine();
        System.out.print("Número de faixas: ");
        cd.numFaixas = scanner.nextInt();
        System.out.print("Preço do CD: ");
        cd.preco = scanner.nextDouble();

        System.out.println("\n--- Informações ---");
        livro.exibeInformacoes();
        cd.exibeInformacoes();

        scanner.close();
    }
}
