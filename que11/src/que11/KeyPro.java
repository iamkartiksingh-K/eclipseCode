package que11;
import java.awt.*;
import java.awt.event.*;
public class KeyPro extends Frame{
	String msg = "";
    KeyPro(){
    	addKeyListener(new KeyAdapter() {
    		public void keyTyped(KeyEvent k) {
    	    	msg = "Typed Key is : " + k.getKeyChar();
    	    	repaint();
    	    }
    	});
    	addWindowListener(new WindowAdapter() {
    		public void windowClosing(WindowEvent w) {
    			System.exit(0);
    		}
    	});
    }
    
    public void paint(Graphics g) {
    	g.drawString(msg, 160, 200);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        KeyPro key = new KeyPro();
        key.setVisible(true);
        key.setSize(400, 400);
        key.setTitle("Hit a key on your Keyboard");
	}

}
