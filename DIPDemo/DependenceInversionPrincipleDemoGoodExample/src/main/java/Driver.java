/**
 * Created by Billy Yuan on 2017/4/20.
 * Email: billy112487983@gmail.com
 */
public class Driver implements IDriver {
    //司机开车的方法
    public void drive(ICar car) {
        car.run();
    }
}
