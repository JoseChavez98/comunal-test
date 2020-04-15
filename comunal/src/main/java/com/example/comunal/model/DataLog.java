package com.example.comunal.model;

import java.util.List;

public class DataLog {
    private String operation;
    private int result;
    private List<Integer> parameters;

    public DataLog(String operation, int result, List<Integer> parameters) {
        this.operation = operation;
        this.result = result;
        this.parameters = parameters;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public List<Integer> getParameters() {
        return parameters;
    }

    public void setParameters(List<Integer> parameters) {
        this.parameters = parameters;
    }
}
