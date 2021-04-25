// Question 2 code

public class GraphVertex {

        private String label;
        private Object value;
        private DSALinkedList links; //list of links of vertices
        private boolean visited;

        public GraphVertex(String inLabel, Object inValue) {

            links = new DSALinkedList();
            label = inLabel;
            value = inValue;
        }

        public void addEdge(Object vertex)
        {
            links.insertLast(vertex);
        }

        public String getLabel()
        {
            return this.label;
        }

        public Object getValue()
        {
            return this.value;
        }

        public String toString()
        {
            return this.getLabel();
        }

        /*Implemented to return the LinkedList of links*/
        public DSALinkedList getLinks()
        {
          return this.links;
        }
    }
