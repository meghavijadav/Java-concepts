import javax.swing.*;
import java.awt.event.*;
public class EventHandlingDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Handling Demo");
        JButton button = new JButton("Click Me");
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame,
                "Button clicked!"));
        button.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse pressed");
            }
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse released");
            }
        });
        button.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                System.out.println("Mouse moved");
            }
        });
        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}