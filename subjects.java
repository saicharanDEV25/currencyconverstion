//print percentage of 3 subjects (percentage = M+P+C/300)*(100)
class studentsData
{
	public float percentage (int m,int p,int c)
	{
		float total=m+p+c;
		float a=(total /300)*100f;
		return a;
	}
}
public class subjects
{
	public static void main(String args[])
	{
		studentsData s=new studentsData();
	float f	=s.percentage(100,50,40);
			System.out.println(f);
	}
}	
