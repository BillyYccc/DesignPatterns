import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/4/21.
 * Email: billy112487983@gmail.com
 */
public class ToyBuilderTest {
    @Test
    public void testBuildToyHouse() throws Exception {
        ToyHouse toyHouse = ToyBuilder.buildToyHouse();
        System.out.println(toyHouse);
    }

    @Test
    public void testBuildToyCar() throws Exception {
        ToyCar toyCar = ToyBuilder.buildToyCar();
        System.out.println(toyCar);
    }

    @Test
    public void testBuildToyPlane() throws Exception {
        ToyPlane toyPlane = ToyBuilder.buildToyPlane();
        System.out.println(toyPlane);
    }
}
