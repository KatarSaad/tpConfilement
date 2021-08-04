package graph;

import java.util.List;

public class Boss extends Person {
    private int score;



    public Boss(String name,int id,int score){
        super(name, id);
        this.score=score;

    }
    public int getDepartment(GraphWork graph){
        List<Integer> bossList =graph.getBosses();
        for (int i=0;i<bossList.size();i++){
            if (bossList.get(i)==this.id){
                return i;
            }
        }

      return -1;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "score=" + score +
                "} " + super.toString();
    }
}
