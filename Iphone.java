public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{
    public static void main(String[] args) {

        System.out.println("--Aplicativo de Musica--");
        ReprodutorMusical.selecionarMusica();
        ReprodutorMusical.tocar();
        ReprodutorMusical.pausar();
        System.out.println("--Aplicativo de Musica--");

        System.out.println("\n");

        System.out.println("--Navegador de Internet--");
        NavegadorInternet.exibirPagina("Google");
        NavegadorInternet.adicionarNovaAba();
        NavegadorInternet.atualizarPagina();
        System.out.println("--Navegador de Internet--");

        System.out.println("\n");

        System.out.println("--Aparelho Telefonico--");
        AparelhoTelefonico.ligar("1234-56789");
        AparelhoTelefonico.atender();
        AparelhoTelefonico.iniciarCorreioVoz();
        System.out.println("--Aparelho Telefonico--");
    }
}
