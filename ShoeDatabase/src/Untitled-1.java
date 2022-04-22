import java.sql.*;

public class Brand {
    private int brandId;
    private int yearEstablished;
    private String streetAddress;
    private String cityAddress;
    private String stateAddress;
    private int zipAddress;
    private String countryAddress;
    private String name;

    public Brand(int yearEstablished, String streetAddress, String cityAddress, String stateAddress, int zipAddress, String countryAddress, String name) {
        this.yearEstablished = yearEstablished;
        this.streetAddress = streetAddress;
        this.cityAddress = cityAddress;
        this.stateAddress = stateAddress;
        this.zipAddress = zipAddress;
        this.countryAddress = countryAddress;
        this.name = name;
    }

    public Boolean isInDatabase(Database db) {
        try {
            String query = "SELECT count(*) AS count FROM Brand WHERE Brand.Name = \'" + name + "\'";
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

    /**
     * @return int return the yearEstablished
     */
    public int getYearEstablished() {
        return yearEstablished;
    }

    /**
     * @param yearEstablished the yearEstablished to set
     */
    public void setYearEstablished(int yearEstablished) {
        this.yearEstablished = yearEstablished;
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
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * @return String return the countryAddress
     */
    public String getCountryAddress() {
        return countryAddress;
    }

    /**
     * @param countryAddress the countryAddress to set
     */
    public void setCountryAddress(String countryAddress) {
        this.countryAddress = countryAddress;
    }


    /**
     * @return int return the brandId
     */
    public int getBrandId() {
        return brandId;
    }

    /**
     * @param brandId the brandId to set
     */
    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

}
