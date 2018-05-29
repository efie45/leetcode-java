package leetcode;

/**
 * reverse a string in Java
 */
public class reverseString {

  public static String reverseString1(String s){
    String s2 = "";
    for (int i = s.length() - 1; i >= 0; i--){
      s2 = s2 + s.charAt(i);
    }
    return s2;
  }
}

//todo learn how to use StringBuilder when possible/acceptable
