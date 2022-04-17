import java.io.*;
import java.sql.*;
import java.util.ArrayList;


public class Driver {
    Database db = new Database();

    public static void main(String[] args) {
        new Driver("/Users/tannerturba/Library/Mobile Documents/com~apple~CloudDocs/Documents/CS 364/sneaks/NMD_data2.txt");
    }

    public Driver(String files) {
        try {
            db.connect();
            System.out.println("Successful connection!");
        } catch(SQLException e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }

        ArrayList<ShoeModel> shoes = getAllShoes(files);
        for(int i = 0; i < shoes.size(); i++) {
            ShoeModel s = shoes.get(i);
            db.insertShoeModel(s);
        }
        
    }

    public Boolean findBrand(String brand) {
        try {
            String query = "SELECT Brand.Name FROM Brand WHERE Brand.Name = \'" + brand + "\'";
            ResultSet results = db.runQuery(query);
            return results.getFetchSize() != 0 && results.getString("Name").equals(brand);
        } catch(SQLException e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
            return false;
        }
    }

    private void printShoes(ArrayList<ShoeModel> shoes){
        for(int i = 0; i < shoes.size(); i++) {
            ShoeModel s = shoes.get(i);
            System.out.println(s);
            System.out.println();
        }
    }

    private ArrayList<ShoeModel> getAllShoes(String files) {
        ArrayList<ShoeModel> allShoes = new ArrayList<>();
        try {
            // for(String file : files) {
                FileReader in = new FileReader(files);
                BufferedReader reader = new BufferedReader(in);
                
                while(reader.ready()) {
                    String modelId = reader.readLine();
                    String name = reader.readLine();
                    String brand = reader.readLine();
                    String silhouette = reader.readLine();
                    String styleID = reader.readLine();
                    String color = reader.readLine();
                    long price = Long.parseLong(reader.readLine());
                    String thumbnail = reader.readLine();
                    String releaseDate = reader.readLine();
                    reader.readLine();
                    
                    ShoeModel newShoe = new ShoeModel(modelId, styleID, price, silhouette, name, color, thumbnail, brand, releaseDate);
                    allShoes.add(newShoe);
                }

                reader.close();
            // }
        } catch(IOException e) {
            e.printStackTrace();
        }
        return allShoes;
    }
}