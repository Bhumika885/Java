class AutoRickshaw {
   
    String name;
    int price;
    float value;

     AutoRickshaw() {
        System.out.println("Constructor Called");
    }

    public static void main(String[] args) {
           AutoRickshaw autorickshaw = new AutoRickshaw();  

         System.out.println("name: " + autorickshaw.name);
        System.out.println("price: " + autorickshaw.price);
        System.out.println("value: " + autorickshaw.value);
    }
}
