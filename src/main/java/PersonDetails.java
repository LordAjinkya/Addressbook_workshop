public class PersonDetails {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    long phoneNo;
    String email;
//passing the variables into the class person details
    public PersonDetails(String firstName, String lastName, String address, String city, String state, int zip,
                         long phoneNo, String email) {
        super();
        this.firstName = firstName; ///using this constructor to call variable from parent class
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNo = phoneNo;
        this.email = email;
    }
    @Override ///to override the functionality of an existing method.
    public String toString() {
        return "PersonDetails [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
                + city + ", state=" + state + ", zip=" + zip + ", phoneNo=" + phoneNo + ", email=" + email + "]";
    }
}
