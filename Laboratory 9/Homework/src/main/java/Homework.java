import entity.Album;
import entity.Artist;
import entity.Genre;

public class Homework {
    public static void main(String[] args) {
        Album firstAlbum = new Album(1,1979,"The Wall","Pink Floyd","Rock");
        AlbumRepository albumRepository = new AlbumRepository();
        albumRepository.create(firstAlbum);
        Artist artist = new Artist(1,"Pink Floyd");
        ArtistRepository artistRepository = new ArtistRepository();
        artistRepository.create(artist);
        Integer id = artist.getId();
        albumRepository.addArtist(id, artist);
        Album secondAlbum = new Album(2, 1980, "Name", "Awesome Band", "Rock, Pop, Metal");
        Genre genre = new Genre(1, "Rock");
        secondAlbum.addGenre(genre);
        secondAlbum.addGenre(new Genre(2, "Pop"));
        secondAlbum.addGenre(new Genre(3, "Metal"));
        albumRepository.create(secondAlbum);
        secondAlbum.removeGenre(genre);
        albumRepository.create(secondAlbum);
        albumRepository.close();
        artistRepository.close();
    }
}
