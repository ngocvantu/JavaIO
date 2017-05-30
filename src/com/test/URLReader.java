package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class URLReader {

	public static void main(String[] args) throws IOException { 
		URL u = new URL("http://localhost/itonline.com.vn/user_guide/");
		InputStream in = u.openStream();
		StreamCopier.copy(in, System.out);
		in.close();
	}
}
