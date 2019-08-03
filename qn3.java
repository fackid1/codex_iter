package git;

public class qn3 
{

	public static void main(String[] args) 
	{

		long n=600851475143L;long max=0;int flag=0;
		for(long i=3;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				for(long j=2;j<=Math.sqrt(i);j++)
				{
					if(i%j==0)
					{
						flag=1;
						break;
					}
					
				}
				if(flag==0)
				{
					if(max<i)
					{
						max=i;
					}
				}
			}
		}
		System.out.println("Result="+max);
	}

}
