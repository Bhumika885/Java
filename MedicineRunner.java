class MedicineRunner{
	
	public static void main(String[]args){
		
		if(args.length==4)
		{
			String name=args[0];
			String date=args[1];
			String price=args[2];
		String quantity=args[3];}
		    float convertedPrice=Float.parseFloat(price);
			int   convertedQuantity=Integer.parseFloat(quantity);
			double convertedDate=Double.parseDouble(date);
			Medicinemeds.print(name,Converteddate,Convertedprice,Convertedquantity);
			else
			{
				System.out.println("other args");
			}
		}
}
			
	
	