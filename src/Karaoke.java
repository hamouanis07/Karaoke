import model.Song;
import model.SongBook;

public class Karaoke {
    public static void main(String[] args) {
        SongBook songBook = new SongBook();

        songBook.importFrom("songs.txt");

        KaraokeMachine machine = new KaraokeMachine(songBook);
        machine.run();

        System.out.println("Saving Book.....");

        songBook.exportTo("songs.txt");
    }
}
