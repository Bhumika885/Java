class CabCompany {
   
    String name;
    int price;
    float value;

     CabCompany() {
        System.out.println("Constructor Called");
    }

    public static void main(String[] args) {
           CabCompany cabcompany = new CabCompany();  

         System.out.println("name: " + cabcompany.name);
        System.out.println("price: " + cabcompany.price);
        System.out.println("value: " + cabcompany.value);
    }
}
