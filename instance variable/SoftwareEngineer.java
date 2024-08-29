class SoftwareEngineer
{
	String name;
	double experience;
	String designation;
	double salary;
	public SoftwareEngineer()
	{
		System.out.println("Created SoftwareEngineer with no arguments constructor");
	}
	public SoftwareEngineer(String name,double experience,String designation,double salary)
	{
		this.name=name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Experience:"+this.experience);
		System.out.println("Designation:"+this.designation);
		System.out.println("Salary:"+this.salary);
	}
	
}