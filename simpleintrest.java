//print simple intrest (SI=p*t*r/100)
class simple
{
	public float intrest(float p,float t, float r)
	{
		float s=(p*t*r/100f);
		 
		
		return s;
	}
}
public class simpleintrest
{
	public static void main(String args[])
	{
		simple d=new simple();
		  
		 System.out.println(d.intrest(20,22,6)); 
	}
	
}