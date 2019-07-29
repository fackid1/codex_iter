package git;

public class qn5 
{

	public static void main(String[] args) 
	{
		int flag=0,c,i;
		for( i=20;flag!=1;i++)
		{
			 c=0;
			for(int j=2;j<=20;j++) 
			{
				if(i%j!=0)
				{
					break;
				}
				else
				{
					c++;
				}
				
			}
			if(c==19)
			{
				flag=1;
			}
		}
		System.out.println("Result="+(i-1));
	}

}
