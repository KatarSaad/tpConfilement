package graph;


import java.util.*;
//import java.util.List;

/**
 *
 * @author epi.edu
 */
public class GraphWork {

    private int inf=(int)Float.POSITIVE_INFINITY;
    private List<List<Integer>> graph;
    private boolean visited[];
    private List<List<Integer>> groups;
    private List<Integer> bosses ;
    private int nodes;
    public int getInf(){
        return this.inf;
    }
    public int getNodes(){
        return this.nodes;
    }
    public List<List<Integer>> getGraph(){
        return this.graph;
    }
    public List<Integer> getBosses(){
        return bosses;
    }
    public List<List<Integer>>getGroups(){
        return groups;

    }





    public GraphWork(int nodes){
        graph=new ArrayList<>();
        visited=new boolean[nodes];
        for(int i=0;i<nodes;i++ ) {
            graph.add(i,new ArrayList<>());
        }
        groups = new ArrayList<>();
        bosses=new ArrayList<>();
        this.nodes=nodes;


    }


    public void addEdge(int start,int end){
        graph.get(start).add(end);
        graph.get(end).add(start);

    }
    public void dfs(int start,List<Integer>group){
        Stack <Integer> stack= new Stack<>();
        // open stack
        stack.push(start);
        //boolean group[] =new boolean[graph.size()];
        group.add(start);
        visited[start]=true;

        while(!stack.isEmpty()){

            Integer node = stack.pop();
            //System.out.println("Node:"+node+" ");
            List<Integer> childs= graph.get(node);
            for ( Integer child:childs ){
                if (child==inf){
                    continue;
                }
                if (!visited[child]) {

                    stack.push(child);
                    group.add(child);
                    visited[child] = true;
                }


            }



        }



    }
    //public getEdges()
    public void getGroup(){
        //groups = new ArrayList<>();
        for (int i=0;i<graph.size();i++){

            if (!visited[i]){
                List<Integer>group= new ArrayList<>();

                dfs(i,group);
                if (group.get(0)==inf){
                    continue;
                }
                groups.add(group);



            }

        }

    }
    public void getBoss(){
        //List<Integer>bosses=new ArrayList<>();
        getGroup();
        int size=groups.size();
        int countBoss;
        int countEdgeBoss;
        //System.out.println(size);
        //System.out.println(groups);
        for (int i=0;i<size;i++){
            List<Integer>group=groups.get(i);
            //System.out.println(group);
             countBoss= group.get(0);
             if(countBoss==inf ){
                 continue;
             }
            //System.out.println(graph.get(countBoss)+"!");
             countEdgeBoss=graph.get(countBoss).size();
            //System.out.println(countEdgeBoss+":");
            //System.out.println(countBoss);
            //System.out.println(countBoss+','+countEdgeBoss);
            int sizeG=group.size();
            //System.out.println(sizeG);
            for (int j=1;j<sizeG;j++){
                int index=group.get(j);
                if (index==inf){
                    continue;
                }
                //System.out.println(index+"*");
                if(graph.get(index).size()>countEdgeBoss)
                {
                    countBoss=index;//boss id
                    countEdgeBoss=graph.get(index).size();
                   // System.out.println(graph.get(index)+"XXX");
                }


            }
            bosses.add(countBoss);
            //System.out.println(countBoss+"++");
            //System.out.println(countEdgeBoss+"//");//keep up

        }
        System.out.println(bosses);
        System.out.println(groups);
       // System.out.println(graph);



    }
    public void deleteNode(int x){

            List<Integer> node=graph.get(x);
        //System.out.println(node);
            for (int j=0;j<node.size();j++){
                int edge=node.get(j);
                graph.get(edge).removeAll(Arrays.asList(x));
            }
            List<Integer> empty=new ArrayList<>();
            empty.add((int)inf);
            graph.add(x,empty);
            graph.remove(x+1);
            initVisited();
            groups=new ArrayList<>();
            bosses=new ArrayList<>();

       // System.out.println(graph);
       }
       public void printGraph(){
           System.out.println(graph);

       }
       public void initVisited(){
        for(int i=0;i<nodes;i++){
            visited[i]=false;
        }
       }
       public List<Person> worker() {
           List<Person>workers=new ArrayList<>();
           for (int i = 0; i < graph.size(); i++) {

               Scanner scanner = new Scanner(System.in);
               System.out.println("Worker with id ::" + i);
               String name = scanner.next();

               int salary = Integer.parseInt(scanner.next());
               if (bosses.contains(i)){
                   workers.add(i,new Boss(name,i,salary));
               }
               else
               {
                   workers.add(i,new Emp(name,i,salary));
               }
               //System.out.println(workers.get(i).toString());

           }
           return workers;


       }





}//
