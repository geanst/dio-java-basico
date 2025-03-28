public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void ligar() {
        System.out.println("LIGAR");
    }
    public void desligar() {
        System.out.println("DESLIGAR");
    }
    public void tocar() {
        System.out.println("TOCAR");
    }
    public void pausar() {
        System.out.println("PAUSAR");
    }
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO " + musica);
    }
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA " + numero);
    }
    public void atender() {
        System.out.println("ATENDENDO");
    }
    public void iniciarCorreioVoz() {
        System.out.println("CORREIO DE VOZ");
    }
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("NOVA ABA");
    }
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }
}
