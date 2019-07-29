package git;

public class qn2 
{
	
	
	public static void main(String[] args) 
	{
		int fno=1,sno=1,fibo,s=0;
		
		while(sno<4000000)
		{
			if(sno%2==0)
			{
				s=s+sno;
			}
			System.out.print(sno+"  ");
			fibo=fno+sno;
			fno=sno;
			sno=fibo;	
		}
		System.out.println();
		System.out.println("Result="+s);
				
		
	}

}
