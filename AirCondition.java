class AirCondition {
   
   String name;
    int price;
    float value;

    AirCondition() {
        System.out.println("Constructor Called");
    }

    public static void main(String[] args) {
          AirCondition aircondition = new AirCondition();  

         System.out.println("name: " + aircondition.name);
        System.out.println("price: " + aircondition.price);
        System.out.println("value: " + aircondition.value);
    }
}
