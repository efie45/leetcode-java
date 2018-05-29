package ctci.arraysAndStrings;

import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;
import static ctci.arraysAndStrings.AnagramStrings.*;

public class AnagramStringsTest {

  @Test
  public void testStringsAreAnagrams() throws Exception {
    assertEquals(stringsAreAnagrams("abbcccddddeeeee", "abbcccddddeeeee"), true);
    assertEquals(stringsAreAnagrams("Mary had a little lamb", "Mary had a little lamb"), true);
  }

  @Test
  public void testStringsAreAnagramsFalseCondition() throws Exception {
    assertEquals(stringsAreAnagrams("", "asdf"), false);
    assertEquals(stringsAreAnagrams("abccdddeeeef", "abccdddeeeeff"), false);
  }
}