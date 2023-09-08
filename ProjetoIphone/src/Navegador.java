public class Navegador {
    private String nomeApp;

    public String getNomeApp() {
        return nomeApp;
    }

    public Navegador(String nomeApp) {
        this.nomeApp = nomeApp;
    }

    @Override
    public String toString() {
        return "Navegador [nomeApp=" + nomeApp + "]";
    }
}
