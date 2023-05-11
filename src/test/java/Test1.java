import org.junit.Test;

/**
 * @author: d_fei
 * @since: 2023/5/11 20:53
 */
public class Test1 {

    @Test
    public void test1() {
        String sl = "Hello world";
        for (int i = 0; i < 3; i++) {
            sl += "100";
        }
        System.out.println(sl);
    }

}
