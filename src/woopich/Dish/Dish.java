package woopich.Dish;

public abstract class Dish {
    private String material;
    private String shape;
    private String color;

    public Dish(String material, String shape, String color) {
        this.material = material;
        this.shape = shape;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public String getShape() {
        return shape;
    }

    public String getColor() {
        return color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String displayInfo(); //equals toString()

}
