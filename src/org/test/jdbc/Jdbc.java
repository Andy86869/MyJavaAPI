package org.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * jdbc 连接数据库查询一天数据返回 到javabean
 */
public class Jdbc {

	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/seckill";
	public static final String USER = "root";
	public static final String PASSWORD = "root";

	public static void main(String[] args) throws Exception {

//		queryOne();
		Seckill seckill1 = returnBean();
		System.out.println(seckill1.getSeckillId()+seckill1.getName());
	}

	public static void queryOne() throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from seckill where seckill_id = 1003";
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {

		}

		while (rs.next()) {
			Seckill seckill = new Seckill();
			// seckill.setCreateTime(rs.getDate("create_time"));
			seckill.setSeckillId(rs.getLong("seckill_id"));
			seckill.setName(rs.getString("name"));
			seckill.setNumber(rs.getInt("number"));

			System.out.println(seckill.getSeckillId() + " " + seckill.getName() + "" + seckill.getNumber() + ""
					+ seckill.getCreateTime());
		}
	}

	public static Seckill returnBean() throws Exception {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from seckill where seckill_id = 1003";
		Seckill seckill = new Seckill() ;
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			System.out.println("查询异常");
		}
		while (rs.next()) {
		
			seckill.setSeckillId(rs.getInt("seckill_id"));
			seckill.setName(rs.getString("name"));
			seckill.setNumber(rs.getInt("number"));
		}
		return seckill;
	}
}
