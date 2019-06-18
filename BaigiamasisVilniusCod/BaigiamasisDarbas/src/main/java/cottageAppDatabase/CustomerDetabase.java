package cottageAppDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDetabase {

	public static Connection connect() {
		// SQLite connection string
		String url = "jdbc:sqlite:C:\\Users\\Domas\\Desktop\\Baigiamasis Darbas\\BaigiamojoDarboDuomenuBaze\\LaikomaInfo.db";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}

	public void insert(String Name, String Email, String PhoneNumber, String Address) {
		String sql = "INSERT INTO Customer (Name,Email,PhoneNumber,Address) VALUES(?,?,?,?)";
		try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			// pstmt.setInt(1, CustomerId);
			pstmt.setString(1, Name);
			pstmt.setString(2, Email);
			pstmt.setString(3, PhoneNumber);
			pstmt.setString(4, Address);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void selectAll() {
		String sql = "SELECT CustomerId, Name, Email, PhoneNumber, Address FROM Customer";

		try (Connection conn = this.connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			// loop through the result set
			while (rs.next()) {
				System.out.println(rs.getInt("CustomerId") + "\t" + rs.getString("Name") + "\t" + rs.getString("Email")
						+ "\t" + rs.getString("PhoneNumber") + "\t" + rs.getString("Address"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
