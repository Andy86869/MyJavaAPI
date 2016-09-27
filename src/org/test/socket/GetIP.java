package org.test.socket;

import java.net.InetAddress;

/**
 * @author Andy 获取指定主机的IP地址
 */
public class GetIP {
	public static void main(String[] args) {
		InetAddress address  = null;
		try {
			address = InetAddress.getByName("www.imooc.com");
		} catch (Exception e) {
			System.exit(2);
		}
		System.out.println(address.getHostName()+"="+address.getHostAddress());;
		System.exit(0);
	}
}
