package cottageAppDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteOrderFromDatabase {

	private Connection connect() {
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

	public void delete(int OrderId) {
		String sql = "DELETE FROM Orders WHERE OrderId = ?";
		try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setInt(1, OrderId);

			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
