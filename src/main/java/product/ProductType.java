package product;

public class ProductType {
    private String brandDescription;
    private String name;
    private String description;
    private String brand;
    private int alcoholPercentage;

    public ProductType(String name, String description, String brand, String brandDescription, int alcoholPercentage) {
        this.brandDescription = brandDescription;
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.alcoholPercentage = alcoholPercentage;
    }


    public ProductType() {}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrandDescription() {
        return brandDescription;
    }

    public void setBrandDescription(String brandDescription) {
        this.brandDescription = brandDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(int alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }
    //        this.pricePerLiter = (double) mililiters / 1000.0 * (double) totalPrice;
}
