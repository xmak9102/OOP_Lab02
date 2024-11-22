package javabasics;

/**
 * 
 */
import javax.swing.JOptionPane;

public class ChoosingOption {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = JOptionPane.showConfirmDialog(null, "First class ticket?", null, 0);
        JOptionPane.showMessageDialog(null, "You've chosen: " + (option==JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
	}

}



