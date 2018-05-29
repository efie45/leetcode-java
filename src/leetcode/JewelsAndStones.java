
/*
  You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

        The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case
 sensitive, so "a" is considered a different type of stone from "A".

        Example 1:

        Input: J = "aA", S = "aAAbbbb"
        Output: 3

        Example 2:

        Input: J = "z", S = "ZZ"
        Output: 0

        Note:

        S and J will consist of letters and have length at most 50.
        The characters in J are distinct
*/

package leetcode;

public class JewelsAndStones{

  /*Simple brute force method using nested for loops*/

  public static int findJewelsInStonesBruteForce(String J, String S){
    char[] jewelChars = J.toCharArray();
    char[] stoneChars = S.toCharArray();
    int count = 0;
    for (char jewel : jewelChars) {
      for (char stone: stoneChars) {
        if (jewel == stone) {
          count ++;
        }
      }
    }
    return count;
  }

  //TODO Implement using Map<>
  public static void findJewelsInStonesWithMap(String J, String S){
    char[] jewelChars = J.toCharArray();
    char[] stoneChars = S.toCharArray();

  }

}

/*
Notes:

  -When creating array types, you can skip the "new type[]" with current Java versions, skipping directly to
    initialization with {}

  -Method type needs to be static if class where method exists does not need to be instantiated before running method

  -Difference between int and Integer: Integer is a wrapper class for the primitive type, which is an object that has
   its own methods. There are wrapper classes with additional methods for each primitive type like Long, Double,
   Float, etc..

  -Maps have different implementations but should usually be initialized using just Map.


*/
