package pro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class add extends JFrame{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2;
	public add() {
		setLayout(null);
		l1=new JLabel("Name:");
		l2=new JLabel("Age:");
		l3=new JLabel("Phone Number:");
		l4=new JLabel("Disease:");
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		
		b1=new JButton("Reset");
		b2=new JButton("Add");
		
		l1.setBounds(40, 50, 100, 25);
		t1.setBounds(140, 50, 200, 25);
		l2.setBounds(40, 80, 100, 25);
		t2.setBounds(140, 80, 200, 25);
		l3.setBounds(40, 110, 100, 25);
		t3.setBounds(140, 110, 200, 25);
		l4.setBounds(40, 140, 100, 25);
		t4.setBounds(140, 140, 200, 25);
		
		b1.setBounds(100, 200, 75, 25);
		b2.setBounds(200, 200, 75, 25);
		
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
				Operations.add(t1.getText(),t2.getText(),t3.getText(),t4.getText());
				dispose();
				new Home();
				
			}
		});
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(b1);
		add(b2);
		setVisible(true);
		setSize(500,400);
	}
	public static void main(String[] args) {
		new add();
	}
}
