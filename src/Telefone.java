import java.math.BigInteger;
import java.util.Scanner;

public class Telefone {

    private boolean ligando;
    private BigInteger numero; // Usando BigInteger para armazenar números de telefone

    // Método para selecionar um número
    public void selecionarNumero(BigInteger numero) {
        this.numero = numero;
        System.out.println("Número selecionado: " + numero.toString()); // Converte BigInteger para String
    }

    // Método para ligar
    public void ligar() {
        if (numero == null) {
            System.out.println("Número inválido");
        } else if (!ligando) {
            ligando = true;
            System.out.println("Ligando: " + numero.toString());
        } else {
            System.out.println("Chamada já em andamento.");
        }
    }

    // Método para desligar
    public void desligar() {
        if (ligando) {
            ligando = false;
            System.out.println("Desligando: " + numero.toString());
        } else {
            System.out.println("Nenhuma chamada em andamento.");
        }
    }

    // Método para pausar
    public void pausar() {
        if (ligando) {
            System.out.println("Chamada pausada: " + numero.toString());
            desligar(); // Desliga após pausar
        } else {
            System.out.println("Nenhuma chamada em andamento para pausar.");
        }
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        Telefone chamada = new Telefone();
        Scanner scanner = new Scanner(System.in);

        // Loop para permitir ao usuário interagir com o celular
        while (true) {
            System.out.print("Digite um número para ligar ou 'sair' para encerrar: ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                System.out.println("Saindo do aplicativo.");
                break; // Encerra o loop se o usuário digitar 'sair'
            }

            try {
                BigInteger numero = new BigInteger(entrada); // Converte a string para BigInteger
                chamada.selecionarNumero(numero); // Seleciona o número
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
                continue; // Volta ao início do loop para nova entrada
            }

            // Opções para o usuário controlar a chamada
            System.out.println("Digite 'ligar' para ligar, 'desligar' para desligar ou 'pausar' para pausar:");
            String comando = scanner.nextLine();

            switch (comando.toLowerCase()) {
                case "ligar":
                    chamada.ligar();
                    break;
                case "desligar":
                    chamada.desligar();
                    break;
                case "pausar":
                    chamada.pausar();
                    break;
                case "sair":
                    System.out.println("Saindo do aplicativo.");
                    scanner.close();
                    return; // Encerra o programa
                default:
                    System.out.println("Comando inválido. Tente novamente.");
            }
        }

        // Fechando o scanner
        scanner.close();
    }
}
