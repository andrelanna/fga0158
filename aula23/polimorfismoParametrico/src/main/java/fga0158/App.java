package fga0158;

import fga0158.artistas.Artista;
import fga0158.producoes.Album;

public class App {
    public static void main(String[] args) {
        Cadastro<Artista> cadArt = new Cadastro<Artista>();
        Cadastro<Album> cadAlbum = new Cadastro<Album>();
        
        cadArt.cadastrar(new Artista("Marisa Monte", 60));
        cadArt.cadastrar(new Artista("Chico Buarque", 80));
    }
}
