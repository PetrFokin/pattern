package behavior.observer;

public class Test {
    public static void main(String[] args) {
        Observable post = new FacebookPost("Hello world!");
        Observer user = new User(post);
        post.attacheObserver(user);
        post.changeState("What can I watch today?");
    }
}
