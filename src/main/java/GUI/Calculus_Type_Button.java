package GUI;

public class Calculus_Type_Button implements GUI_Element{

    private int x;
    private int y;

    public Calculus_Type_Button (int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void display() {
        System.out.println("Displaying a calculus button at coordinates (" + this.x + ";" + this.y + ").");
    }

    @Override
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
