public interface AparelhoTelefonico {
    static void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }
    static void atender(){
        System.out.println("Atendendo ligação...");
    }
    static void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz...");
    }
}
