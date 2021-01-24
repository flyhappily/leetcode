package from_0001_to_0100.no_0005;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author: pf_xu
 * @date: 2021/1/24 22:15
 * @Email:pfxuchn@gmail.com
 */
public class LongestPalindromicSubstringTest {

    private LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();

    @Test
    public void longestPalindrome() {

        Assert.assertEquals("bab",longestPalindromicSubstring.longestPalindrome("babad"));
        Assert.assertEquals("bb",longestPalindromicSubstring.longestPalindrome("cbbd"));

    }
}