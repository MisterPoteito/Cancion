
import java.time.Duration;

public class Cancion {
    private String Titulo;
    private String Artista;
    private Duration Duracion;
    private boolean Favorito;
    private boolean Descargada;
    
    public Cancion(String Titulo, String Artista, Duration Duracion, boolean Favorito, boolean Descargada) {
        this.Titulo = Titulo;
        this.Artista = Artista;
        this.Duracion = Duracion;
        this.Favorito = Favorito;
        this.Descargada = Descargada;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public Duration getDuracion() {
        return Duracion;
    }

    public void setDuracion(Duration Duracion) {
        this.Duracion = Duracion;
    }

    public boolean isFavorito() {
        return Favorito;
    }

    public void setFavorito(boolean Favorito) {
        this.Favorito = Favorito;
    }

    public boolean isDescargada() {
        return Descargada;
    }

    public void setDescargada(boolean Descargada) {
        this.Descargada = Descargada;
    }
        
}
