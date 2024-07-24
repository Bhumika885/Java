class FoodDeliveryCompany {
   
    String name;
    int price;
    float value;

      FoodDeliveryCompany() {
        System.out.println("Constructor Called");
    }

    public static void main(String[] args) {
            FoodDeliveryCompany fooddeliverycompany = new FoodDeliveryCompany();  

         System.out.println("name: " + fooddeliverycompany.name);
        System.out.println("price: " + fooddeliverycompany.price);
        System.out.println("value: " + fooddeliverycompany.value);
    }
}
