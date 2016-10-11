package org.test.io;

import java.io.File;

/**
 * @author Andy
 * 递归读取文件夹下文件
 *
 */
public class readFiles {
	public static void main(String[] args) {
		
	}
	
	public static void readFile(String testFileDir){
		
		File [] testFile = new File(testFileDir).listFiles();
		for (int i = 0; i < testFile.length; i++) {
			if (testFile[i].isFile()) {
				//
				
			} else {
				if (testFile[i].isDirectory()) {
					readFile(testFile[i].getPath());
				} else {
					System.out.println("文件读入有误");
				}
			}
		}
	}
}
