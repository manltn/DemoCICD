import com.demo.demoncicd.Caculator;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestCaculator {

    @Test
    public void testSum() {
        Caculator caculator = new Caculator();
        Assert.assertEquals(caculator.sum(2, 3), Integer.valueOf(5));
    }

    @Test
    public void testSub() {
        Caculator caculator = new Caculator();
        Assert.assertEquals(caculator.sub(2, 2), Integer.valueOf(0));
    }
}
