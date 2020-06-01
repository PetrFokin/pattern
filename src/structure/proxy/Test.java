package structure.proxy;

public class Test {
    public static void main(String[] args) {
        File file = new HugeSizeFileProxy();
        file.sendFile();
        file.sendFile();
    }
}
