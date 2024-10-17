package May;

public class Account_Merge {
     class DisJointSet {
          List<Integer> parent = new ArrayList<>();
          List<Integer> rank = new ArrayList<>();
          List<Integer> size = new ArrayList<>();

          public DisJointSet(int n) {
               for (int i = 0; i <= n; i++) {
                    parent.add(i);
                    rank.add(0);
                    size.add(1);
               }
          }

          public int findUPar(int node) {
               if (node == parent.get(node))
                    return node;
               int ulp = findUPar(parent.get(node));
               parent.set(node, ulp);
               return parent.get(node);
          }

          public void unionByRank(int u, int v) {
               int ulp_u = findUPar(u);
               int ulp_v = findUPar(v);
               if (ulp_u == ulp_v)
                    return;
               if (rank.get(ulp_u) < rank.get(ulp_v)) {
                    parent.set(ulp_u, ulp_v);
               } else if (rank.get(ulp_v) < rank.get(ulp_u)) {
                    parent.set(ulp_v, ulp_u);
               } else {
                    parent.set(ulp_v, ulp_u);
                    int rankU = rank.get(ulp_u);
                    rank.set(ulp_u, rankU + 1);
               }
          }

          public void unionBySize(int u, int v) {
               int ulp_u = findUPar(u);
               int ulp_v = findUPar(v);
               if (ulp_u == ulp_v)
                    return;
               if (size.get(ulp_u) < size.get(ulp_v)) {
                    parent.set(ulp_u, ulp_v);
                    size.set(ulp_v, size.get(ulp_u) + size.get(ulp_v));
               } else {
                    parent.set(ulp_v, ulp_u);
                    size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
               }
          }
     }

     static List<List<String>> accountsMerge(List<List<String>> accounts) {
          // code here
          List<List<String>> ans = new ArrayList<>();
          HashMap<String, Integer> m = new HashMap<>();
          DisJointSet ds = new DisJointSet(accounts.size());
          for (int i = 0; i < accounts.size(); i++) {
               for (int j = 1; j < accounts.get(i).size(); j++) {
                    String str = accounts.get(i).get(j);
                    if (m.containsKey(str) == false) {
                         m.put(str, i);
                    } else {
                         ds.unionBySize(i, m.get(str));
                    }
               }
          }
          List<List<String>> mailDetails = new ArrayList<>();
          for (int i = 0; i < accounts.size(); i++) {
               mailDetails.add(new ArrayList<String>());
          }
          for (Map.Entry<String, Integer> e : m.entrySet()) {
               String str = e.getKey();
               int node = ds.findUPar(e.getValue());
               mailDetails.get(node).add(str);
          }
          for (int i = 0; i < accounts.size(); i++) {
               if (mailDetails.get(i).size() == 0)
                    continue;
               Collections.sort(mailDetails.get(i));
               List<String> temp = new ArrayList<>();
               temp.add(accounts.get(i).get(0));
               for (String str : mailDetails.get(i)) {
                    temp.add(str);
               }
               ans.add(temp);
          }
          return ans;
     }

     public static void main(String args[]) {

     }
}