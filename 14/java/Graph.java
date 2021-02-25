import java.util.ArrayList;

public class Graph {
    public ArrayList<Vertex> vlist;
    int numbVert;
    int numEdges;

    public Graph() {
      Vertex initialV = new Vertex("");
      this.vlist = new ArrayList<Vertex>();
      for(int i = 0; i < vlist.size(); i++){
          vlist.add(i, initialV);
      }
      numbVert = 0;
      numEdges = 0;
        }

        public void addVertex(String name) {
          numbVert++;
          Vertex v = new Vertex(name);
         vlist.add(v);
       }

       public Vertex getVertex(String name) {
         int i = vlist.indexOf(name);

         for(int j = 0; j < vlist.size(); j ++){
             Vertex v = vlist.get(j);

             if(v.name == name){
                 return vlist.get(j);
             }
         }
         return null;
     }
    public void addEdge(String from, String to, int weight) {

    }

    public Edge getEdge(String from, String to) {
	return null;
    }

    public int MSTCost() {
	return -1;
    }

    public Graph MST() {
	return null;
    }

    public int SPCost(String from, String to) {
	return 0;
    }

    public Graph SP(String from, String to) {
	return null;
    }
}
