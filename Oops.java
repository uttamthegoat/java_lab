import java.util.Scanner;

class Student
{
String name,USN,branch;
	void readData(String name1,String USN1, String branch1)
	{
		name=name1;
		USN=USN1;
		branch=branch1;
	}

	void displayResult()
	{
		System.out.println("Student name is "+name);
		System.out.println("Student USN is "+USN);
		System.out.println("Student branch is "+branch);
	}
	public static void main(String[] args)
	{
		String name1,USN1,branch1;
		Student det=new Student();
		Scanner sc=new Scanner(System.in);
		name1=sc.nextLine();
		USN1=sc.nextLine();
		branch1=sc.nextLine();
		det.readData(name1,USN1,branch1);
		det.displayResult();
	}
	
}

class StudentMain
{
	
}

