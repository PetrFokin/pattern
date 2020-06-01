package structure.composite;

public class Test {

    public static void main(String[] args) {
        Data myComputer = new Folder("My computer");
        Data music = new Folder("Music");
        Data rammstein = new Folder("Rammstein");
        Data soundTrack = new File("Mutter");
        Data movie = new Folder("Movie");
        Data film = new File("Big Lebowsky");

        myComputer.add(music);
        myComputer.add(movie);
        music.add(rammstein);
        rammstein.add(soundTrack);
        movie.add(film);

        myComputer.display();
    }
}
