package API_Pojo;

public class addcontactpojo {
    private String firstName;
    private String lastName;
    private String birthdate;
    private String email;
    private String phone;

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String street1;
    private String street2;
    private String city;
    private String stateProvince;
    private String postalCode;
    private String country;
}


