package it.janczewski;

import java.util.LinkedList;
import java.util.List;

public class ClusterNode implements Node {
    private List<Node> clusterNodes;

    public ClusterNode() {
        clusterNodes = new LinkedList<>();
    }

    @Override
    public Status checkStatus() {
        return Status.BUSY;
    }

    @Override
    public OperationReasult executeOperation(String operation) {
        System.out.println("Cluster is running " + operation);
        clusterNodes.stream().forEach(node -> node.executeOperation("print itself"));
        return OperationReasult.SUCCESS;
    }

    public int size() {
        return clusterNodes.size();
    }

    public boolean isEmpty() {
        return clusterNodes.isEmpty();
    }

    public boolean add(Node node) {
        return clusterNodes.add(node);
    }

    public boolean remove(Object o) {
        return clusterNodes.remove(o);
    }
}
