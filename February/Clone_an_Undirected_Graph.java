import java.util.Map;

import org.w3c.dom.Node;

class Clone_an_Undirected_Graph {
     Node cloneGraph(Node node) {
          if (node == null) {
               return null;
          }
          Map<Node, Node> map = new HashMap<>();
          return help(node, map);
     }

     Node help(Node org, Map<Node, Node> map) {
          if (org == null) {
               return null;
          }

          if (map.containsKey(org)) {
               return map.get(org);
          }
          Node clone = new Node(org.val);
          map.put(org, clone);

          for (Node neighbor : org.neighbors) {
               clone.neighbors.add(help(neighbor, map));
          }
          return clone;
     }
}