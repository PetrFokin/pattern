package behavior.memento;

public class Game {

    private String chapter;

    public Save createSave() {
        System.out.println(String.format("Chapter %s was saved", this.chapter));
        return new Save(this.chapter);
    }

    public void restoreSave(Save save) {
        String chapter = save.getState();
        System.out.println(String.format("Chapter %s was loaded", chapter));
        this.chapter = chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }
}
