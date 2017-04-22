import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Billy Yuan on 2017/4/22.
 * Email: billy112487983@gmail.com
 */
public class OffNovelBookTest {
    private String name = "神雕侠侣";
    private int price = 5200;
    private String author = "金庸";
    private IBook novelBook = new NovelBook(name, price, author);

    //测试getPrice()方法
    @Test
    public void testGetPrice() {
        assertEquals("神雕侠侣", novelBook.getName());
        assertEquals(5200, novelBook.getPrice());
        assertEquals("金庸", novelBook.getAuthor());
    }
}
