/*
1.1 Implement an algorithm to determine if a string has all unique characters. What is you can not use additional data
structures?
* */

package ctci.arraysAndStrings;

public class stringUniqueChars {

  public static boolean isStringAllUnique1(String input) {
    boolean[] chars = new boolean[256]; //if ASCII only 256 chars
    for(int i = 0; i < input.length(); i++){
      int value = input.charAt(i);
      if(chars[value]) return false;
      chars[value] = true;
    }
    return true;
  }

}

//todo sort first using O(n log n) algorithm and then check for neighboring characters
