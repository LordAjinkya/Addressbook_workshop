import java.util.ArrayList;
import java.util.List;

public class Addressbookmain {
    /* @Description - To create a contacts in address book with first name, last name, address, city, state,
     * zip,mobile number.*/
    public static void main(String[] args) {
        System.out.println("Welcome to address book system program");
        Contact contact = new Contact("Ajinkya", "Narale", "Dhantoli",
                "Katol", "MH", 226001,
                9180256231L, "aj.bc@gmail.com");
        System.out.println(contact.toString());
        System.out.println("Welcome to the addressbook prog");
    }

    /* @Description - Add new contacts to the address book  */
    public boolean addContact(Contact contact){
        System.out.println(contact);
        List<Contact> contactList = new ArrayList<>();
        try {
            contactList.add(contact);
            System.out.println(contactList);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
