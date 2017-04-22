/**
 * Created by Billy Yuan on 2017/4/20.
 * Email: billy112487983@gmail.com
 */
public class Work {
    public static void main(String[] args) {
        IDriver xiaoMing = new Driver();
        ICar volkswagen = new Volkswagen();
        ICar bmw = new BMW();
        //小明开他自己的大众车上班
        xiaoMing.drive(volkswagen);
        //小明开他父亲的宝马车上班
        xiaoMing.drive(bmw);
    }
}
