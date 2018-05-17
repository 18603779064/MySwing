package com.iyohei.blog.test01;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class MyFrame extends JFrame {
		public static void main(String[] args) {
			new MyFrame();
		}
		
		public MyFrame() {
			JFrame jf = new JFrame("这是一个窗体");
			Container con = jf.getContentPane();//创建一个容器
			con.setLayout(null);
			JLabel jl = new JLabel("这是一个JLabel标签");//在窗体中设置标签
			//将标签内的文字置于中间位置
			jl.setHorizontalAlignment(SwingConstants.CENTER);
			//将标签放入容器中
			con.add(jl);
			//定义一个按钮
			JButton bl = new JButton("弹出对话框");
			//定义按钮的大小，位置
			bl.setBounds(200, 200, 100, 21);
			//为按钮添加鼠标单击事件
			bl.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//使JDialog窗体可见
					new MyJDialog(MyFrame.this).setVisible(true);
					
				}
			});
			
			con.add(bl);
			con.setBackground(Color.WHITE);//设置容器的背景颜色
//			JFrame jf = new JFrame("这是一个窗体");
//			con.add(jf);
			jf.setVisible(true);//使窗体可见
			jf.setSize(400, 400);//设置窗体大小
			//设置窗体关闭方式
			jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			
		}
		
}
