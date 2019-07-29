package git;

public class qn8 
{
	public static void main(String[] args) 
	{
		int flag=0;
		double s=0,i;
		for( i=1;flag!=1;i++)
		{
			int c=0;
			 s=s+i;
			 for(double j=1;j<=Math.sqrt(s);j++)
			 {
				 if(s%j==0)
				 {
					 c++;
				 }
			 }
			 if(c==499)
			 {
				 flag=1;
			 }
		}
		System.out.println("Result="+s);
		
	}
	

}
