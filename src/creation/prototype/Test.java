package creation.prototype;

import java.util.HashMap;
import java.util.Map;

public class Test {

    private static Map<String, Button> BUTTONS = new HashMap<>();

    static {
        BUTTONS.put("SQUARE_BUTTON", new SquareButton(10, 10));
    }


    public static void main(String[] args) {
        Button a = BUTTONS.get("SQUARE_BUTTON").copy();
        a.setLabel("A");
    }

}
