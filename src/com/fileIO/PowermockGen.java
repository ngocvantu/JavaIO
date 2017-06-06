package com.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PowermockGen {

	public static void main(String[] args) throws IOException { 
		FileReader fileReader = new FileReader("powermockgen.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		ArrayList<String> mockObject = new ArrayList<>();

		String line;
		int i = 1;
		while ((line = bufferedReader.readLine()) != null) {
			if (i == 1) {
				String words[] = line.split(" ");
				for (String string : words) {
					if (!string.trim().equals("")) {
						System.out.println(string.trim() + " " + string.trim().toLowerCase() + " = " + 
								"PowerMockito.mock(" + string.trim() + ".class);");
									mockObject.add(string.trim());
					}
				}
			} else { // static mock
				String words[] = line.split(" ");
				for (String string : words) {
					if (!string.trim().equals("")) {
						System.out.println( "PowerMockito.mockStatic(" + string.trim() + ".class);");
									mockObject.add(string.trim());
					}
				}
			}
			i++;
		}
		
		fileReader.close();
	}

}
