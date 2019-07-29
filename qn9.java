package git;

public class qn9 
{
	public static void main(String[] args) 
	{

		int sum=1000;
		int i,j,k,multi=1;
		for(i=1;i<=(sum/3);i++)
		{
			for(j=i+1;j<=(sum/2);j++)	
			{
				k=sum-i-j;
				if(k>j && (i*i+j*j==k*k))
						
				{
					multi=i*j*k;
					System.out.println("Result="+multi);
				}
			}
		}
					
				 
	}

}
