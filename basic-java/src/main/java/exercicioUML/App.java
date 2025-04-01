package exercicioUML;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iPhone = new Iphone();
        iPhone.ligar();
        iPhone.selecionarMusica("Bad Romance");
        iPhone.exibirPagina("Goofle");
        iPhone.ligar("987654321");
        iPhone.desligar();
    }
}
