package woopich.Dish;

public class Plate extends Dish {
    public double radius;

    public Plate(String material, String shape, String color, double radius) {
        super(material,shape,color);
        this.radius = radius;
    }

    @Override
    public String displayInfo() //equals toString()
    {
        return "Plate material: " + getMaterial() + '\n' +
                "Shape: " + getShape() + '\n' +
                "Color: " + getColor() + '\n' +
                "Radius: " + radius;
    }
}
