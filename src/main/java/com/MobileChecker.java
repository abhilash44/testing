package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileChecker 
{
	public static void main(String[] args) throws IOException 
	{		
		Pattern p=Pattern.compile("(0|91)?[789][0-9]{9}");
		BufferedReader b = new BufferedReader(new FileReader("D:\\testout.txt"));
		String read = b.readLine();
		while(read!=null)
		{
			Matcher matcher = p.matcher(read);
			while(matcher.find())
			{
				System.out.println("hi "+matcher.group());
			}
			read=b.readLine();
		}
		b.close();
	}

}
