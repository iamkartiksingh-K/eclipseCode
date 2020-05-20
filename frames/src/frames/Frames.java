package frames;
import java.awt.*;
import java.awt.event.*;
 
public class Frames extends Frame implements MouseListener, MouseMotionListener {
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Frames(String title){
    	 super(title);
    	 
         this.addWindowListener(new WindowAdapter(){  
             public void windowClosing(WindowEvent e) {  
                 dispose();  
             }
         });  
         addMouseListener(this);
         addMouseMotionListener(this);
         setSize(400, 400);
         setVisible(true);
     }
     String msg = "";
     int mouseX = 0, mouseY = 0;
     public void mouseClicked(MouseEvent m) {
    	 mouseX = 0;
    	 mouseY = 10;
    	 msg = "Mouse clicked";
    	 repaint();
     }
     public void mouseEntered(MouseEvent m) {
    	 mouseX = 0;
    	 mouseY = 10;
    	 msg = "mouse entered";
    	 repaint();
     }
     public void mouseExited(MouseEvent m) {
    	 mouseX = 0;
    	 mouseY = 10;
    	 msg = "mouse Exited";
     }
     public void mousePressed(MouseEvent m) {
    	 mouseX = m.getX();
    	 mouseY = m.getY();
    	 msg = "Down";
    	 repaint();
     }
     public void mouseReleased(MouseEvent m) {
    	 mouseX = m.getX();
    	 mouseY = m.getY();
    	 msg = "UP";
    	 repaint();
     }
     public void mouseDragged(MouseEvent m) {
    	 mouseX = m.getX();
    	 mouseY = m.getY();
    	 msg = "*";
    	 repaint();
     }
     public void mouseMoved(MouseEvent m) {
    	 
     }
     public void paint(Graphics g) {
    	 g.drawString(msg, mouseX, mouseY);
     } 
     
};
