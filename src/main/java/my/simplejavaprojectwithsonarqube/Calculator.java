package my.simplejavaprojectwithsonarqube;

import java.security.SecureRandom;

public class Calculator {

	public int add(int a, int b)
	{
		int c = 1;
		System.out.println("bug on purpose:"+(c=+b));
		return a+b;
	}

	public int minus(int a, int b)
	{
		return a-b;
	}
	
	public int divide(int a, int b)
	{
		return a/b;
	}
	
	public int multiply(int a, int b)
	{
		return a*b;
	}
	
	public int getRandomNumber()
	{
		System.out.println("vulnerability on purpose");
		SecureRandom sr = new SecureRandom();
		sr.setSeed(123456L);
		return sr.nextInt();
	}
	
}
