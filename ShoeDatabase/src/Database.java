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

    public void insertMakes(ShoeModel shoe) {
        String sql = "INSERT INTO Makes(ReleaseDate, BrandId, ModelId) VALUES (?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            String releaseDate = shoe.getReleaseDate();
            if(releaseDate.equals("null"))
                stmt.setNull(1, Types.NVARCHAR);
            else
                stmt.setString(1, releaseDate);
            stmt.setInt(2, getBrandId(shoe.getBrand()));
            stmt.setString(3, shoe.getModelId());
            if(stmt.execute())
                System.out.println("Inserted " + shoe.getModelId() + " into Makes");

        } catch(SQLException e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }
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

            String color = shoe.getColor();
            if(color.equals("null"))
                stmt.setNull(6, Types.NVARCHAR);
            else
                stmt.setString(6, color);

            String thumbnail = shoe.getThumbnail();
            if(thumbnail.equals("null"))
                stmt.setNull(7, Types.NVARCHAR);
            else
                stmt.setString(7, thumbnail);

            stmt.setString(7, shoe.getThumbnail());
            if(stmt.execute())
                System.out.println("Inserted");

        } catch(SQLException e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }
    }

    public int insertBrand(Brand brand) {
        String sql = "INSERT INTO Brand(YearEstablished, AddressStreet, AddressCity, AddressState, AddressZip, AddressCountry, Name) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, brand.getYearEstablished());
            stmt.setString(2, brand.getStreetAddress());
            stmt.setString(3, brand.getCityAddress());
            
            String state = brand.getStateAddress();
            if(state.equals("null")) 
                stmt.setNull(4, Types.NVARCHAR);
            else
                stmt.setString(4, state);

            stmt.setInt(5, brand.getZipAddress());
            stmt.setString(6, brand.getCountryAddress());
            stmt.setString(7, brand.getName());
            if(stmt.execute()) {
                System.out.println("Inserted");
                ResultSet keys = stmt.getGeneratedKeys();
                keys.next();
                return keys.getInt("BrandId");
            }
            return -1;

        } catch(SQLException e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }
        return -1;
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

    public int getBrandId(String brand) {
        try {
            String query = "SELECT BrandId FROM Brand WHERE Brand.Name = \'" + brand + "\'";
            ResultSet results = execute(query);
            results.next();
            return results.getInt("BrandId");
        } catch(SQLException e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
            return -1;
        }
    }
    
    public ResultSet execute(String query) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement(query);
        return stmt.executeQuery();
    }

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
