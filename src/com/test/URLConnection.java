package com.test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class URLConnection {

	public static void main(String[] args) throws IOException { 
		URL u = new URL("http://localhost/itonline.com.vn/user_guide/");
		java.net.URLConnection uc = u.openConnection();
		
	}

}
