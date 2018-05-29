package ctci.arraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;
import static ctci.arraysAndStrings.stringUniqueChars.isStringAllUnique1;

public class stringUniqueCharsTest {

  @Test
  public void testIsStringAllUnique1() throws Exception {
    assertEquals(false, isStringAllUnique1("aablhjglkjrijkjwlmd"));
    assertEquals(true, isStringAllUnique1("abcdefghijklmnopqrstuvwxyz"));
  }
}