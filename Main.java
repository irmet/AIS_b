package NS;


import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		
//	        JFrame frame = new Viewer(10,"self",null);
//	        frame.setTitle("Self Cell Creator");
//	        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE );
//	        frame.pack();
//	        frame.setResizable(true);
//	        frame.setLocationRelativeTo( null );
//	        frame.setVisible(true);
	     
		Self self = new Self(1);
		Antigen antigen = new Antigen(1000, self);
		Antibody antibody = new Antibody(10, antigen);
		antibody.printAntibody();
		
		
	}
	
}
