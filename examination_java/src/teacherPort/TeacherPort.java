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
		
		//设置容器布局  边界布局
		teacherFrame.setLayout(new BorderLayout());
		
		//边界布局管理区域 START
		
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
		
		//PAGE_STAET  用菜单栏代替了
		//teacherFrame.add(checkBox0,BorderLayout.PAGE_START);
		
		//PAGE_END
		
		//teacherFrame.add(,BorderLayout.PAGE_END);
		//LINE_START 学生在线状态
		
		//!!!测试写法,最终应根据学生上线情况new对象动态加载,测试未成功!!!
		JScrollPane scrollPane_student =  new JScrollPane();
		
		JPanel panel = new JPanel();
		
		JPanel panel_student0 = new JPanel();
		JLabel label_status0 = new JLabel("0");
		JLabel label_stuName0 = new JLabel("zhangsan");
		
		panel_student0.add(label_status0);
		panel_student0.add(label_stuName0);
		
		panel.add(panel_student0);
		
		JPanel panel_student1 = new JPanel();
		JLabel label_status1 = new JLabel("1");
		JLabel label_stuName1 = new JLabel("lisi");
		
		panel_student1.add(label_status1);
		panel_student1.add(label_stuName1);
		
		panel.add(panel_student1);
		
		scrollPane_student.setViewportView(panel);
		teacherFrame.add(scrollPane_student,BorderLayout.LINE_START);
		//LINE_END
		
		//teacherFrame.add(,BorderLayout.LINE_END);
		//CENTER
		
		//teacherFrame.add(,BorderLayout.CENTER);
		
		//边界布局管理区域 END
		
	}	
}
