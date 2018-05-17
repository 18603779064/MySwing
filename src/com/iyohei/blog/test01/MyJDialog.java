package com.iyohei.blog.test01;

import java.awt.Container;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyJDialog extends JDialog{

	public MyJDialog(MyFrame frame) {
		//实例化一个JDialog对象,指定对话框的父窗体，窗体标题和类型
		super(frame,"第一个JDialog窗体",true);
		//创建一个容器
		Container cont =getContentPane();
		cont.add(new JLabel("这是一个对话框"));
		//设置对话框大小
		setBounds(120, 120, 100, 100);
	}
	
}
