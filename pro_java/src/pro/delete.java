package pro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class delete extends JFrame {
	JLabel l1;
	JTextField t1;
	JButton b1, b2;

	public delete() {
		setLayout(null);
		;
		l1 = new JLabel("ID:");
		t1 = new JTextField();
		b1 = new JButton("Reset");
		b2 = new JButton("Delete");

		l1.setBounds(40, 50, 100, 25);
		t1.setBounds(100, 50, 200, 25);

		b1.setBounds(120, 100, 75, 25);
		b2.setBounds(200, 100, 75, 25);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Operations.delete(t1.getText());
				dispose();
				new Home();
			}
		});

		add(l1);
		add(t1);
		add(b1);
		add(b2);
		
		setVisible(true);
		setSize(500, 400);
	}

	public static void main(String[] args) {
		new delete();
	}
}
