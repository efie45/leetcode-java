package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static leetcode.reverseString.*;

public class reverseStringTest {

  @Test
  public void testReverseString1() throws Exception {
    assertEquals("abcdefg", reverseString1("gfedcba"));
  }
}