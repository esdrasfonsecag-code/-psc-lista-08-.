import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();

        char resultado = verificarPositivoOuNegativo(numero);
        System.out.println("Resultado: " + resultado);

        sc.close();
    }

    static char verificarPositivoOuNegativo(double n) {
        if (n > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }
}
