package teacherPort;

import javax.swing.*;

public class TeacherPort {
	public static void createAndShowGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);

		JFrame frame = new JFrame("Hello javax.swing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label = new JLabel("hello world");
		frame.getContentPane().add(label);

		frame.pack();
		frame.setVisible(true);
	}	
}
