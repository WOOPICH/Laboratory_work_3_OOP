package woopich;

import woopich.Dish.Bowl;
import woopich.Dish.Cup;
import woopich.Dish.Dish;
import woopich.Dish.Plate;

public class Test {

    public static void main(String[] args) {
        Dish[] dishes = new Dish[3];
        dishes[0] = new Bowl("Steel","Square","White",7.14);
        dishes[1] = new Plate("Wood","Circle","Brown",10.2);
        dishes[2] = new Cup("Glass","Rectangle","Black",3.14,15.9);
        for (Dish dish: dishes) {
            System.out.println(dish.displayInfo());
        }
    }
}
