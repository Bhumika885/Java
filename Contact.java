class Contact {
    
    public static String searchContact(long mobileNo) {
        System.out.println("starting searchContact");
        System.out.println("mobileNo: " + mobileNo);
        
        if (mobileNo == 9880781183L) {
            System.out.println("found");
            return "bhumi";
			}
		else if (mobileNo == 8765432137L) {
            System.out.println("not found");
            return "jack";
			} 
			else {
            System.out.println("xx");
            return null;
			}
        }
    }

		
		