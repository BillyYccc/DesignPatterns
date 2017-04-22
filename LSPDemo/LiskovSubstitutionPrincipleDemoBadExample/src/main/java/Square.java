/**
 * Created by Billy Yuan on 2017/4/19.
 * Email: billy112487983@gmail.com
 */

public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(int length) {
        super.setLength(length);
        super.setWidth(length);
    }
}
