import java.util.Scanner;

public interface ReprodutorMusical {
    static void tocar(){
        System.out.println("Tocando Musica...");
    }
    static void pausar(){
        System.out.println("Pausando Musica...");
    }
    static void selecionarMusica() {
        Scanner numeroSelecionado = new Scanner(System.in);
        String Musica = "";
        System.out.println("Selecione uma das 4 Opções:");
        System.out.println("\n 1-Hip Hop \n 2-Funk \n 3-Sertanejo \n 4-Eletrônica");
        System.out.println("Digite o numero:");

        switch (numeroSelecionado.nextInt()) {
            case 1:
                System.out.println("Hip Hop selecionado!");
                Musica = "HipHop";
                break;
            case 2:
                System.out.println("Funk selecionado!");
                Musica = "Funk";
                break;
            case 3:
                System.out.println("Sertanejo selecionado!");
                Musica = "Sertanejo";
                break;
            case 4:
                System.out.println("Eletrônica selecionado!");
                Musica = "Eletrônica";
                break;
            default:
                System.out.println("Deve selecionar uma opção!");
                return;
        }
        System.out.println("Tocando: " + Musica);
    }
}
