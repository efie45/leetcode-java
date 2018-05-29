package ctci.arraysAndStrings;

/**
 1.3 Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer. NOTE: One or two additional variables are fine. An extra copy of the array is not.
 FOLLOW UP
 Write the test cases for this method.

 --NOTES--
 -Possible to use some sort of native set function? Is that ordered?

 --ADDITIONAL STUDY--
 todo: revisit and complete understanding character arrays in java vs. strings

 */



public class RemoveStringDuplicates {

  public static void main(String[] args){

  }

  public static void removeDuplicates(char[] str){
    if (str == null) return;
    int len = str.length;
    if (len < 2) return;

    int tail = 1;

    for(int i = 1; i < len; ++i){
      int j;
      for (j = 0; j < tail; ++j){
        if(str[i] == str[j]) {
          break;
        }
      }
      if (j == tail) {

      }
    }
  }

}
