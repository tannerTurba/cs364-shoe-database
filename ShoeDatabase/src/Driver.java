import java.io.*;
import java.sql.*;
import java.util.ArrayList;


public class Driver {
    Database db = new Database();

    public static void main(String[] args) {
        String brands = "/Users/tannerturba/Desktop/Brands.txt";
        String shoeModels = "/Users/tannerturba/Desktop/Ultraboost_data.txt";
        String[] files = {brands, shoeModels};
        new Driver(files);
    }

    public Driver(String[] files) {
        try {
            db.connect();
            System.out.println("Successful connection!");
        } catch(SQLException e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }
        
        // ArrayList<Brand> brands = getAllBrands(files[0]);
        insertBrandsFrom(files[0]);
        ArrayList<ShoeModel> shoes = getAllShoes(files[1]);
        // for(int i = 0; i < brands.size(); i++) {
        //     Brand b = brands.get(i);
        //     if(!b.isInDatabase(db)) {
        //         int brandId = db.insertBrand(b);
        //         if(brandId != -1) 
        //             b.setBrandId(brandId);

        //         System.out.println("Inserted " + b.getName());
        //     }
        // }
        for(int i = 0; i < shoes.size(); i++) {
            ShoeModel s = shoes.get(i);
            if(!s.isInDatabase(db)) {
                db.insertShoeModel(s);
                db.insertMakes(s);
                System.out.println("Inserted " + s.getName());
            }
        }

    }

    private void insertShoeModelsFrom(String file) {
        ArrayList<ShoeModel> shoes = getAllShoes(file);
        for(int i = 0; i < shoes.size(); i++) {
            ShoeModel s = shoes.get(i);
            if(!s.isInDatabase(db)) {
                db.insertShoeModel(s);
                System.out.println("Inserted " + s.getName());
            }
        }
    }

    private void insertBrandsFrom(String file) {
        ArrayList<Brand> brands = getAllBrands(file);
        for(int i = 0; i < brands.size(); i++) {
            Brand b = brands.get(i);
            if(!b.isInDatabase(db)) {
                db.insertBrand(b);
                System.out.println("Inserted " + b.getName());
            }
        }
    }

    private ArrayList<Brand> getAllBrands(String file) {
        ArrayList<Brand> brands = new ArrayList<>();
        try {
            FileReader in = new FileReader(file);
            BufferedReader reader = new BufferedReader(in);

            while(reader.ready()) {
                int yearEstablished = Integer.parseInt(reader.readLine());
                String street = reader.readLine();
                String city = reader.readLine();
                String state = reader.readLine();
                int zip = Integer.parseInt(reader.readLine());
                String country = reader.readLine();
                String name = reader.readLine();
                reader.readLine();

                Brand b = new Brand(yearEstablished, street, city, state, zip, country, name);
                brands.add(b);
            } 
            reader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
        return brands;
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