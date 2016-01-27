package it.janczewski;

public interface Node {
    Status checkStatus();
    OperationReasult executeOperation(String operation);
}
