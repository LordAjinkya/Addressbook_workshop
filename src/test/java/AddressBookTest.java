import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AddressBookTest {

    public void initialize() {
        AddressBook addressBook;
    }
    @Test
    public void givenContactInAddressBookReturnTrue() {
        AddressBook addressBook = new AddressBook();
        Contacts contacts = new Contacts("Ram", "Sharma", "Line - 3", "maharashtra", "solapur", 123456, 1234567899, "abc@gmail.com");
        List<Contacts> result = addressBook.addContacts(contacts);
        Assertions.assertEquals(result, "Ram");
    }

    @Test
    public void givenEditNameInAddressBookWhenNameReturnTrue() {
        AddressBook addressBook = new AddressBook();
        Contacts contacts = new Contacts("Ram", "Sharma", "Line - 3", "maharashtra", "solapur", 123456, 1234567899, "abc@gmail.com");
        List<Contacts> result = addressBook.addContacts(contacts);
        Contacts editContact = addressBook.editContacts(addressBook.contactList, "Ram", "address","editContacts");
        Assertions.assertEquals("Line - 3", editContact.address);
    }
    @Test
    public void givenNameWhenDeleteShouldReturnTrue() {
        AddressBook addressBook = new AddressBook();
        Contacts contacts = new Contacts("Ajinkya", "Narale", "Dhantoli", "Nagpur", "MH", 123456, 1234567899, "abc@gmail.com");
        List<Contacts> contactsList = addressBook.addContacts(contacts);
        List<Contacts> deleteContactList = addressBook.deleteContacts(contactsList, "Ajinkya");
        Assertions.assertEquals(0, deleteContactList.size());
    }
}
