import java.sql.*;

public class ShoeModel {
    private String modelId;
    private String styleID;
    private long price;
    private String silhouette;
    private String name;
    private String color;
    private String thumbnail; 
    private String brand;
    private String releaseDate;

    public ShoeModel(String modelId, String styleID, long price, String silhouette, String name, String color, String thumbnail, String brand, String releaseDate) {
        this.modelId = modelId;
        this.styleID = styleID;
        this.price = price;
        this.silhouette = silhouette;
        this.name = name;
        this.color = color;
        this.thumbnail = thumbnail;
        this.brand = brand;
        this.releaseDate = releaseDate;
    }

    public ShoeModel(String modelId, String styleID, long price, String silhouette, String name, String color, String thumbnail) {
        this.modelId = modelId;
        this.styleID = styleID;
        this.price = price;
        this.silhouette = silhouette;
        this.name = name;
        this.color = color;
        this.thumbnail = thumbnail;
    }

    public ShoeModel(String modelId, String styleID, long price, String silhouette, String name, String color) {
        this.modelId = modelId;
        this.styleID = styleID;
        this.price = price;
        this.silhouette = silhouette;
        this.name = name;
        this.color = color;
    }

    public String toString() {
        return "modelId: " + modelId + "\nstyleId: " + styleID + "\nprice: " + price + "\nsilhouette: " + silhouette + "\nname: " + name + "\ncolor: " + color + "\nthumbnail: " + thumbnail + "\nbrand: " + brand + "\nrelease date: " + releaseDate;
    }

    public Boolean isInDatabase(Database db) {
        try {
            String query = "SELECT count(*) AS count FROM Model WHERE Model.ModelId = \'" + modelId + "\'";
            ResultSet results = db.executeSQL(query);
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
     * @return int return the modelId
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * @param modelId the modelId to set
     */
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * @return String return the styleID
     */
    public String getStyleID() {
        return styleID;
    }

    /**
     * @param styleID the styleID to set
     */
    public void setStyleID(String styleID) {
        this.styleID = styleID;
    }

    /**
     * @return double return the price
     */
    public long getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(long price) {
        this.price = price;
    }

    /**
     * @return String return the Silhouette
     */
    public String getSilhouette() {
        return silhouette;
    }

    /**
     * @param Silhouette the Silhouette to set
     */
    public void setSilhouette(String silhouette) {
        this.silhouette = silhouette;
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
     * @return String return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return String return the thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * @param thumbnail the thumbnail to set
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }


    /**
     * @return String return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return String return the releaseDate
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * @param releaseDate the releaseDate to set
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

}
