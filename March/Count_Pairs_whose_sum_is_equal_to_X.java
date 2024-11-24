class Count_Pairs_whose_sum_is_equal_to_X{
     public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x) {
          HashMap<Integer, Integer> mp = new HashMap<>();
          for(int ele: head1)
              mp.put(ele, 1);
              
          int count = 0;
          for(int ele: head2) 
              if(mp.containsKey(x - ele))
                  count++;
          
          return count;
      }
     public static void main(String[] args) {
          
     }
}