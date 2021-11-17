package teacherPort;

import javax.swing.*;
import java.awt.*;

public class TeacherPort {
	public static void createAndShowGUI(){
		
		//顶级window容器
		JFrame.setDefaultLookAndFeelDecorated(true);

		JFrame teacherFrame = new JFrame("考试系统-教师端");
		teacherFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		teacherFrame.pack();
		teacherFrame.setVisible(true);
		
		//设置容器布局  Grid
		//teacherFrame.setLayout(new BorderLayout());
		teacherFrame.setLayout(new GridLayout(1,2));
		
		//菜单栏
		JMenuBar menuBar = new JMenuBar();
		JMenu menu0 = new JMenu("试卷");
		JMenuItem item0_0 = new JMenuItem("导入试卷");
		JMenuItem item0_1 = new JMenuItem("发试卷");
		JMenuItem item0_2 = new JMenuItem("收试卷(结束考试)");
		
		menu0.add(item0_0);
		menu0.add(item0_1);
		menu0.add(item0_2);
		menuBar.add(menu0);
		
		JMenu menu1 = new JMenu("考试");
		JMenuItem item1_0 = new JMenuItem("开始考试");
		JMenuItem item1_1 = new JMenuItem("结束考试");
		
		menu1.add(item1_0);
		menu1.add(item1_1);
		menuBar.add(menu1);
		 
		teacherFrame.setJMenuBar(menuBar);
	}	
	public static void GUI_StudentData(){
		//!!!测试写法,最终应根据学生上线情况new对象动态加载,测试未成功!!!
		JScrollPane scrollPane_student =  new JScrollPane();
		
		JPanel panel_stu = new JPanel();
		panel_stu.setLayout(new GridLayout(60,3));
		
		JCheckBox checkBox_stu1 = new JCheckBox("zhangsan");
		
		panel_stu.add(checkBox_stu1);
		
		JCheckBox checkBox_stu2 = new JCheckBox("lisi");
		
		panel_stu.add(checkBox_stu2);
		
		scrollPane_student.setViewportView(panel_stu);

		teacherFrame.add(scrollPane_student);

		//paper file test code
		JScrollPane scrollPane_paper = new JScrollPane();

		JPanel panel1 = new JPanel();

		teacherFrame.add(scrollPane_paper);
	}	
	public static void GUI_PaperFileData(){
	}
}
