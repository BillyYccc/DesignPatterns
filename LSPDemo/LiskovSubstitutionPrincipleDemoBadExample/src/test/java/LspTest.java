import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Billy Yuan on 2017/4/19.
 * Email: billy112487983@gmail.com
 */

public class LspTest {
    //第一个案例 长方形返回的面积是50,正确
    @Test
    public void test1() {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(5);
        rectangle1.setLength(10);
        int area1 = rectangle1.getArea();
        assertEquals(50, area1);
    }

    //第二个案例 正方形返回的面积是100,不正确
    @Test
    public void test2() {
        Rectangle rectangle2 = new Square();
        rectangle2.setWidth(5);
        rectangle2.setLength(10);
        int area2 = rectangle2.getArea();
        assertEquals(50, area2);
    }
}
