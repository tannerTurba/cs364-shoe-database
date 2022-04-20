import java.sql.*;
import java.util.ArrayList;

public class Customer {
    private int customerId;
    private String phoneNumber;
    private String email;
    private String streetAddress;
    private String cityAddress;
    private String stateAddress;
    private int zipAddress;
    private String firstName;
    private String lastName;  
    private ArrayList<ShoeModel> shoeList = new ArrayList<>();

    public Customer(String email, String phoneNumber, String streetAddress, String cityAddress, String stateAddress, int zipAddress, String firstName, String lastName) {
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.streetAddress = streetAddress;
        this.cityAddress = cityAddress;
        this.stateAddress = stateAddress;
        this.zipAddress = zipAddress;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Boolean isInDatabase(Database db) {
        try {
            String query = "SELECT count(*) AS count FROM Customer WHERE Customer.FirstName = \'" + firstName + "\' AND Customer.LastName = \'" + lastName + "\'";
            ResultSet results = db.execute(query);
            results.next();
            int count = results.getInt("count");
            return count != 0;
        } catch(SQLException e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
            return false;
        }
    }

    public void pickOutShoes(Database db) {
        int numberOfShoes = (int)(Math.random() * 100);

        try {
            String query = "SELECT * FROM Model ORDER BY RAND() LIMIT " + numberOfShoes;
            ResultSet results = db.execute(query);
            
            while(results.next()) {
                String modelId = results.getString("ModelId");
                String name = results.getString("ModelName");
                String silhouette = results.getString("Silhouette");
                String styleID = results.getString("StyleId");
                String color = results.getString("Color");
                long price = results.getLong("Price");
                String thumbnail = results.getString("Thumbnail");

                shoeList.add(new ShoeModel(modelId, styleID, price, silhouette, name, color, thumbnail));
            }
        } catch(SQLException e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }
    }

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
     * @return String return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
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


    /**
     * @return ArrayList<ShoeModel> return the shoeList
     */
    public ArrayList<ShoeModel> getShoeList() {
        return shoeList;
    }

    /**
     * @param shoeList the shoeList to set
     */
    public void setShoeList(ArrayList<ShoeModel> shoeList) {
        this.shoeList = shoeList;
    }

}
