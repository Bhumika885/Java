class AutoDriver {
   
    String name;
    int price;
    float value;

     AutoDriver() {
        System.out.println("Constructor Called");
    }

    public static void main(String[] args) {
           AutoDriver autodriver = new AutoDriver();  

         System.out.println("name: " + autodriver.name);
        System.out.println("price: " + autodriver.price);
        System.out.println("value: " + autodriver.value);
    }
}
