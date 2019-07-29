package git;

import java.math.BigInteger;

public class Qn16 {

	public static void main(String[] args)
	{

		BigInteger b1=new BigInteger("2").pow(1000);
		char [] a=b1.toString().toCharArray();
		int sum=0;
		for(char c:a)
		{
			sum+=Character.getNumericValue(c);
		}
		System.out.println(sum);
	}

}
