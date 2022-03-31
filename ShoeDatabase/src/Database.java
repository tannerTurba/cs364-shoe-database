package ShoeDatabase.src;
import java.sql.*;

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
    //TODO: figure out username and password
    private String url = "jdbc:mysql://localhost/shoe.db?user=<username>&password=<password>";
    
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
