package git;

public class qn3 
{

	public static void main(String[] args) 
	{

		long l=600851475143L,b=2l;
		while(b<=l)
		{
			if(l%b==0)
			{
				l=l/b;
			}
			b++;
		}
		System.out.println("Result="+(b-1));
		
	}

}
