package ShoeDatabase.src;

public class Customer {
    private int customerId;
    private int phoneNumber;
    private String email;
    private String streetAddress;
    private String cityAddress;
    private String stateAddress;
    private int zipAddress;
    private String firstName;
    private String lastName;   

    /**
     * @return int return the customerId
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    /**
     * @return int return the phoneNumber
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String return the streetAddress
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * @param streetAddress the streetAddress to set
     */
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    /**
     * @return String return the cityAddress
     */
    public String getCityAddress() {
        return cityAddress;
    }

    /**
     * @param cityAddress the cityAddress to set
     */
    public void setCityAddress(String cityAddress) {
        this.cityAddress = cityAddress;
    }

    /**
     * @return String return the stateAddress
     */
    public String getStateAddress() {
        return stateAddress;
    }

    /**
     * @param stateAddress the stateAddress to set
     */
    public void setStateAddress(String stateAddress) {
        this.stateAddress = stateAddress;
    }

    /**
     * @return int return the zipAddress
     */
    public int getZipAddress() {
        return zipAddress;
    }

    /**
     * @param zipAddress the zipAddress to set
     */
    public void setZipAddress(int zipAddress) {
        this.zipAddress = zipAddress;
    }

    /**
     * @return String return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return String return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
