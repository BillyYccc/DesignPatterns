/**
 * Created by Billy Yuan on 2017/4/22.
 * Email: billy112487983@gmail.com
 */
public class ToyHouse implements Toy {
    double price;
    String color;

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void move() {
    }

    @Override
    public void fly() {
    }
}
