class Remove_all_duplicates_from_a_given_string {
     String removeDuplicates(String str) {
          char[] arr = str.toCharArray();
          StringBuilder sb = new StringBuilder();
          for (char ch : arr) {
               if (sb.indexOf(Character.toString(ch)) == -1) {
                    sb.append(ch);
               }
          }
          return sb.toString();
     }

     public static void main(String[] args) {

     }
}