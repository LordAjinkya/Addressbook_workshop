import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressBookTest {

    public void initialize() {
        AddressBook addressBook;
    }
    @Test
    public void givenContactInAddressBookReturnTrue() {
        AddressBook addressBook = new AddressBook();
        Contacts contacts = new Contacts("Ajinkya", "Narale", "Dhantoli", "Nagpur", "MH", 123456, 1234567899, "abc@gmail.com");
        boolean result = addressBook.addContacts(contacts);
        Assertions.assertTrue(result);
    }
    @Test
    public void givenEditNameInAddressBookWhenNameReturnTrue() {
        AddressBook addressBook = new AddressBook();
        Contacts contacts = new Contacts("Ajinkya", "Narale", "Dhantoli", "Nagpur", "MH", 123456, 1234567899, "abc@gmail.com");
        boolean result = addressBook.addContacts(contacts);
        Contacts editContact = addressBook.editContacts(addressBook.contactList, "Ram", "address","editContacts");
        Assertions.assertTrue(result);
    }
}
