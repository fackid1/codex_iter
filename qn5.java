package git;

public class qn5 
{

	public static void main(String[] args) 
	{
		
	long lcm=1l;
	for(long i=1l;i<=20;i++)
		lcm=lcm(i,lcm);
	System.out.println("Result="+lcm);
	}

	public static long lcm(long i, long lcm)
	{
		// TODO Auto-generated method stub
		
		long m=i,n=lcm,gcd=0;
		while(m!=n)
		{
			if(m>n)
				m-=n;
			else
				n-=m;
		}
		gcd=m;
		return (i*lcm)/gcd;
			
	}

}
