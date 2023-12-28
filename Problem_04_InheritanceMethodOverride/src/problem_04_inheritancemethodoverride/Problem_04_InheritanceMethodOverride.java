package problem_04_inheritancemethodoverride;

class Fruit {
    
    public String name;
    public String taste;
    public String size;
    
    public void eat() {
        System.out.println("Name: Fruit Name");
        System.out.println("Taste: Fruit Taste");
    }
    
}

class Apple extends Fruit {

    @Override
    public void eat() {
        System.out.println("Fruit Name: Apple");
        System.out.println("Fruit Taste: Sweet");
    }
    
}


class Orange extends Fruit {

    @Override
    public void eat() {
        System.out.println("Fruit Name: Orange");
        System.out.println("Fruit Taste: Sour");
    }
    
}

/**
 * ID: 20052801006
 * @author zubaer
 */
public class Problem_04_InheritanceMethodOverride {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fruit fruit = new Fruit();
        fruit.eat();
        
        Apple apple = new Apple();
        apple.eat();
        
        Orange orange = new Orange();
        orange.eat();
        
    }
    
}
