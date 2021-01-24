package from_0001_to_0100.no_0070;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pf_xu
 * @date: 2021/1/24 15:28
 * @Email:pfxuchn@gmail.com
 */
public class ClimbingStairsTest {

    private final ClimbingStairs climbingStairs = new ClimbingStairs();

    @Test
    public void climbStairs() {
        Assert.assertEquals(3,climbingStairs.climbStairs(3));
        Assert.assertEquals(2,climbingStairs.climbStairs(2));
    }

    @Test
    public void climbStairsV2() {
        Assert.assertEquals(3,climbingStairs.climbStairsV2(3));
        Assert.assertEquals(2,climbingStairs.climbStairsV2(2));
    }
}