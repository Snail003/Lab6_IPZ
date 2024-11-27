package GUI;

public interface Visitor {
    Object visit(Base_Type_Button button);
    Object visit(Calculus_Type_Button button);
    Object visit(Graphic_Type_Button button);
    Object visit(GUI_Combiner combiner);
}
