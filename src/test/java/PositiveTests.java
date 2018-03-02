import org.junit.Test;
import sun.jvm.hotspot.utilities.Assert;

public class PositiveTests {

    @Test
    public void isPositive(){
        boolean positive = Positive.isPositive();

        Assert.that(positive,"Is not true");

    }

}
