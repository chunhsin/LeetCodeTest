package reverseinteger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author jamesliao
 * @since 2017/1/23
 */
public class ReverseIntegerTest {

    private ReverseInteger reverseInteger;

    @Before
    public void init(){
        reverseInteger = new ReverseInteger();
    }

    @Test
    public void testReverse_0(){
        int reverse = reverseInteger.reverse(0);
        Assert.assertEquals(0,reverse);
    }

    @Test
    public void testReverse_1(){
        int reverse = reverseInteger.reverse(1);
        Assert.assertEquals(1,reverse);
    }

    @Test
    public void testReverse_10(){
        int reverse = reverseInteger.reverse(10);
        Assert.assertEquals(1,reverse);
    }

    @Test
    public void testReverse_1000(){
        int reverse = reverseInteger.reverse(1000);
        Assert.assertEquals(1,reverse);
    }

    @Test
    public void testReverse_15(){
        int reverse = reverseInteger.reverse(15);
        Assert.assertEquals(51,reverse);
    }

    @Test
    public void testReverse_1000000003(){
        int reverse = reverseInteger.reverse(1000000003);
        Assert.assertEquals(0,reverse);
    }

    @Test
    public void testReverse_negative_1(){
        int reverse = reverseInteger.reverse(-1);
        Assert.assertEquals(-1,reverse);
    }

    @Test
    public void testReverse_negative_0(){
        int reverse = reverseInteger.reverse(-0);
        Assert.assertEquals(0,reverse);
    }


    @Test
    public void testReverse_negative_15(){
        int reverse = reverseInteger.reverse(-15);
        Assert.assertEquals(-51,reverse);
    }

    @Test
    public void testReverse_integer_max(){
        int reverse = reverseInteger.reverse(Integer.MAX_VALUE);
        Assert.assertEquals(0,reverse);
    }

    @Test
    public void testReverse_integer_min(){
        int reverse = reverseInteger.reverse(Integer.MIN_VALUE);
        Assert.assertEquals(0,reverse);
    }

    @Test
    public void bruteForceTest(){
        for (int i=0;i<50000;i++){
            int value = (int) (Math.random()*Integer.MAX_VALUE);
            reverseInteger.reverse(value);
        }
    }

}