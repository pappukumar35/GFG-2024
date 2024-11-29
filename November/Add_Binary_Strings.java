package November;

public class Add_Binary_Strings {
     public String addBinary(String s1, String s2) {
          // code here
          char carry = '0';
          StringBuilder sb = new StringBuilder();
          int n = s1.length();
          int m = s2.length();
          int i = n - 1, j = m - 1;
          for (; j >= 0 && i >= 0; i--, j--) {
               if (s1.charAt(i) == s2.charAt(j)) {
                    sb.append(carry);
                    carry = s1.charAt(i);
               } else {
                    sb.append(carry == '0' ? '1' : '0');
               }
          }
          for (; i >= 0; i--) {
               if (s1.charAt(i) == '1') {
                    sb.append(carry == '0' ? '1' : '0');
               } else {
                    sb.append(carry);
                    carry = '0';
               }
          }
          for (; j >= 0; j--) {
               if (s2.charAt(j) == '1') {
                    sb.append(carry == '0' ? '1' : '0');
               } else {
                    sb.append(carry);
                    carry = '0';
               }
          }
          if (carry == '1')
               sb.append(carry);
          while (sb.charAt(sb.length() - 1) == '0')
               sb.deleteCharAt(sb.length() - 1);

          return sb.reverse().toString();

     }

     public static void main(String[] args) {

     }
}