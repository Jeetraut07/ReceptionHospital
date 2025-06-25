package pro;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Home extends JFrame {
	JMenuBar bar;
	JMenu m1, m2, m3, m4;
	JMenuItem i1, i2, i3, i4, i5, i6, i7, i8, i9, i10;
	

	public Home() {
		setTitle("Login Page");
		setLayout(new FlowLayout());
		bar = new JMenuBar();
		m1 = new JMenu("Home");
		m2 = new JMenu("About Us");
		m3 = new JMenu("Operations");
		m4 = new JMenu("Exit");

		i1 = new JMenuItem("Info");
		i2 = new JMenuItem("Appointment");
		i3 = new JMenuItem("Location");
		i4 = new JMenuItem("Details");
		i5 = new JMenuItem("Add");
		i6 = new JMenuItem("Update");
		i7 = new JMenuItem("Delete");
		i8 = new JMenuItem("Show");
		i9 = new JMenuItem("Log Out");
		
		

		add(bar);
		bar.add(m1);
		bar.add(m2);
		bar.add(m3);
		bar.add(m4);

		m1.add(i1);
		m1.add(i2);

		m2.add(i3);
		m2.add(i4);

		m3.add(i5);
		m3.add(i6);
		m3.add(i7);
		m3.add(i8);

		m4.add(i9);
		
		i2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Appointment();
				dispose();
				
			}
		});
		i4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new DetailsWindow();
				dispose();
				
			}
		});
		i5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new add();
				dispose();
			}
		});
		i6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new update();
				dispose();
			}
		});
		i7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new delete();
				dispose();
			}
		});
		i8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Show();
			}
		});

		i9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Login();
			}
		});

		setVisible(true);
		setSize(400, 200);
	}

	public static void main(String[] args) {
		new Home();
	}
}
