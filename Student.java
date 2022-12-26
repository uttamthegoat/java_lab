import java.util.Scanner;

class Student
{
String name,USN,branch;
	void readData(String nam,String US, String branc)
	{
		Scanner sc=new Scanner(System.in);
		nam=sc.nextLine();
		US=sc.nextLine();
		branc=sc.nextLine();

		
	}

	void displayResult()
	{
		System.out.println("Student name is "+name);
		System.out.println("Student USN is "+USN);
		System.out.println("Student branch is "+branch);
	}
	
}

class StudentMain
{
	public static void main(String[] args)
	{
		String name,USN,branch;
		Student det=new Student();
		det.readData(nam,US,branc);
		det.displayResult();
		
	}
	
}

//class StudentMain
//{
//}

