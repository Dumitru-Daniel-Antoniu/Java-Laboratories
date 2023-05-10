import entity.Artist;
import entity.Album;

public class Laboratory9 {
    public static void main(String[] args) {
        Artist artist = new Artist(1,"Pink Floyd");
        artist.TestJPA();
        System.out.println(artist.getId());
        Singleton singleton = new Singleton();
        singleton.addElement(artist);

        Album album = new Album(1,1970, "Yes", "Music", "Rock");
        singleton.addElement(album);
        singleton.close();
    }
}
