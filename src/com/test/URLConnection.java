package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class URLConnection {

	public static void main(String[] args) throws IOException { 
		URL u = new URL("http://localhost/itonline.com.vn/user_guide/");
		java.net.URLConnection uc = u.openConnection();
		uc.connect();
		InputStream in = uc.getInputStream();
		StreamCopier.copy(in, System.out);
		in.close();
	}
}
