 //print area (area-3.14*r*r)and circumference of circle (2*3.14*r)
 class area 
 {
	public float valueOfArea(float r)
	{
		circumference c=new circumference();
		 float res= c.circle(10);
		System.out.println(res);
		float s=(3.14f*r*r);
		return s;
	}
 }
	class circumference
	{
		public float circle(float r)
		{
		float d=(2*3.14f*r);
		return d;
		
		}
		
 }
 public class circle 
 {
	 public static void main(String args[])
	 {
		 area a=new area();
		 System.out.println(a.valueOfArea(10));
		  
		 
	 }
 }