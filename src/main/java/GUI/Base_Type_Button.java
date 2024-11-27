package GUI;

/**
 * Button of base type.
 */

public class Base_Type_Button implements GUI_Element{

    private int x;
    private int y;

    /**
     * Coordinates of button on panel.
     */

    public Base_Type_Button (int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Displays button on display.
     */

    @Override
    public void display() {
        System.out.println("Displaying a base button at coordinates (" + this.x + ";" + this.y + ").");
    }

    /**
     * Accepts visitor.
     */

    @Override
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
