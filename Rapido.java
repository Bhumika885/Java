class Rapido {
   
    String name;
    int price;
    float value;

     Rapido() {
        System.out.println("Constructor Called");
    }

    public static void main(String[] args) {
           Rapido rapido = new Rapido();  

         System.out.println("name: " + rapido.name);
        System.out.println("price: " + rapido.price);
        System.out.println("value: " + rapido.value);
    }
}
