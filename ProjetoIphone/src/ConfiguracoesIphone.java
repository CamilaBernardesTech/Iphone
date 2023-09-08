
import java.util.HashSet;
import java.util.Set;

public class ConfiguracoesIphone {

    Set<Agenda> listaContato = new HashSet<>();

    public Set<Agenda> getListaContato() {
        return listaContato;
    }

    public void setListaContato(Set<Agenda> listaContato) {
        this.listaContato = listaContato;
    }

    public void adicionarContato(String nome, int telefone, String email) {
        listaContato.add(new Agenda(nome, telefone, email));
        System.out.println(nome + " " + telefone + " " + email);

    }

    public void exibirContatos() {
        if (!listaContato.isEmpty()) {
            System.out.println(listaContato);
        }
    }

    public void ligarContato(String nome) {

        if (!listaContato.isEmpty()) {
            for (Agenda a : listaContato) {
                if (a.getNome().equalsIgnoreCase(nome)) {
                    System.out.println("Ligando para " + nome);

                }

            }

        }

    }

    public void removerContato(String nome) {
        Agenda contatosExcluidos = null;
        if (!listaContato.isEmpty()) {
            for (Agenda a : listaContato) {
                if (a.getNome().equalsIgnoreCase(nome)) {
                    contatosExcluidos = a;
                    break;

                }
            }
            listaContato.remove(contatosExcluidos);
        }
    }

    Set<ReprodutorMusical> iPod = new HashSet<>();
    boolean situacao;

    public void adicionarAlbum(String album, String artista, String musica) {
        iPod.add(new ReprodutorMusical(album, artista, musica));
        System.out.println("Seu album " + new ReprodutorMusical(album, artista, musica) + " foi adicionado!");
    }

    public void tocarMusica(String musica) {
        if (!iPod.isEmpty()) {
            for (ReprodutorMusical f : iPod) {
                if (f.getMusica().equalsIgnoreCase(musica)) {
                    situacao = true;
                    System.out.println("Tocando " + musica);

                }
            }
        }

    }

    public boolean pausarMusica() {
        if (situacao) {
            System.out.println("Música foi pausada!");

        } else {
            System.out.println("Impossível pausar musica");
        }
        return false;
    }

    public String selecionarArtista(String artista) {
        String artistaPorMusica;
        boolean temMusicaArtista = false;
        if (!iPod.isEmpty()) {
            for (ReprodutorMusical a : iPod) {
                if (a.getArtista().equalsIgnoreCase(artista)) {
                    temMusicaArtista = true;
                    artistaPorMusica = a.getMusica();
                    System.out.println("O artista " + artista + "possui estas faixas " + artistaPorMusica);

                }
            }
            if (!temMusicaArtista) {
                System.out.println("O artista " + artista + "não possui faixas!");
            }
        }
        return artista;
    }

    Set<Navegador> internet = new HashSet<>();

    private boolean status;

    public void adicionarAplicativos(String nome) {
        internet.add(new Navegador(nome));
        System.out.println(internet);
    }

    public void abrirApp(String aplicativo) {
        if (!internet.isEmpty() && status) {
            status = true;

            System.out.println("Aplicativo está sendo iniciado!");
        }

    }

    public boolean fecharApp(String nome) {
        if (situacao) {
            System.out.println(" aplicativo foi fechado com sucesso!");
        } else {
            System.out.println(" O aplicativo não pode ser fechado!");
        }
        return situacao;

    }

    public static void main(String[] args) {
        ConfiguracoesIphone config = new ConfiguracoesIphone();

        config.adicionarContato("eu", 123456, "eu");
        config.adicionarContato("eu2", 123456, "eu4");
        config.adicionarContato("eu3", 123456, "eu5");

        config.exibirContatos();
        config.ligarContato("eu");
        config.removerContato("eu");
        config.exibirContatos();
        config.adicionarAlbum("teste", "testyando", "testado");
        config.adicionarAlbum("teste1", "testyando1", "testado1");
        config.adicionarAlbum("teste2", "testyando2", "testado2");
        config.adicionarAlbum("teste3", "testyando3", "testado3");
        config.adicionarAlbum("teste2", "testyando2", "testado2222222222");
        config.adicionarAlbum("teste2", "testyando2", "testado2222");
        config.adicionarAlbum("teste2", "testyando2", "testado2222222");
        config.exibirContatos();
        config.tocarMusica("testado1");
        config.pausarMusica();
        config.pausarMusica();
        config.tocarMusica("testado1");
        config.pausarMusica();
        config.adicionarAplicativos("maps");
        config.adicionarAplicativos("waze");
        config.abrirApp("waze");
        config.fecharApp("waze");
        // config.selecionarArtista("testyando2");
        config.selecionarArtista("testyando2");
        config.selecionarArtista("euteste");
        config.selecionarArtista("testesemmusica");
    }

}
