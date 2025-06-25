package pro;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Operations {
	static void add(String name, String age, String phon_no, String disease) {
		String sql = "insert into patients(name,age,phon_no,disease) values(?,?,?,?)";
		try {
			PreparedStatement ps = Connect.getcConnection().prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, age);
			ps.setString(3, phon_no);
			ps.setString(4, disease);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void addRegistry(String fname, String lname, String phon_no, String email, String uname, String pass) {
		String sql = "insert into registry(name,age,phon_no,disease) values(?,?,?,?,?,?)";
		try {
			PreparedStatement ps = Connect.getcConnection().prepareStatement(sql);
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, phon_no);
			ps.setString(4, email);
			ps.setString(5, uname);
			ps.setString(6, pass);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void update(String id, String name, String age, String phon_no, String disease) {
		String sql = "update patients set name=?,age=?,phon_no=?,disease=? where id=?";
		try {
			PreparedStatement ps = Connect.getcConnection().prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, age);
			ps.setString(3, phon_no);
			ps.setString(4, disease);
			ps.setString(5, id);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void delete(String id) {
		String sql = "delete from patients where id=?";
		try {
			PreparedStatement ps = Connect.getcConnection().prepareStatement(sql);
			ps.setString(1, id);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static String show() {
		String sql = "select * from patients";
		ResultSet rs;
		StringBuilder result = new StringBuilder();
		try {
			Statement s = Connect.getcConnection().createStatement();
			rs = s.executeQuery(sql);
			while (rs.next()) {
				int id=rs.getInt("ID");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String phon_no = rs.getString("phon_no");
				String disease = rs.getString("disease");

				result.append("ID:").append(id).append("\n").append("Name:").append(name).append("\n").append("Age:").append(age).append("\n")
						.append("Phone Number:").append(phon_no).append("\n").append("Disease:").append(disease)
						.append("\n\n");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result.toString();
	}

	static void appoint(String name, String age, String address, String phone, String doctor, String disease,
			Timestamp appointment_time) {
		try {
			CallableStatement stmt = Connect.getcConnection().prepareCall("{call insert_appointment(?,?,?,?,?,?,?)}");
			stmt.setString(1, name);
			stmt.setString(2, age);
			stmt.setString(3, address);
			stmt.setString(4, phone);
			stmt.setString(5, doctor);
			stmt.setString(6, disease);
			stmt.setTimestamp(7, appointment_time);
			stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static JTable tableShow() {
		String sql="select name,doctor,disease,appointment_time from public_appoint_info";
		String[] col= {"Name","Doctor","Disease","Time"};
		DefaultTableModel model=new DefaultTableModel(col, 0);
		JTable table=new JTable(model);
		try {
			PreparedStatement stmt=Connect.getcConnection().prepareStatement(sql);
			ResultSet rs=stmt.executeQuery();
			
			model.setRowCount(0); // Clear existing data

			while (rs.next()) {
				Vector<String> row = new Vector<>();
				row.add(rs.getString("name"));
				row.add(rs.getString("doctor"));
				row.add(rs.getString("disease"));
				row.add(rs.getString("appointment_time"));
				model.addRow(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return table;

	}
}
