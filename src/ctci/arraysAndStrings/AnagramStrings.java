package ctci.arraysAndStrings;

import java.util.HashMap;
import java.util.Map;

/**
 Write a method to decide if two strings are anagrams or not.
 */

public class AnagramStrings {

  public static void main(String[] args) {
    System.out.println(stringsAreAnagrams("abbcccddddeeeee","abbcccddddeeeee"));
  }

  public static boolean stringsAreAnagrams(String a, String b){
    char[] aArray = a.toCharArray();
    char[] bArray = b.toCharArray();

    if (aArray.length < 1) return false;
    if (aArray.length != bArray.length) return false;

    Map<Character,Integer> map = new HashMap<>();

    for (char c: aArray) {
      if (map.containsKey(c)) {
        map.put(c, map.get(c) + 1);
      } else {
        map.put(c, 1);
      }
    }

    for (char c2: bArray) {
      //if character from second string not in map then can't be anagram
      if (!map.containsKey(c2)) {
        return false;
      }
      //if character from second string IS in the map
      else {
        map.put(c2, map.get(c2) - 1);
        //
        if (map.get(c2) < 0){
          return false;
        }
      }
    }

    return true;
  }

}
