package OOP.Composition.ComputerFactory;

public class Product {
    private String model;
    private String manufucturer;
    private int width;
    private int height;
    private int depth;


    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufucturer = manufacturer;
    }
}
