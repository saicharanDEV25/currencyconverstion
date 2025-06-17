//print simple interest (SI=p*t*r/100)
class simple
{
	public float SI(int p,int t,int r)
	{
		float a=(p*t*r)/(100f);
		return a;
	}
}
public class simpleinterest
{
	public static void main(String...args)
	{
		simple s=new simple();
        float res= s.SI(44,25,66);
		System.out.println(res);
	}
}
		