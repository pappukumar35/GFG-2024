package Auguest ;
public class Sorted_subsequence_of_size_3{
     public List<Integer> find3Numbers(int[] arr) {
          List<Integer> res= new ArrayList<>();
          int len = arr.length;
          if(len < 3) {
              return res;
          }
          
          boolean breakI = false;
          boolean breakJ = false;
          
          for(int i = 0; i < len - 2; i++) {
              if(breakI) {
                  break;
              }
              for(int j = i+1; j < len - 1; j++) {
                  if(breakJ) {
                      break;
                  }
                  for(int k = j+1; k < len ; k++) {
                      if ((arr[i] < arr[j]) && (arr[j] < arr[k])) {
                          res.add(arr[i]);
                          res.add(arr[j]);
                          res.add(arr[k]);
                          breakI = true;
                          breakJ = true;
                          break;
                      }
                  }
              }   
          }
          return res;
      }
     public static void main(String[] args) {
          
     }
}