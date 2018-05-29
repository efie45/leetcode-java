package leetcode;
import org.junit.*;
import static junit.framework.TestCase.assertEquals;
import static leetcode.JewelsAndStones.*;


public class JewelsAndStonesTest {

  @Test
  public void testFindJewelsInStones() throws Exception {
    String J = "aA";
    String S = "aaAbbbb";
    assertEquals(3, findJewelsInStonesBruteForce(J,S));
  }
  @Test
  public void testFindJewelsInStonesBadInput() throws Exception {

  }
}