package pro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SignUp extends JFrame {
	JLabel j1,j2,j3,j4,j5,j6;
	JTextField f1,f2,f3,f4,f5,f6;
	JButton b1,b2;
	public SignUp() {
		setTitle("SignUp Page");
		setLayout(null);
		j1=new JLabel("Firstname:");
		j2=new JLabel("Lastname:");
		j3=new JLabel("Phone Number:");
		j4=new JLabel("Email:");
		j5=new JLabel("Username");
		j6=new JLabel("Password:");
		
		f1=new JTextField();
		f2=new JTextField();
		f3=new JTextField();
		f4=new JTextField();
		f5=new JTextField();
		f6=new JTextField();
		
		b1=new JButton("Reset");
		b2=new JButton("Submit");
		
		j1.setBounds(40, 50, 100, 25);
		f1.setBounds(140, 50, 200, 25);
		j2.setBounds(40, 80, 100, 25);
		f2.setBounds(140, 80, 200, 25);
		j3.setBounds(40, 110, 100, 25);
		f3.setBounds(140, 110, 200, 25);
		j4.setBounds(40, 140, 100, 25);
		f4.setBounds(140, 140, 200, 25);
		j5.setBounds(40, 170, 100, 25);
		f5.setBounds(140, 170, 200, 25);
		j6.setBounds(40, 200, 100, 25);
		f6.setBounds(140, 200, 200, 25);
		
		b1.setBounds(200, 250, 75, 25);
		b2.setBounds(300, 250, 75, 25);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f1.setText("");
				f2.setText("");
				f3.setText("");
				f4.setText("");
				f5.setText("");
				f6.setText("");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Operations.addRegistry(f1.getText(),f2.getText(),f3.getText(),f4.getText(),f5.getText(),f6.getText());
				new Login();
				dispose();
			}
		});
		
		add(j1);
		add(j2);
		add(j3);
		add(j4);
		add(j5);
		add(j6);
		add(f1);
		add(f2);
		add(f3);
		add(f4);
		add(f5);
		add(f6);
		add(b1);
		add(b2);
		setVisible(true);
		setSize(600, 400);
	}
	public static void main(String[] args) {
		new SignUp();
	}
}
