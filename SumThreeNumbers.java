import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int c = sc.nextInt();

        int resultado = somaTresNumeros(a, b, c);
        System.out.println("A soma dos três números é: " + resultado);

        sc.close();
    }

    static int somaTresNumeros(int x, int y, int z) {
        return x + y + z;
    }
}
