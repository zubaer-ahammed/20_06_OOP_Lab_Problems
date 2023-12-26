package problem_09_mouseevents;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MouseEventsApp extends JFrame implements MouseListener {

    JFrame actualWindow;
    JLabel message;

    public MouseEventsApp() {
        
        actualWindow = new JFrame("Mouse Tracking");
        message = new JLabel("Mouse Events");
        
        actualWindow.addMouseListener(this);
        message.setHorizontalAlignment(JLabel.CENTER);
        actualWindow.add(message);
        actualWindow.setSize(500, 500);
        actualWindow.setVisible(true);
        
    }
    
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        message.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        message.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        message.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        message.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        message.setText("Mouse Exited");
    }
    
}

/**
 *
 * @author zubaer
 */
public class Problem_09_MouseEvents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new MouseEventsApp();
    }
    
}
