package yue.zhang;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ui {

	public static void main(String[] args) {
		JFrame ui = new JFrame("清除LastUpdate文件");
		ui.setSize(500, 200);
		ui.setLayout(new FlowLayout());
		
		JLabel lpath = new JLabel("仓库路径：");
		JTextField path = new JTextField();
		path.setText("(例：E:\\\\maven\\\\mavenRepository)");
		JButton button = new JButton("确定");
		JLabel zhang = new JLabel("制作者：uso  QQ：354326386");
		
		ui.add(lpath);
		ui.add(path);
		ui.add(button);
		ui.add(zhang);
		
		JFrame message = new JFrame("提示：");
		message.setSize(300, 200);
		message.setLayout(new FlowLayout());
	
		JLabel msg = new JLabel();
		
		message.add(msg);
		message.add(zhang);
		message.setVisible(false);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String p = path.getText();
//				System.out.println(p);
				String loopmsg = Clear.loop(p);
				msg.setText(loopmsg);
				message.setVisible(true);
				message.setLocation(400, 400);
			}
		});
		
		ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ui.setLocation(400, 400);
		ui.setVisible(true);
		
	}

}
