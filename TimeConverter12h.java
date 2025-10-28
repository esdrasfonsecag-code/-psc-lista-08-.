import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite a hora (0-23): ");
            int hora = sc.nextInt();

            System.out.print("Digite os minutos (0-59): ");
            int minutos = sc.nextInt();

            char periodo = converterHora(hora); // 'A' ou 'P'
            exibirHora(hora, minutos, periodo);

            System.out.print("\nDeseja converter outra hora? (S/N): ");
            continuar = sc.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        System.out.println("\nPrograma encerrado!");
        sc.close();
    }

    static char converterHora(int hora) {
        if (hora >= 12) {
            return 'P'; // PM
        } else {
            return 'A'; // AM
        }
    }

    static void exibirHora(int hora24, int minutos, char periodo) {
        int hora12 = hora24 % 12;
        if (hora12 == 0) hora12 = 12; // Ajuste para 12h

        String sufixo = (periodo == 'A') ? "A.M." : "P.M.";
        System.out.printf("Hora convertida: %d:%02d %s\n", hora12, minutos, sufixo);
    }
}
