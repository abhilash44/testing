package com;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class RegexTest 
{
	private Regex reg;
	
	@Before
	public void init()
	{
		reg= new Regex();
		//testRegx(values);
	}


	/*public Object[] inValidUsernameProvider() 
	{
		return new Object[]
				{
				new String[]
						{
						"mk","mk@yong","mkyong123456789_-"
						}
				};
	}*/
	@Test()
	public void testRegx()
	{
		String[] values=
				{
				"Abhilash@44"
				};
		
		for(String s:values)
		{
			boolean b=reg.validate(s);
			Assert.assertEquals(b, true);
		}
	}
}
