package OOP.MasterChallenges;

public class Item {
    private String name;
    private String type;
    private double price;
    private String size = "MEDIUM";


    public Item(String name, String type, double price) {
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
    }


    public String getName() {
        if (type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }
        return name;
    }

    public double getBasePrice() {
        return this.price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getAdjustedPrice() {
        return switch (this.size) {
            case "SMALL" -> this.getBasePrice() - 0.50;
            case "LARGE" -> this.getBasePrice() + 1;
            default -> this.getBasePrice();
        };
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n", name, price);
    }

    public void printItem(){
        printItem(getName(), getAdjustedPrice());
    }
}
