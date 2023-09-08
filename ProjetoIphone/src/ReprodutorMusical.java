public class ReprodutorMusical {
    private String album;
    private String artista;
    private String musica;

    public String getMusica() {
        return musica;
    }

    public String getAlbum() {
        return album;
    }
 
    public String getArtista() {
        return artista;
    }

    public ReprodutorMusical(String album, String artista, String musica) {
        this.album = album;
        this.artista = artista;
        this.musica = musica;
    }

    @Override
    public String toString() {
        return "ReprodutorMusical [album=" + album + ", artista=" + artista + ", musica=" + musica + "]";
    }


}
