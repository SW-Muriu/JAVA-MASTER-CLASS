package OOP1Inheritance.Wall;

public class Wall {


    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

    private double height;
    private double width;


    public Wall() {
    }

    public Wall(double width, double height) {
        this.height = height < 0 ? 0 : height;
        this.width = width < 0 ? 0 : width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = (height < 0 )? 0.0 : height;
    }

    public void setWidth(double width) {
        this.width = (width < 0) ? 0.0 : width;
    }

    public double getArea() {
        return width * height;
    }
}
