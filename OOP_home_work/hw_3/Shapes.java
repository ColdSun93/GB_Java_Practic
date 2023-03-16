package OOP_home_work.hw_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Shapes {
    
    public static ArrayList<Figure> listShapes = new ArrayList<>();
    {
        listShapes.add(new Triangle(4.0,3.0,2.0));
        listShapes.add(new Rectangle(2.0,4.0));
        listShapes.add(new Circle(7.0));
        listShapes.add(new Square(3.0));
    }

    public int size() {
        return listShapes.size();
    }

    public void addTriangleShapes(Double a,Double b, Double c) {       
        Shapes.listShapes.add(new Triangle(a, b, c));
    }

    public void addRectangleShapes(Double a, Double b) {      
        Shapes.listShapes.add(new Rectangle(a, b));
    }

    public void addCircleShapes(Double r) {
        Shapes.listShapes.add(new Circle(r));
    }

    public void addSquareShapes(Double a) {
        
        Shapes.listShapes.add(new Square(a));
    }

    void showAll(){
        int index = 0;
        for (Figure shapes : listShapes) {
            System.out.printf("%d) ", index);
            System.out.println(shapes);
            index++;
        }
    }

    void deleteShapes(int num) {
        listShapes.remove(num);
    } 

    void setShapes(int num) {
        Shapes.listShapes.set(num,Shapes.listShapes.get(listShapes.size()-1));
        listShapes.remove(listShapes.size());
    }

    public void addCircle(Shapes shapes, Scanner input) {
    }
}
