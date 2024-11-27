package GUI;

/**
 * Interface for any GUI element
 */

public interface GUI_Element {
    void display();
    Object accept(Visitor visitor);
}
