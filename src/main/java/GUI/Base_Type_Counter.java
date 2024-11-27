package GUI;

import java.util.List;

public class Base_Type_Counter implements Visitor{
    @Override
    public Object visit(Base_Type_Button button) {
        return 1;
    }

    @Override
    public Object visit(Calculus_Type_Button button) {
        return 0;
    }

    @Override
    public Object visit(Graphic_Type_Button button) {
        return 0;
    }

    @Override
    public Object visit(GUI_Combiner combiner) {
        List<GUI_Element> buttons = combiner.getButtons();
        int counter = 0;
        for (GUI_Element button : buttons) {
            counter = counter + (Integer) button.accept(this);
        }
        System.out.println("Amount of base counters: " + counter);
        return counter;
    }
}
