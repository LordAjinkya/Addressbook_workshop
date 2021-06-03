import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressbookmainTest {
    @Before
    public void initialize() {
        Addressbookmain addressbookmain;
    }

    @Test
    public void givenContact_WhenAddedToAddressBook_ShouldReturnTrue(){
        Addressbookmain addressBook = new Addressbookmain();
        Contact contact = new Contact("Ajinkya", "Narale", "Dhantoli",
                "Katol", "MH", 226001,
                9180256231L, "aj.bc@gmail.com");
        boolean result = addressBook.addContact(contact);
        Assertions.assertTrue(result);

    }
}
