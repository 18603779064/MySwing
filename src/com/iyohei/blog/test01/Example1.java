package com.iyohei.blog.test01;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Example1 extends JFrame{

	public void CreateJFrame(String title) {
		JFrame jf = new JFrame(title);//ʵ����һ��JFrame����
		Container container = jf.getContentPane();//��ȡһ������
		JLabel jl = new JLabel("����һ��JFrame����");//����һ��label��ǩ
		//ʹ��ǩ�ڵ����־���
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);//����ǩ��ӵ�������
		container.setBackground(Color.WHITE);//���������ı�����ɫ
		jf.setVisible(true);//ʹ����ɼ�
		jf.setSize(300, 400);//���ô����С
		//���ô���رշ�ʽ
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	};
	
	public static void main(String[] args) {
		new Example1().CreateJFrame("����һ��JFrame����");
	}
	
}
