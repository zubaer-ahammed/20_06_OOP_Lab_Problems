package problem_05_method_overloading;

class Room {
    
    float length;
    float bredth;
    
    public Room(float length, float bredth) {
        this.length = length;
        this.bredth = bredth;
    }
    
    public Room(float length) {
        this.length = length;
        this.bredth = length;
    }
    
    void showArea() {
        float area = length * bredth;
        System.out.println("Room area = "+area+" unit");
    }
    
}

/**
 * ID: 20052801006
 * @author zubaer
 */
public class Problem_05_Method_Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Room room1 = new Room(20, 15);
        Room room2 = new Room(25);
        
        room1.showArea();
        room2.showArea();
        
    }
    
}
