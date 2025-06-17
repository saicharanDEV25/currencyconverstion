//print sum of n natural numbers [1+2+3+....n =n(n+1)/2]  
 class sum
 {
	public int naturalNumbers(int n)
	{
		int s=(n*(n+1)/2);
	 
	 
		return s;
	}
 }
 public class naturalnumbers
 {
	 public static void main(String args[])
	 {
		 sum d=new sum();
		 System.out.println(d.naturalNumbers(10));
		  
	 }
 }