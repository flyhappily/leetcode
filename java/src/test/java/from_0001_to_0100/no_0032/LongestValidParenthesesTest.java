package from_0001_to_0100.no_0032;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pf_xu
 * @date: 2021/1/24 22:47
 * @Email:pfxuchn@gmail.com
 */
public class LongestValidParenthesesTest {

    private LongestValidParentheses longestValidParentheses = new LongestValidParentheses();

    @Test
    public void longestValidParentheses() {

        Assert.assertEquals(2,longestValidParentheses.longestValidParentheses("(()"));
        Assert.assertEquals(4,longestValidParentheses.longestValidParentheses(")()())"));
        Assert.assertEquals(0,longestValidParentheses.longestValidParentheses(")("));
        Assert.assertEquals(0,longestValidParentheses.longestValidParentheses("()(())"));

    }

    @Test
    public void longestValidParenthesesWithStack() {

        Assert.assertEquals(2,longestValidParentheses.longestValidParenthesesWithStack("(()"));
        Assert.assertEquals(4,longestValidParentheses.longestValidParenthesesWithStack(")()())"));
        Assert.assertEquals(0,longestValidParentheses.longestValidParenthesesWithStack(")("));
        Assert.assertEquals(6,longestValidParentheses.longestValidParenthesesWithStack("()(())"));

    }
}