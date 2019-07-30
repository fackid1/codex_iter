package git;

public class qn6 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n=100;
		double s1,s2;
		s1=(n*(n+1)*(2*n+1))/6;
		int k=(n*(n+1))/2;
		
		double result=Math.pow(k, 2)-s1;
		System.out.printf("Result=%.0f",result);

	}

}
