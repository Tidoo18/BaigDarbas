package cottageAppDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderDateBase {

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

	public void insert(Integer Price, Integer Quantity, Integer Days, Integer Total, String ArrivalDate,
			String LeavingDate) {
		String sql = "INSERT INTO Orders (Price, Quantity, Days, Total, ArrivalDate, LeavingDate) VALUES(?,?,?,?,?,?)";

		try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, Price);
			pstmt.setInt(2, Quantity);
			pstmt.setInt(3, Days);
			pstmt.setInt(4, Total);
			pstmt.setString(5, ArrivalDate);
			pstmt.setString(6, LeavingDate);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void selectTotal() {
		String sql = "SELECT * FROM Orders WHERE Total";

		try (Connection conn = this.connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			while (rs.next()) {
				System.out.println(rs.getInt("Total"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void selectAll() {
		String sql = "SELECT OrderId, Price, Quantity, Days, Total, ArrivalDate, LeavingDate FROM Orders";

		try (Connection conn = this.connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			// loop through the result set
			while (rs.next()) {
				System.out.println(rs.getInt("OrderId") + "\t" + rs.getInt("Price") + "\t" + rs.getInt("Quantity")
						+ "\t" + rs.getInt("Days") + "\t" + rs.getInt("Total") + "\t" + rs.getString("ArrivalDate")
						+ "\t" + rs.getString("LeavingDate"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
