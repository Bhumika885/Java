class Hotel
{
	String name="Nandana Palace";
	Owner owner=new Owner("Chethana",22,"Female");
	public void print()
	{
		System.out.println("Hotel Name:"+name);
		this.owner.show();
	}
}