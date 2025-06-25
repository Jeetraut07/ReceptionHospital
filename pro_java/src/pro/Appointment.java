package pro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Appointment extends JFrame{
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4,t5,t6;
	JButton b1,b2;
	public Appointment() {
		setTitle("Appointment Form");
		setLayout(null);
		
		l1=new JLabel("Name:");
		l2=new JLabel("Age:");
		l3=new JLabel("Address:");
		l4=new JLabel("Phone:");
		l5=new JLabel("Doctor:");
		l6=new JLabel("Disease:");
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		t5=new JTextField();
		t6=new JTextField();
		
		b2=new JButton("Submit");
		b1=new JButton("Reset");
		
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
		l6.setBounds(40, 200, 100, 25);
		t6.setBounds(140, 200, 200, 25);
		
		b1.setBounds(100, 260, 75, 25);
		b2.setBounds(200, 260, 75, 25);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(b1);
		add(b2);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Operations.appoint(t1.getText(),t2.getText(),t3.getText(),t4.getText(),t5.getText(),t6.getText(),null);
			}
		});
		
		
		
		setSize(400, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Appointment();
	}
}
