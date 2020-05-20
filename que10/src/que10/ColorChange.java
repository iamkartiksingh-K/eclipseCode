package que10;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class ColorChange extends Frame implements ActionListener {

	private static final long serialVersionUID = 1L;
	Button redB,blueB;
    ColorChange(){
        
    	redB=new Button("RED");
		blueB=new Button("BLUE");
		redB.setBounds(120, 200, 100, 30);
		blueB.setBounds(230, 200, 100, 30);
		add(redB);add(blueB);
		redB.addActionListener(this);
		blueB.addActionListener(this);
    	
    }
    public void actionPerformed(ActionEvent a) {
    	if(a.getSource() == redB) {
    		setBackground(Color.RED);
    	}
    	else if(a.getSource() == blueB) {
    		setBackground(Color.BLUE);
    	}
    }
	public static void main(String[] args) {
		ColorChange c = new ColorChange();
	    c.setSize(500, 500);
	    c.setTitle("Color Change");
	    c.setVisible(true);
        c.setLayout(new FlowLayout());
	    c.addWindowListener(new WindowAdapter() {
    		public void windowClosing(WindowEvent w) {
    			System.exit(0);
    		}
    	});
	}

}
