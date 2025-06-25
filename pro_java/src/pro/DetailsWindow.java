package pro;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class DetailsWindow extends JFrame {

	private JTable table;
	private DefaultTableModel tableModel;

	public DetailsWindow() {
		// Set up the frame
		setTitle("Database Information");

		JScrollPane scrollPane = new JScrollPane(Operations.tableShow());
		add(scrollPane, BorderLayout.CENTER);

		setSize(400, 300);
		setVisible(true);
	}
}
