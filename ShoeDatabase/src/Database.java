import java.sql.*;
import java.util.Currency;

/*
 * load SQL driver(JDBE/OOBC)
 *  - add to build path
 * 
 * set up our database(script)
 *  - create database
 *  - create tables
 *  - populate with data(optional)
 * 
 * connect to database
 * 
 * insert/modify/delete data
 * 
 * query data
 * 
 * disconnect from database
 * 
 */


public class Database {
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/shoes?user=root&password=Sneakers123";
    
    public void connect() throws SQLException {
        connection = DriverManager.getConnection(url);
    }

    public void disconnect() throws SQLException {
        connection.close();
    }

    public ResultSet runQuery(String query) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement(query);
        ResultSet results = stmt.executeQuery();
        return results;
    }

    public void insertShoeModel(ShoeModel shoe) {
        String sql = "INSERT INTO Model(ModelId, StyleId, Price, Silhouette, ModelName, Color, Thumbnail) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, shoe.getModelId());
            stmt.setString(2, shoe.getStyleID());
            stmt.setLong(3, shoe.getPrice());
            stmt.setString(4, shoe.getSilhouette());
            stmt.setString(5, shoe.getName());
            stmt.setString(6, shoe.getColor());
            stmt.setString(7, shoe.getThumbnail());
            if(stmt.execute())
                System.out.println("Inserted");

        } catch(SQLException e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }
    }

    public void insertBrand(Brand brand) {
        String sql = "INSERT INTO Brand(YearEstablished, AddressStreet, AddressCity, AddressState, AddressZip, Name) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, brand.getYearEstablished());
            stmt.setString(2, brand.getStreetAddress());
            stmt.setString(3, brand.getCityAddress());
            stmt.setString(4, brand.getStateAddress());
            stmt.setInt(5, brand.getZipAddress());
            stmt.setString(6, brand.getName());
            if(stmt.execute())
                System.out.println("Inserted");

        } catch(SQLException e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }
    }

    public void insertCustomer(Customer customer) {
        String sql = "INSERT INTO Customer(PhoneNumber, Email, StreetAddress, CityAddress, StateAddress, ZipAddress, FirstName, LastName) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, customer.getPhoneNumber());
            stmt.setString(2, customer.getEmail());
            stmt.setString(3, customer.getStreetAddress());
            stmt.setString(4, customer.getCityAddress());
            stmt.setString(5, customer.getStateAddress());
            stmt.setInt(6, customer.getZipAddress());
            stmt.setString(7, customer.getFirstName());
            stmt.setString(8, customer.getLastName());
            if(stmt.execute())
                System.out.println("Inserted");

        } catch(SQLException e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }
    }
    
    // public ResultSet employeeLookup(String query, String ssn) throws SQLException {
    //     PreparedStatement stmt = connection.prepareStatement(query);
    //     stmt.setString(1, ssn); //index of wildcard(starts at index 1), variable to use
    //     ResultSet results = stmt.executeQuery();
    //     return results;
    // }

    // public void insertEmployee(Employee e) throws SQLException {
    //     String sql = "INSERT INTO Employee (SSN, Salary, FistName, MiddleName, LastName) VALUES (?, ?, ?, ?, ?)";
    //     PreparedStatement stmt = connection.prepareStatement(sql);
    //     stmt.setString(1, e.getSsn());
    //     stmt.setDouble(2, e.getSalary());
    //     stmt.setString(3, e.getFirstName());
    //     stmt.setString(4, e.getMiddleName());
    //     stmt.setString(5, e.getLastName());
    // }
}
