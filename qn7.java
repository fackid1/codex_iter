package git;

public class qn7 
{

	public static void main(String[] args)
	{
		double prime=0,c=0;
		for(double i=2;c<10001;i++)
		{
			int flag=0;
			for(double j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				prime=i;
				c++;
			}
		}
		System.out.println("Result="+prime);
	}

}
