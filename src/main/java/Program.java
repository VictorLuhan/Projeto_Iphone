interface ReprodutorMusical {
    void reproduzirMusica();
    void pausarMusica();
    void avancarMusica();
    void repetirMusica();
}

interface Celular {
    void fazerChamada(String numero);
    void receberChamada(String numero);
    void encerrarChamada();
}

interface NavegadorDePesquisa {
    void abrirURL(String url);
    void fecharURL();
    void realizarBusca(String termo);
}

class IPhone implements ReprodutorMusical, Celular, NavegadorDePesquisa {
    // Implementações dos métodos das interfaces...

    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void avancarMusica() {
        System.out.println("Avançando para a próxima música.");
    }

    @Override
    public void retrocederMusica() {
        System.out.println("Voltando para a música anterior.");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Chamada para " + numero + " realizada.");
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Chamada de " + numero + " recebida.");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
    }

    @Override
    public void abrirURL(String url) {
        System.out.println("Abrindo URL: " + url);
    }

    @Override
    public void fecharURL() {
        System.out.println("Fechando URL.");
    }

    @Override
    public void realizarBusca(String termo) {
        System.out.println("Realizando busca por: " + termo);
    }
}

public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        iphone.reproduzirMusica();
        iphone.fazerChamada("123456789");
        iphone.abrirURL("https://www.example.com");
    }
}
