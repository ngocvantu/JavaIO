package com.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("chao.ogg");
			byte[] b = new byte[256];
			fis.read(b);
			
			System.out.write(b);
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String systemDefaultEncoding = System.setProperty("file.encoding", "UTF8");
		System.out.println("systemDefaultEncoding = " + systemDefaultEncoding);
		
		FileOutputStream fos = null;
		try {
		fos = new FileOutputStream("chao.txt");
		for (int i = 32; i < 400; i++) { 
				fos.write(i);
				if (i == 65) {
					System.out.println("\n");
				}
		} 
		} catch (IOException e) { 
			e.printStackTrace();
		}
		finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) { 
					e.printStackTrace();
				}
			}
		}
	}
}
