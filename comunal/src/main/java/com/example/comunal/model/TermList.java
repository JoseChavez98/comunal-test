package com.example.comunal.model;

import java.util.ArrayList;
import java.util.List;

public class TermList {
    private List<Integer> terms = new ArrayList<>();
    private int numberOfTerms;

    public TermList(List<Integer>terms,int numberOfTerms) {
        this.terms = terms;
        this.numberOfTerms = numberOfTerms;
    }

    public List<Integer> getTerms() {
        return terms;
    }

    public void setTerms(List<Integer> terms) {
        this.terms = terms;
    }

    public int getNumberOfTerms() {
        return numberOfTerms;
    }

    public void setNumberOfTerms(int numberOfTerms) {
        this.numberOfTerms = numberOfTerms;
    }
}
