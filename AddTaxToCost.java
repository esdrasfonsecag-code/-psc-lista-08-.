import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a taxa de imposto (%): ");
        double taxaImposto = sc.nextDouble();

        System.out.print("Digite o custo do produto: R$ ");
        double custo = sc.nextDouble();

        double custoComImposto = somaImposto(taxaImposto, custo);
        System.out.printf("Valor final com imposto: R$ %.2f\n", custoComImposto);

        sc.close();
    }

    static double somaImposto(double taxaImposto, double custo) {
        return custo + (custo * taxaImposto / 100);
    }
}
