import java.util.Scanner;

public class ReprodutorMusical {
    private String musicaAtual;
    private boolean tocando;

    // Método para selecionar uma música
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musicaAtual);
        pausar();  // Pausa a música ao selecionar uma nova
    }

    // Método para tocar a música
    public void tocar() {
        if (musicaAtual == null) {
            System.out.println("Nenhuma música selecionada. Selecione uma música antes de tocar.");
        } else if (!tocando) {
            tocando = true;
            System.out.println("Tocando: " + musicaAtual);
        } else {
            System.out.println("A música já está tocando.");
        }
    }

    // Método para pausar a música
    public void pausar() {
        if (tocando) {
            tocando = false;
            System.out.println("Música pausada: " + musicaAtual);
        } else {
            System.out.println("A música já está pausada.");
        }
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        Scanner scanner = new Scanner(System.in);

        // Loop para permitir ao usuário interagir com o reprodutor
        while (true) {
            System.out.println("Digite o nome da música para selecionar ou 'sair' para encerrar:");
            String musica = scanner.nextLine();

            if (musica.equalsIgnoreCase("sair")) {
                System.out.println("Saindo do reprodutor musical.");
                break; // Encerra o loop se o usuário digitar 'sair'
            }

            // Seleciona a música digitada pelo usuário
            reprodutor.selecionarMusica(musica);

            // Opções para o usuário controlar a reprodução
            System.out.println("Digite 'tocar' para tocar, 'pausar' para pausar ou 'sair' para encerrar:");
            String comando = scanner.nextLine();

            switch (comando.toLowerCase()) {
                case "tocar":
                    reprodutor.tocar();
                    break;
                case "pausar":
                    reprodutor.pausar();
                    break;
                case "sair":
                    System.out.println("Saindo do reprodutor musical.");
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
