//print precentage of 3 subjects (precentage =M+P+C/300)*(100)
class precentage 
{
	public float precentage (int m,int p,int c)
	{
		float a=(m+p+c/300)*100f;
		return a;
	}
}
public class offline
{
	public static void main(String...args)
	{
		precentage p1=new precentage();
				float b=(80+50+40/300)*100f;
	System.out.println("precentage of three subjects is "+b);
	}
}