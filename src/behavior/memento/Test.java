package behavior.memento;

public class Test {
    public static void main(String[] args) {
        CareTaker saver = new CareTaker();
        Game game = new Game();
        game.setChapter("1");
        saver.addSave(game.createSave());
        game.setChapter("2");
        saver.addSave(game.createSave());
        game.setChapter("3");
        game.restoreSave(saver.getSave());
    }
}
