package que8;
import java.awt.*;
import java.awt.event.*;
public class FramesWithMouse extends Frame
 {
	static int len = 200;
	static int wid = 200;
     FramesWithMouse(String title){
    	 super(title);
    	 
    	 addMouseListener(new MouseAdapter() {
    		 public void mouseClicked(MouseEvent m) {
    			 setSize(len, wid);
    		 }
    		 public void mouseEntered(MouseEvent m) {
    			 setSize(3*len, 3*wid);
    		 }
    		 public void mouseExited(MouseEvent m) {
    		     dispose();
    		 }
    	 });
    	 addWindowListener(new WindowAdapter() {
    		 public void windowClosing(WindowEvent w) {
    		    dispose();	 
    		 }
    	 });
     }
     
     public static void main(String[] args) {
    	 FramesWithMouse f = new FramesWithMouse("Variable Frame");
    	 f.setSize(len, wid);
    	 f.setVisible(true);
     }
}
