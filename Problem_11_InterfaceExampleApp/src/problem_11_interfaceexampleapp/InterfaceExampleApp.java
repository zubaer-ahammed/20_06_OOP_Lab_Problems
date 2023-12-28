package problem_11_interfaceexampleapp;

interface Animal {
    
    void eat();
    void sleep();
    void run();
}

class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping.");
    }
    
    public void run() {
        System.out.println("Cat is running.");
    }
       
}

class Cow implements Animal {

    @Override
    public void eat() {
        System.out.println("Cow is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Cow is sleeping.");
    }
    
    public void run() {
        System.out.println("Cow is running.");
    }
       
}


/**
 *
 * @author zubaer
 */
public class InterfaceExampleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cat cat = new Cat();
        Cow cow = new Cow();
        
        cat.eat();
        cat.sleep();
        cat.run();
        
        System.out.println("");
        
        cow.eat();
        cow.sleep();
        cow.run();
        
        
    }
    
}
