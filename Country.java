class Country 
{

    public static String name(int code) 
	{
        if (code == 91) {
            return "India";
        }
        if (code == 61) {
            return "China";
        }
        if (code == 34) {
            return "Russia";
        }
        if (code == 1) { 
            return "USA";
        }
        if (code == 78) {
            return "Finland";
        }
		
		return "not found";
	}
}
		
