package OOP_home_work.hw_3;

public class program {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5.0, 3.0);
        Triangle triiangle = new Triangle(5.0, 3.0, 3.0);
        Circle circle = new Circle(7);
        

        Interface[] arr = new Interface[] {triiangle, rectangle, circle};
        for (int i = 0; i < arr.length; i++) {
            Print_Value(arr[i]);
        }

    }

    public static void Print_Value(Interface fig) {
        System.out.println(fig.Perimetr_Calculating());
        System.out.println(fig.Area_Calculating());

    }
}
