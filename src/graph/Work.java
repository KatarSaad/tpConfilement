package graph;

import java.util.ArrayList;
import java.util.List;

public class Work {
    private List<Person> workers;
    private GraphWork graph;
    private List<Integer> workerState;

    public Work(GraphWork graph) {
        workers = graph.worker();
        this.graph = graph;
        workerState = new ArrayList<>();



    }

    public void addWorker(Person worker) {
        workers.add(worker);
        workerState.add(worker.getState(graph));


    }

    public boolean deleteWorker(Person worker) {
        for (int i = 0; i < workers.size(); i++) {
            if (worker.id == workers.get(i).id) {
                workers.remove(i);
                graph.deleteNode(worker.id);
                return true;
            }
        }
        return false;
    }

    public void getWorkerState() {
        System.out.println(workers);
        for (int i = 0; i < workers.size(); i++) {
            if (workers.get(i) instanceof Boss) {


                System.out.println("Boss::" + workers.get(i).getName());
                System.out.println("Of Departement ::" + workers.get(i).getDepartment(graph));
            } else {
                System.out.println("worker" + workers.get(i).getName());
                System.out.println("In Department" + workers.get(i).getDepartment(graph));

            }
        }
    }

    public void printStates() {
        System.out.println(workerState);
        System.out.println(workers);
    }
}






