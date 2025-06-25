package pro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class update extends JFrame{
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2;
	public update() {
		setLayout(null);
		l1=new JLabel("ID:");
		l2=new JLabel("Name:");
		l3=new JLabel("Age:");
		l4=new JLabel("Phone Number:");
		l5=new JLabel("Disease:");
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		t5=new JTextField();
		
		b1=new JButton("Reset");
		b2=new JButton("Update");
		
		l1.setBounds(40, 50, 100, 25);
		t1.setBounds(140, 50, 200, 25);
		l2.setBounds(40, 80, 100, 25);
		t2.setBounds(140, 80, 200, 25);
		l3.setBounds(40, 110, 100, 25);
		t3.setBounds(140, 110, 200, 25);
		l4.setBounds(40, 140, 100, 25);
		t4.setBounds(140, 140, 200, 25);
		l5.setBounds(40, 170, 100, 25);
		t5.setBounds(140, 170, 200, 25);
		
		b1.setBounds(100, 230, 75, 25);
		b2.setBounds(200, 230, 75, 25);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Operations.update(t1.getText(),t2.getText(),t3.getText(),t4.getText(),t5.getText());
				dispose();
				new Home();
				
			}
		});
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(b1);
		add(b2);
		setVisible(true);
		setSize(500,400);
	}
	public static void main(String[] args) {
		new update();
	}
}
