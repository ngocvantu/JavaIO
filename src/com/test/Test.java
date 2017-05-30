package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {

	public static void main(String[] args) {  
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
