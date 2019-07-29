package git;

public class qn6 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		double s1=0,s2=0;
		for(int i=1;i<=100;i++)
		{
			s1=s1+Math.pow(i,2);
			s2=s2+i;
		}
		
		double result=Math.pow(s2, 2)-s1;
		System.out.printf("Result=%.0f",result);

	}

}
