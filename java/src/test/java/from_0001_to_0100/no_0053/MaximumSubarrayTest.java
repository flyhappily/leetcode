package from_0001_to_0100.no_0053;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * @author: pf_xu
 * @date: 2021/1/24 14:57
 * @Email:pfxuchn@gmail.com
 */
@RunWith(JUnit4.class)
public class MaximumSubarrayTest {

    private final MaximumSubarray maximumSubarray = new MaximumSubarray();

    private final int [] nums = {-2,1,-3,4,-1,2,1,-5,4};

    @Test
    public void maxSubArray() {
        Assert.assertEquals(maximumSubarray.maxSubArray(nums),6);
    }
}