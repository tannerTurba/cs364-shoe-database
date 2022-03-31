package ShoeDatabase.src;

public class ShoeModel {
    private int modelId;
    private double price;
    private String gender;
    private String shoeType;
    private String name;
    private String color;

    

    /**
     * @return int return the modelId
     */
    public int getModelId() {
        return modelId;
    }

    /**
     * @param modelId the modelId to set
     */
    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    /**
     * @return double return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return String return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return String return the shoeType
     */
    public String getShoeType() {
        return shoeType;
    }

    /**
     * @param shoeType the shoeType to set
     */
    public void setShoeType(String shoeType) {
        this.shoeType = shoeType;
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

}
