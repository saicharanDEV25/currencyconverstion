//create a student class with variables name,dob,mobile number percentage and bgroup 
//with some values .take test calss with main(),create object for students class and
//print students details.(write expected output also)

class student 
{
	String name="saicharan";
	int dob=13092003;
	long mobileNumber=9959345608L;
	float percentage=55.5f;
	String bloodGroup= "o postive";
	
}
public class classTest
{
	public static void main(String args[])
	{
		student s=new student();
	    System.out.println("name :"+ s.name);
		System.out.println("dob  :"+ s.dob);
		System.out.println("mobileNumber :"+ s.mobileNumber);
		System.out.println("percentage:"+ s.percentage);
		System.out.println("bloodGroup :"+ s.bloodGroup);
		
	}
}