package GUI;

public interface GUI_Element {
    void display();
    Object accept(Visitor visitor);
}