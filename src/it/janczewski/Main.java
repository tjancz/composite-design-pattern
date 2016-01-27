package it.janczewski;

public class Main {

    public static void main(String[] args) {
        SingleNode singleNode1 = new SingleNode();
        SingleNode singleNode2 = new SingleNode();
        SingleNode singleNode3 = new SingleNode();

        ClusterNode clusterNode = new ClusterNode();

        singleNode1.executeOperation("singleNode1 print");
        singleNode2.executeOperation("singleNode2 print");
        singleNode3.executeOperation("singleNode3 print");

        clusterNode.add(singleNode1);
        clusterNode.add(singleNode2);
        clusterNode.add(singleNode3);

        clusterNode.executeOperation("clusterNode print");

    }
}
