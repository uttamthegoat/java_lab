import java.util.Scanner;

class Student
{
	String Id,name,age;
	Scanner sc=new Scanner(System.in);
	Student()
	{
		Id=sc.nextLine();
		name=sc.nextLine();
		age=sc.nextLine();
	}
	Student(String Id)
	{
		this.Id=Id;
	}
	Student(String Id,String name)
	{
		this.Id=Id;
		this.name=name;
	}
	Student(String Id,String name,String age)
	{
		this.Id=Id;
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println("Id: "+Id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}

class ProgramStudents
{
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.display();
		
		Student s1=new Student("21cs175");
		s1.display();
	}
}
