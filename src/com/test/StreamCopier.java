package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamCopier {

	public static void copy(InputStream in, OutputStream out) throws IOException{
		long time1 = System.currentTimeMillis();
		int numByteRead = 0;
		synchronized (in) {
			synchronized (out) {
				byte[] buffer = new byte[256]; 
				while (true) {
					int byteRead = in.read(buffer);
					numByteRead += byteRead;
					if (byteRead == -1) {
						break;
					}
					out.write(buffer, 0, byteRead);
				}
			}
		}
		System.out.println("numbyteREad: " + numByteRead);
		long time2 = System.currentTimeMillis();
		System.out.println("time taken = " + (time2 - time1));
	}
}
