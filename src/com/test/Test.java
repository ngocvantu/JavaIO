package com.test;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {

	public static void main(String[] args) throws IOException {   
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("ha.txt"));
		dos.writeUTF("trường kỳ kháng chiến");
		dos.close();
	}
	
	public static void copy(InputStream in, OutputStream out) throws IOException{
		synchronized (in) {
			synchronized (out) {
				byte[] buffer = new byte[256];
				while (true) {
					int byteRead = in.read(buffer);
					if (byteRead == -1) {
						break;
					}
					out.write(buffer);
				}
			}
		}
	}
}
