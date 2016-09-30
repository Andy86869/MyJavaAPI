package org.test.socket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author Andy
 * 基于TCP 协议的Socket 通信,实现用户登录
 *
 */
public class Client {

	public static void main(String[] args) {
		try {
			// 1创建客户端Socekt
			Socket socket = new Socket("127.0.0.1", 8888);
			// 构建IO
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();

			// 向服务器发送一条消息
			PrintWriter pw = new PrintWriter(os);
			pw.write("用户名:admin;密码:123");
			pw.flush();
			socket.shutdownOutput();
			// 读取服务器返回的消息
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String info = null;
			while ((info = br.readLine()) != null) {
				System.out.println("我是客户端,服务端对我说:" + info);
			}
			// 关闭资源
			br.close();
			is.close();
			pw.close();
			os.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
