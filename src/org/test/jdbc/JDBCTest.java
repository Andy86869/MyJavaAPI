package org.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andy 再次温习
 */
public class JDBCTest {

	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/runoob";
	public static final String USER = "root";
	public static final String PASSWORD = "root";

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from websites";
		List<String> list = new ArrayList<>();
		try {
			// 注册驱动
			Class.forName(DRIVER);
			// 打开连接
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			// 实例化Statement
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt("id");
				String url = rs.getString("url");
				String name = rs.getString("name");
				int alexa = rs.getInt("alexa");
				String country = rs.getString("country");

				System.out.println(id + " " + name + " " + url + " " + alexa + "" + country);

			}
			// 完成后关闭
			rs.close();
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 关闭资源
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
