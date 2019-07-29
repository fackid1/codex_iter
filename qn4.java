package git;

public class qn4 
{
	public static void main(String[] args) 
	{
		 int max=0;

		boolean flag = false;int product=1;
		for(int i=100;i<=999;i++)
		{
			for(int j=100;j<=999;j++)
			{
				 product=i*j;
				 flag=palindrom(product);
			
			if(flag==true)
			{
				if(max<product)
				{
					max=product;
				}
			}
		 }
		}
		System.out.println("Result="+max);
	}
	public static boolean palindrom(int product) 
	{

		int x=product, s=0,y=product;
		
		while(x!=0)
		{
			int r=x%10;
			s=s*10+r;
			x=x/10;
			
		}
		if(s==y)
		{
			return true;
		}
		else
			return false;
	}

}
