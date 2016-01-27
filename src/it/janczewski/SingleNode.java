package it.janczewski;

public class SingleNode implements Node {
    @Override
    public Status checkStatus() {
        return Status.ACTIVE;
    }

    @Override
    public OperationReasult executeOperation(String operation) {
        System.out.println("Single node executing " + operation);
        return OperationReasult.SUCCESS;
    }
}
