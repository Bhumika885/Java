public class ContactRunner {
    
    public static void main(String[] args) {
        System.out.println("Start main method");
        
        // Call searchContact method with different mobile numbers
        String name1 = Contact.searchContact(9880781183L);
        System.out.println("Name found for 9880781183L: " + name1);
        
        String name2 = Contact.searchContact(8765432137L);
        System.out.println("Name found for 8765432137L: " + name2);
        
        String name3 = Contact.searchContact(1234567890L);
        System.out.println("Name found for 1234567890L: " + name3); // This will print null
    }
}
