package graph;

public class Test {
    public static void main(String[] args) {
        GraphWork g =new GraphWork(5);
        g.addEdge(0,1);
        g.addEdge(2,3);
        g.addEdge(0,4);
       /* g.getGroup();
        g.getBoss();
        g.deleteNode(0);
        g.printGraph();
        g.deleteNode(3);
        g.getGroup();

       g.getBoss();
       g.printGraph();
        //g.getGroup();
        //g.getBoss();
        //g.printGraph();
       */
        Work work=new Work(g);
        g.getBoss();
        System.out.println(g.worker());
        work.getWorkerState();
        work.printStates();

    }
}
