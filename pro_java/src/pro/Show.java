package pro;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Show extends JFrame {
	JTextArea area;

	public Show() {
		setTitle("Patient Details");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		area = new JTextArea();
		area.setText(Operations.show());
		area.setEditable(false);
		JScrollPane pane = new JScrollPane(area);
		add(pane, BorderLayout.CENTER);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Show();
	}
}
