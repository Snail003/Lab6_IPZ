package GUI;

import java.util.ArrayList;

import java.util.List;

// Композит для об'єднання графічних кнопок

public class GUI_Combiner implements GUI_Element{
    private List<GUI_Element> buttons = new ArrayList<>();

    public void addButton(GUI_Element element) {
        buttons.add(element);
    }

    @Override

    public void display() {
        for (GUI_Element button : buttons) {
            button.display();
        }
    }

    @Override
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public List<GUI_Element> getButtons() {
        return buttons;
    }
}
