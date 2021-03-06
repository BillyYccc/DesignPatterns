/**
 * Created by Billy Yuan on 2017/4/21.
 * Email: billy112487983@gmail.com
 */
public class ToyHouse implements Toy {
    double price;
    String color;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ToyHouse: Toy house - Price: " + price + " Color: " + color;
    }
}
