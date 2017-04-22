/**
 * Created by Billy Yuan on 2017/4/22.
 * Email: billy112487983@gmail.com
 */

public class User {
    public String userName;
    public int id;
    public Socket socket;
    public void disconnect() throws Exception {
        socket.close();
    }
    // 其它处理socket的方法
}
