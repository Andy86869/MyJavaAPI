package org.test.socket;

import java.net.URL;
import java.net.URLConnection;

/**
 * @author Andy
 * 获取远程文件大小
 */
public class GetFileBytes {
	public static void main(String[] args) throws Exception{
		 int size;
	      URL url = new URL("http://www.w3cschool.cc/wp-content/themes/w3cschool.cc/assets/img/newlogo.png");
	      URLConnection conn = url.openConnection();
	      size = conn.getContentLength();
	      if (size < 0)
	      System.out.println("无法获取文件大小。");
	      else
	      System.out.println("文件大小为：" +
	      + size + " bytes");
	      conn.getInputStream().close();
	}
}
