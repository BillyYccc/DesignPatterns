package badexample;

/**
 * Created by Billy Yuan on 2017/4/16.
 * Email: billy112487983@gmail.com
 */
public interface Iphone {
    //拨号
    public void dial(String phoneNumber);

    //通话过程
    public void chat(Object o);

    //通话完挂机
    public void hangup();
}
