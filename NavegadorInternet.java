public interface NavegadorInternet {

    static void exibirPagina(String url) {
        System.out.println("Exibindo: " + url);
    }
    static void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba!");
    }
    static void atualizarPagina() {
        System.out.println("Atualizando a Pagina...");
    }

}
