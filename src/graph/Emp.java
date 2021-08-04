package graph;

import java.util.List;

public class Emp extends Person {
    private int salary;
    public Emp(String name,int id,int salary ){
        super(name, id );
        this.salary=salary;

    }




    public int getDepartment (GraphWork graph){
        List<List<Integer>>departments=  graph.getGroups();
        for (int i=0;i<departments.size();i++){
            int groupSize=departments.get(i).size();
            for (int j=0;j<groupSize;j++){
                if (this.id==departments.get(i).get(j)){
                    return i;
                }
            }
        }
       return -1;//check it out
    }

    @Override
    public String toString() {
        return "Emp{" +
                "salary=" + salary +
                "} " + super.toString();
    }
}
