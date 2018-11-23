package woopich.Dish;

public class Cup extends Dish {
    public double radius;
    private double height;

    public Cup(String material, String shape, String color, double radius, double height) {
        super(material,shape,color);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public String displayInfo() //equals toString()
    {
        return "Cup material: " + getMaterial() + '\n' +
                "Shape: " + getShape() + '\n' +
                "Color: " + getColor() + '\n' +
                "Height: " + height + '\n' +
                "Radius: " + radius;
    }
}
