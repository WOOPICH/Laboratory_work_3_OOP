package woopich.Dish;

public class Bowl extends Dish {
    private double height;

    public Bowl(String material, String shape, String color, double height) {
        super(material,shape,color);
        this.height = height;
    }

    @Override
    public String displayInfo() //equals toString()
    {
        return "Bowl material: " + getMaterial() + '\n' +
                "Shape: " + getShape() + '\n' +
                "Color: " + getColor() + '\n' +
                "Height: " + height;
    }
}
