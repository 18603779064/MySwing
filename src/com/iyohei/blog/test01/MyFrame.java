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
			JFrame jf = new JFrame("����һ������");
			Container con = jf.getContentPane();//����һ������
			con.setLayout(null);
			JLabel jl = new JLabel("����һ��JLabel��ǩ");//�ڴ��������ñ�ǩ
			//����ǩ�ڵ����������м�λ��
			jl.setHorizontalAlignment(SwingConstants.CENTER);
			//����ǩ����������
			con.add(jl);
			//����һ����ť
			JButton bl = new JButton("�����Ի���");
			//���尴ť�Ĵ�С��λ��
			bl.setBounds(200, 200, 100, 21);
			//Ϊ��ť�����굥���¼�
			bl.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//ʹJDialog����ɼ�
					new MyJDialog(MyFrame.this).setVisible(true);
					
				}
			});
			
			con.add(bl);
			con.setBackground(Color.WHITE);//���������ı�����ɫ
//			JFrame jf = new JFrame("����һ������");
//			con.add(jf);
			jf.setVisible(true);//ʹ����ɼ�
			jf.setSize(400, 400);//���ô����С
			//���ô���رշ�ʽ
			jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			
		}
		
}
