package com.iyohei.blog.test01;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Example1 extends JFrame{

	public void CreateJFrame(String title) {
		JFrame jf = new JFrame(title);//实例化一个JFrame对象
		Container container = jf.getContentPane();//获取一个容器
		JLabel jl = new JLabel("这是一个JFrame窗体");//创建一个label标签
		//使标签内的文字居中
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);//将标签添加到容器中
		container.setBackground(Color.WHITE);//设置容器的背景颜色
		jf.setVisible(true);//使窗体可见
		jf.setSize(300, 400);//设置窗体大小
		//设置窗体关闭方式
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	};
	
	public static void main(String[] args) {
		new Example1().CreateJFrame("创建一个JFrame窗体");
	}
	
}
