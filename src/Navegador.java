import java.util.Scanner;

public class Navegador {

    public static void main(String[] args) {
        // Cria um scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o site
        System.out.println("Digite um site: ");
        String input = scanner.nextLine();

        // Exibe a string digitada
        System.out.println("Site solicitado " + input);

        // Adicionando uma nova aba
        System.out.println("Digite 'x' para adicionar aba: ");
        String input1 = scanner.nextLine();

        // Verifica se o usuário digitou 'x' (independentemente de maiúsculas/minúsculas)
        if (input1.equalsIgnoreCase("x")) { // Corrigido para input1
            System.out.println("Você digitou 'x', aba adicionada!");
        } else {
            System.out.println("Você não digitou 'x', programa encerrado.");
        }

        System.out.println("Digite 'x' para adicionar aba: ");
        String input2 = scanner.nextLine();

        // Verifica se o usuário digitou 'x' (independentemente de maiúsculas/minúsculas)
        if (input1.equalsIgnoreCase("x")) { // Corrigido para input1
            System.out.println("Você digitou 'x', aba adicionada!");
        } else {
            System.out.println("Você não digitou 'x', programa encerrado.");
        }

        // Fecha o scanner
        scanner.close();
    }
}

