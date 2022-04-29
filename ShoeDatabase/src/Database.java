import java.sql.*;
import java.math.*;

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
    // private String url = "jdbc:mysql://127.0.0.1:3306/shoes?user=root&password=5628";

    
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

    public void insertBuys(Customer customer, ShoeModel shoe) {
        String sql = "INSERT INTO Buys(PaymentType, TotalCost, Quantity, Size, Color, CustomerId, ModelId) VALUES (?, ?, ?, ?, ?, ?, ?)";
        int size = (int)(Math.random() * 8) + 6;
        int quantity = (int)(Math.random() * 4) + 1;
        int ran = (int)(Math.random() * 10);
        String paymentType = "";
        if(ran % 2 == 0)
            paymentType = "Credit";
        else 
            paymentType = "Debit";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, paymentType);
            stmt.setFloat(2, shoe.getPrice() * quantity);
            stmt.setInt(3, quantity);
            stmt.setInt(4, size);
            if(shoe.getColor() == null)
                stmt.setNull(5, Types.NVARCHAR);
            else
                stmt.setString(5, shoe.getColor());
            stmt.setInt(6, getCustomerId(customer));
            stmt.setString(7, shoe.getModelId());
            if(stmt.execute())
                System.out.println("Inserted " + shoe.getModelId() + " into Buys");

        } catch(SQLException e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }
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
        int brandId = -1;
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
                brandId = keys.getInt("BrandId");
                System.out.println(brandId);
            }

        } catch(SQLException e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }
        return brandId;
    }

    public void deleteBrand(String brandId) {
        String delete = "DELETE FROM Brand WHERE BrandId = \""  + brandId + "\"";
        try {
            dbExecuteUpdate(delete);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateBrand(Brand brand) {
        String update = "UPDATE Brand SET "
                    + "YearEstablished = \"" + brand.getYearEstablished() + "\","
                    + "AddressStreet = \"" + brand.getStreetAddress() + "\","
                    + "AddressCity = \"" + brand.getCityAddress() + "\","
                    + "AddressState = \"" + brand.getStateAddress() + "\","
                    + "AddressZip = \"" + brand.getZipAddress() + "\","
                    + "AddressCountry = \"" + brand.getCountryAddress() + "\","
                    + "Name = \"" + brand.getName() + "\"" 
                    + "WHERE BrandId = \"" + brand.getBrandId() + "\"";
            
        try {
            dbExecuteUpdate(update);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 
    public int addBrand(Brand brand) {
        String sql = "INSERT INTO Brand(YearEstablished, AddressStreet, AddressCity, AddressState, AddressZip, AddressCountry, Name) VALUES (?, ?, ?, ?, ?, ?, ?)";
        int brandId = -1;
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, brand.getYearEstablished());
            stmt.setString(2, brand.getStreetAddress());
            stmt.setString(3, brand.getCityAddress());
            stmt.setString(4, brand.getStateAddress());
            stmt.setInt(5, brand.getZipAddress());
            stmt.setString(6, brand.getCountryAddress());
            stmt.setString(7, brand.getName());

            if(stmt.execute()) {
                System.out.println("Inserted");
                ResultSet keys = stmt.getGeneratedKeys();
                keys.next();
                brandId = keys.getInt("BrandId");
                System.out.println(brandId);
            }
        } catch(SQLException e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }
        return brandId;
    }

    public void insertCustomer(Customer customer) {
        String sql = "INSERT INTO Customer(PhoneNumber, Email, StreetAddress, CityAddress, StateAddress, ZipAddress, FirstName, LastName) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, customer.getPhoneNumber());
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

    public void addCustomer(Customer customer) {
        String insert = "INSERT INTO Customer(PhoneNumber, Email, StreetAddress,"
                    + " CityAddress, StateAddress, ZipAddress, FirstName, LastName) VALUES "
                    + "(" + customer.getPhoneNumber() + ", " + customer.getEmail() + ", " +
                    customer.getStreetAddress() + ", " + customer.getCityAddress() + ", " +
                    customer.getStateAddress() + ", " + customer.getZipAddress() + ", " +
                    customer.getFirstName() + ", " + customer.getLastName() + ")";
        try {
            PreparedStatement stmt = connection.prepareStatement(insert);
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCustomer(String customerId) {
        String delete = "DELETE FROM Customer WHERE CustomerId = \""  + customerId + "\"";
        try {
            dbExecuteUpdate(delete);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getBrandId(String brand) {
        try {
            String query = "SELECT BrandId FROM Brand WHERE Brand.Name = \'" + brand + "\'";
            ResultSet results = executeSQL(query);
            results.next();
            return results.getInt("BrandId");
        } catch(SQLException e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
            return -1;
        }
    }
    
    public int getCustomerId(Customer customer) {
        try {
            String query = "SELECT CustomerId FROM Customer WHERE Customer.FirstName = \'" + customer.getFirstName() + "\' AND Customer.LastName = \'" + customer.getLastName() + "\'";
            ResultSet results = executeSQL(query);
            results.next();
            return results.getInt("CustomerId");
        } catch(SQLException e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
            return -1;
        }
    }

    public ResultSet executeSQL(String query) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement(query);
        return stmt.executeQuery();
    }

    public void dbExecuteUpdate(String query) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.executeUpdate();
    }
}
