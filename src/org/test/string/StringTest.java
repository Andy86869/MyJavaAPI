package org.test.string;

public class StringTest {

	public static void main(String[] args) {
		methodStr();
	}
	
	public static void methodStr(){
		String str1 = "nihao woshi xiaoming ";
		System.out.println(str1.substring(1, 5));
		System.out.println(str1.substring(2));
		System.out.println(str1.replace("h","y"));
		System.out.println(str1.replaceAll(str1, "全部替换了"));
		System.out.println(str1.indexOf("h"));
		System.out.println(str1.charAt(4));
		System.out.println(str1.replace("ha", "bb"));
		System.out.println(str1.indexOf("h", 6));
		System.out.println(str1.concat(str1));
	}
	public static void equslsStr() {
		String a = "abc";
		String b = "abc";
		String c = new String("abc");
		String d = "ab" + "c";
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(c==d);
		System.out.println(a==c);
		System.out.println(b==d);
		System.out.println(a==d);
		System.out.println("------------------");
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
	}

}
