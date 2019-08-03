package git;

public class Qn4
{

	public static void main(String[] args) 
	{

		int max=0;
		for(int i=100;i<=999;i++)
		{
			int pro=1;
				for(int j=100;j<=999;j++)
				{
					pro=i*j;
					
					String s=String.valueOf(pro);
					StringBuffer sb=new StringBuffer(s);
					sb.reverse();
					if(s.contentEquals(sb))
					{
						if(pro>max)
						{
							max=pro;
						}
					}
					
				}
		}
		System.out.println("Resut="+max);
		
		
	}

}
