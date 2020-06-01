package structure.proxy;

public class HugeSizeFile implements File {

    public HugeSizeFile() {
        loadFile();
    }

    @Override
    public void sendFile() {
        System.out.println("Sending...");
    }

    private void loadFile() {
        System.out.println("Loading...");
    }
}
