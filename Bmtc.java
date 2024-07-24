class Bmtc {
   
    String name;
    int price;
    float value;

      Bmtc() {
        System.out.println("Constructor Called");
    }

    public static void main(String[] args) {
            Bmtc bmtc = new Bmtc();  

         System.out.println("name: " + bmtc.name);
        System.out.println("price: " + bmtc.price);
        System.out.println("value: " + bmtc.value);
    }
}
