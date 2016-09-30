package org.test.string;

/**
 * String 常用方法相关
 */
public class StringDemo1 {
	public static void main(String[] args) {
		string1();
	}
	
	public static void string1(){
		String str = "hello";
		char c[] = str.toCharArray();
		byte b[] = str.getBytes();
		for (int i = 0;i<c.length ;i++ ) {
			System.out.print(c[i]+",");
		}
		System.out.println();
		for (int j = 0;j<b.length ;j++ ) {
			System.out.print(b[j]+",");
		}
	}
	
	public static void string2(){
		char stringChar[] = {'I',' ','L','O','V','E',' ','Y','O','U','!'}; 	//定义一个字符数组
		byte b[] = {'1','2','3','4'};
	}
}
