package creation.prototype;

public class SquareButton implements Button {
    private String label;
    private int length;
    private int width;

    public SquareButton(int length, int width) {
        this.length = length;
        this.width = width;
    }

    private SquareButton(SquareButton button) {
        this.length = button.length;
        this.width = button.width;
        this.label = button.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public Button copy() {
        return new SquareButton(this);
    }

    @Override
    public String toString() {
        return "SquareButton{" +
                "label='" + label + '\'' +
                '}';
    }
}
