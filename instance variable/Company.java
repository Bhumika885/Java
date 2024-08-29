class Company
{
	int id=3455789;
	String name="Amazon";;
	String location="Bengaluru";
	SoftwareEngineer softwareEngineer=new SoftwareEngineer("Bhumi",1,"Intern",120000);
	public void show()
	{
		System.out.println("Id:"+this.id);
		System.out.println("Name:"+this.name);
		System.out.println("Location:"+this.location);
		this.softwareEngineer.display();
	}
	
}