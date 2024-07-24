class Rupee {
   
   String name;
    int price;
    float value;

    Rupee() {
        System.out.println("Constructor Called");
    }

    public static void main(String[] args) {
          Rupee rupee = new Rupee();  

         System.out.println("name: " + rupee.name);
        System.out.println("price: " + rupee.price);
        System.out.println("value: " + rupee.value);
    }
}
