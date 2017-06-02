package com.socket;

import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketExample {

	public static void main(String[] args) {
		FilterOutputStream fs;
		try {
			ServerSocket ss = new ServerSocket(5656);
			while (true) {
				Socket s = ss.accept();
				OutputStream out = s.getOutputStream();
				String chao = "hi there";
				while (true) {
					out.write(chao.getBytes());
				}
			}
//			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
