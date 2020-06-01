package structure.proxy;

public class HugeSizeFileProxy implements File {

    private HugeSizeFile file;

    @Override
    public void sendFile() {
        if (file == null) {
            file = new HugeSizeFile();
        }
        file.sendFile();
    }
}
