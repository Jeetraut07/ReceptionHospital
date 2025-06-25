package pro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends JFrame {
	JLabel j1,j2;
	JTextField f1,f2;
	JButton b1,b2;
	public Login() {
		setTitle("Login Page");
		setLayout(null);
		j1=new JLabel("Username");
		j2=new JLabel("Password:");
		
		f1=new JTextField();
		f2=new JTextField();
		
		b1=new JButton("Reset");
		b2=new JButton("Submit");
		
		j1.setBounds(40, 50, 100, 25);
		f1.setBounds(140, 50, 200, 25);
		j2.setBounds(40, 80, 100, 25);
		f2.setBounds(140, 80, 200, 25);
		
		b1.setBounds(200, 150, 75, 25);
		b2.setBounds(300, 150, 75, 25);
		
		add(j1);
		add(j2);
		add(f1);
		add(f2);
		add(b1);
		add(b2);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f1.setText("");
				f2.setText("");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(f1.getText().equals("sdac")&&f2.getText().equals("sdac")) {
					JOptionPane.showMessageDialog(Login.this, "Successfully Logged In");
					new Home();
					dispose();
				}
			}
		});
		setVisible(true);
		setSize(600, 400);
	}
	public static void main(String[] args) {
		new Login();
	}
}
