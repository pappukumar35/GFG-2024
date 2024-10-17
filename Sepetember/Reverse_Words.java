package Sepetember;

public class Reverse_Words {
     String reverseWords(String str) {
          // code here
          String[] words = str.split("\\.");

          // Reverse the array of words
          int n = words.length - 1;

          StringBuilder result = new StringBuilder();

          for (int i = n; i >= 0; i--) {
               result.append(words[i]).append(".");
          }

          result.deleteCharAt(result.length() - 1); // Remove the trailing '.'

          return result.toString();
     }

     public static void main(String[] args) {

     }
}