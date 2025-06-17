//print area of triangle (area=1/2*base*height)
class triangle
{
	public float area(int base,int height)
	{
		float total=(base*height);
	  float a=(0.5f*total);
	  return a;
	}
}
public class test
{
	public static void main(String...args)
	{
		triangle t=new triangle();
			float f=t.area(12,44);
			System.out.println(f);
	}
}