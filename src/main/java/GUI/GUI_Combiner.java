package GUI;

import java.util.ArrayList;

import java.util.List;

// Композит для об'єднання графічних кнопок

/**
 * Composite to add (or do operations on) buttons
 */

public class GUI_Combiner implements GUI_Element{
    private List<GUI_Element> buttons = new ArrayList<>();

    /**
     * Adds new GUI element
     */

    public void addButton(GUI_Element element) {
        buttons.add(element);
    }

    /**
     * Overrides interface display to display everything in composite.
     */

    @Override

    public void display() {
        for (GUI_Element button : buttons) {
            button.display();
        }
    }

    /**
     * Accepts visitor.
     */

    @Override
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }

    /**
     * Returns a list of GUI elements in composite.
     */

    public List<GUI_Element> getButtons() {
        return buttons;
    }
}
