package org.test.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.test.jdbc.entity.WebSite;

/**
 * @author Andy Java bean 查询出结果到 Java 容器
 *
 */
public class JdbcDemo {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/runoob";
	private static final String USER = "root";
	private static final String PASSOWRD = "root";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from websites";
		List<WebSite> list = new ArrayList<>();
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSOWRD);
			stmt=conn.createStatement();
			rs = stmt.executeQuery(sql);
			WebSite ws = new WebSite();
			while(rs.next()){
//				list.add(rs.getInt("id"));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
