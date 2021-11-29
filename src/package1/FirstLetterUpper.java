package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstLetterUpper {

	private String firstLetterUpper(String s) {
		String s1 = "";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(((i==0)||(s.charAt(i-1)==' '))&&(ch!=' '))
			{
				ch = Character.toUpperCase(ch);
			}
			s1 = s1 + ch;
		}
		return s1;
	}
	
	@Test
	public void testCase1()
	{
		Assert.assertEquals(firstLetterUpper("i love programming"), "I Love Programming");
	}

}
