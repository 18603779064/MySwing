package com.iyohei.blog.test01;

import java.awt.Container;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyJDialog extends JDialog{

	public MyJDialog(MyFrame frame) {
		//ʵ����һ��JDialog����,ָ���Ի���ĸ����壬������������
		super(frame,"��һ��JDialog����",true);
		//����һ������
		Container cont =getContentPane();
		cont.add(new JLabel("����һ���Ի���"));
		//���öԻ����С
		setBounds(120, 120, 100, 100);
	}
	
}
