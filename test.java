import java.lang.*;
import java.util.*;
class test
{
	public static void main(String...args)
	{
		System.out.println("may i know your name");
		String name;
		Scanner sc=new Scanner(System.in);
		name = sc.nextLine();
		System.out.println("welcome " +name);
	}
}