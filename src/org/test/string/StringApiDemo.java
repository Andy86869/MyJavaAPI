package org.test.string;

public class StringApiDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * public char[] toCharArray()将一个字符串变为字符数组
		 * public byte[] getBytes() 将一个字符串变为字节数组
		 */
		String strChar = "Hello";				//	定义一个字符串
		char cStr[] = strChar.toCharArray();	//将Hello这个字符串变为一个字符数组
		byte bStr[] = strChar.getBytes();		//将Hello这个字符串变为一个字节数组
		for(int i=0;i<cStr.length;i++){			//循环输出这个字符数组
			System.out.print(cStr[i]+"、");
		}
		System.out.println();
		for(int j=0;j<bStr.length;j++){			//循环输出这个字节数组
			System.out.print(bStr[j]+"、");
		}
		
		
		System.out.println();
		System.out.println("--------------------------------------------");
		
		/*
		 * public String(char[] value)将全部的字符数组变为一个字符串
		 * public String(char[] value, int offset, int count)将指定范围内（部分）的字符数组变为字符串，offset是开始点，count是长度
		 * public String(byte[] bytes)将全部的字节数组变为一个字符串
		 * public String(byte[] bytes, int offset, int length)将指定范围内（部分）的字节数组变为字符串，offset是开始点，length是长度
		 */
		char stringChar[] = {'I',' ','L','O','V','E',' ','Y','O','U','!'}; 	//定义一个字符数组
		byte b[] = {'1','2','3','4'};
		String strOne = new String (stringChar);				//将字符数组变为字符串
		String strTwo = new String (stringChar,2,8);				//将指定范围的字符数组变为字符串
		String bStrOne = new String(b);						//将字节数组变为字符串
		String bStrTwo = new String(b,2,2);					//将指定范围的字节数组变为字符串
		System.out.println("strOne的值是："+strOne);
		System.out.println("strTwo的值是："+strTwo);
		System.out.println("bStrOne的值是："+bStrOne);
		System.out.println("bStrTwo的值是："+bStrTwo);
		System.out.println("--------------------------------------------");
		
		
		
		
		/*
		 * public char charAt(int index)从一个字符串中取出指定位置的字符。
		 */
		String inStr = "charAt";
		char inChar = inStr.charAt(2);					//从指定的字符串中取出指定位置的字符
		System.out.println("位置为2的地方的字符是："+inChar);
		System.out.println("--------------------------------------------");
		
		
		/*
		 * public int length()取得字符串的长度
		 */
		String strLength = "strLength";
		int sLength = strLength.length();					//取得字符串的长度
		System.out.println("字符串strLength的长度是："+sLength);				
		System.out.println("--------------------------------------------");

		/*
		 * 查找指定的字符串是否存在
		 * public int indexOf(String str)从头开始查找指定字符串是否存在，返回int类型，若查找不到返回-1
		 * public int indexOf(String str,int fromIndex)从指定位置开始查找指定的字符串是否存在，返回int类型，若查找不到就返回-1
		 */
		
		String indexOfStr = "abcdefgcdhi";
		System.out.println(indexOfStr.indexOf("cd"));		//从头开始查找字符串“cd”返回2，也说明是查找到的第一个符合条件的位置。
		System.out.println(indexOfStr.indexOf("c",3));		//从第四个元素开始查找字符串“cd”
		System.out.println(indexOfStr.indexOf("x"));		//没有查找到，返回-1
		System.out.println("--------------------------------------------");
		
		
		/*
		 * public String trim()去掉字符串中左右的空格，但中间的空格不会被去掉
		 */
		String  strTrim = "   Hello Worldsd   ";
		System.out.println(strTrim.trim());			//去掉空格
		System.out.println("--------------------------------------------");

		/*
		 * 字符截取：从一个字符串中取出部分内容
		 * substring(int beginIndex)从指定位置开始截取至字符串结尾
		 * substring(int beginIndex, int endIndex)截取指定范围的字符串（开始位置和结束为止）,不包括结束位置的字符
		 */
		String subStringStr = "I amLucy!!!!!";
		System.out.println(subStringStr.substring(2));
		System.out.println(subStringStr.substring(2,7));		//不包括结束位置的字符
		System.out.println(subStringStr.substring(2,subStringStr.indexOf("!")));	
		System.out.println("--------------------------------------------");

		
		/*
		 * public String[] split(String regex)拆分字符串，以某一个字符串作为拆分点
		 */
//		String spliteStr = "Hello Lily!";
		String spliteStr = "chuck//vip//css//html//js//nodejs";
		String spliteS[] = spliteStr.split("//");
		for(int x=0;x<spliteS.length;x++){
			System.out.println(spliteS.length);
			System.out.println(spliteS[x]);
		}
		System.out.println("--------------------------------------------");
		
		
		/*
		 * public String toLowerCase()将字符串字符都变为小写
		 * public String toUpperCase()将字符串字符都变为大写
		 */
		
		String lowerUpper = "HelloWorld!";
		System.out.println(lowerUpper.toUpperCase());
		System.out.println(lowerUpper.toLowerCase());
		System.out.println("--------------------------------------------");

		
		
		/*
		 * 判断是否以指定的字符串开头或者结尾
		 * public boolean startsWith(String prefix)判断是否以指定的字符串开头
		 * public boolean endsWith(String suffix)  判断是否以指定的字符串结尾
		 */
		String str1 = "Hello,cat";
		boolean s1 = str1.startsWith("He");
		boolean s2 = str1.endsWith("cat");
		System.out.println(s1+"\t"+s2);
		System.out.println("--------------------------------------------");

		
		/*
		 * 判断两个字符串是否相等
		 * public boolean equals(Object anObject)	区分大小写判断两个字符串是否相等
		 * public boolean equalsIgnoreCase(String anotherString) 不区分大小写判断两个字符串是否相等
		 */
		String str11 = "Hello";
		String str22 = "hello";
		System.out.println("区分大小写判断两个字符串是否相等的结果是："+str11.equals(str22));
		System.out.println("不区分大小写判断两个字符串是否相等的结果是："+str11.equalsIgnoreCase(str22));
		System.out.println("--------------------------------------------");
		
		
		/*
		 * 字符串替换功能
		 * public String replaceAll(String regex,String replacement)将指定字符regex替换成指定的字符replacement
		 */
		String strReplace = "Hello";
		System.out.println("替换后的结果是："+strReplace.replaceAll("l","x"));
		System.out.println(strReplace.replaceFirst("h", "r"));
	}
}
