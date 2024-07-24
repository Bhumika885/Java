class Matrimony {
   
    String name;
    int price;
    double value;

       Matrimony() {
        System.out.println("Constructor Called");
    }

    public static void main(String[] args) {
             Matrimony matrimony = new Matrimony();  
			 
			String name="bhumika";
			 int price=6;
			 double value=33.0;

         System.out.println("name: " + matrimony.name);
        System.out.println("price: " + matrimony.price);
        System.out.println("value: " + matrimony.value);
    }
}
