package graph;

import java.util.List;

public abstract  class Person {
    private String name;
    public  int id;
    Person(String name,int id ){
        this.name=name;
        this.id=id ;

    }
    public abstract int getDepartment(GraphWork graph);
    public int getState(GraphWork graph){
        List<List<Integer>>workStation= graph.getGraph();
        int graphSize= graph.getNodes();

            if (workStation.get(this.id).size()==0){
                return 0;
            }
            else if (workStation.get(this.id).get(0)==graph.getInf()){
                return -1;
            }
            else {
                return 1;
            }

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}//end
