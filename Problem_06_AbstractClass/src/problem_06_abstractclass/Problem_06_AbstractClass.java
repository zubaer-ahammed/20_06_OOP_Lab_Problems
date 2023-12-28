package problem_06_abstractclass;


abstract class Shape {
    
    int x, y;
    abstract void printArea();

}

class Rectangle extends Shape {

    @Override
    void printArea() {
        double area = x*y;
        System.out.println("Rectangle Area = "+area);
    }
    
}

class Triangle extends Shape {
    
    @Override
    void printArea() {
        double area = 0.5*x*y;
        System.out.println("Triangle Area = "+area);
    }
}

class Circle extends Shape {
    
    @Override
    void printArea() {
        double area = 3.1416*x*x;
        System.out.println("Circle Area = "+area);
    }
}

/**
 * ID: 20052801006
 * @author zubaer
 */
public class Problem_06_AbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle();
        rectangle.x = 12;
        rectangle.y = 14;
        rectangle.printArea();
        
        Triangle triangle = new Triangle();
        triangle.x = 15;
        triangle.y = 10;
        triangle.printArea();
        
        Circle circle = new Circle();
        circle.x = 5;
        circle.printArea();
        
        
    }
    
}
