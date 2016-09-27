package org.test.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		try {
			// 1创建ServerSocket 对象 指定绑定的端口,并监听此端口
			ServerSocket serverSocket = new ServerSocket(8888);
			System.out.println("服务端启动中......");
			// 2accept() 监听,等待客户端连接
			Socket socket = serverSocket.accept();
			
			// 获取输入流,并获取客户端信息
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);// 字节流转换为字符流
			// 为输入流缓冲
			BufferedReader br = new BufferedReader(isr);
			String info = null;
			while ((info = br.readLine()) != null) {
				System.out.println("我是服务端,客户端对我说:" + info);
			}
			// 关闭输入流
			socket.shutdownInput();
			// 获取输出流,响应客户端的请求
			OutputStream os = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(os);
			pw.write("欢迎您!");
			pw.flush();
			// 关闭资源
			os.close();
			pw.close();
			br.close();
			isr.close();
			is.close();
			socket.close();
			serverSocket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
