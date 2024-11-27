package GUI;

/**
 * Client
 */

public class Main {
    public static void main(String[] args) {
        GUI_Element base_button = new Base_Type_Button(10,20);
        GUI_Element base2_button = new Base_Type_Button(15,20);
        GUI_Element calculus_button = new Calculus_Type_Button(10,30);
        GUI_Element calculus2_button = new Calculus_Type_Button(20,30);
        GUI_Element calculus3_button = new Calculus_Type_Button(30,30);
        GUI_Element calculus4_button = new Calculus_Type_Button(40,30);
        GUI_Element graphic_button = new Graphic_Type_Button(25,10);
        GUI_Combiner composite = new GUI_Combiner();
        composite.addButton(base_button);
        composite.addButton(base2_button);
        composite.addButton(calculus_button);
        composite.addButton(calculus2_button);
        composite.addButton(calculus3_button);
        composite.addButton(calculus4_button);
        composite.addButton(graphic_button);
        composite.display();
        Visitor base_counter = new Base_Type_Counter();
        Visitor calculus_counter = new Calculus_Type_Counter();
        Visitor graphic_counter = new Graphic_Type_Counter();
        System.out.println(composite.accept(base_counter));
        System.out.println(composite.accept(calculus_counter));
        System.out.println(composite.accept(graphic_counter));
    }
}