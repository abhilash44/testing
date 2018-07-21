package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex 
{
	private Pattern pattern;
	private Matcher matcher;

	private static final String USER_PARTTREN="((?=.*\\d)(?=*[a-z])(?=*[A-Z])(?=.[@]#&){3,15})";
	
	public Regex() 
	{
		pattern=Pattern.compile(USER_PARTTREN);
	}
	
	public boolean validate(final String userName)
	{
		matcher= pattern.matcher(userName);
		return matcher.matches();
	}
}


