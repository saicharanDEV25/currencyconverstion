class naturalnumber
{
    public int calculateSum(int n)
	{
		int a=n*(n+1)/2;
		return a;
	}
}
public class arthmetic
{
	public static void main(String...args)
	{
		naturalnumber s=new naturalnumber();
		int a=s.calculateSum(10);
		System.out.println(a);
	}
}