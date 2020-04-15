package com.example.comunal.model;

import java.util.ArrayList;
import java.util.List;

public class Sum implements Operation {


    private TermList termList = null;

    @Override
    public int executeOperation(String content) {
        termList = parseContent(content);

        int result = 0;
        for (int number:termList.getTerms()
             ) {
         result+=number;
        }
        return result;
    }

    @Override
    public TermList parseContent(String content) {
        StringBuilder temporalString = new StringBuilder();
        List<Integer> listOfTerms = new ArrayList<>();

        for (int index = 5; index < content.length() ; index++) {
            if(content.charAt(index)=='/'){
                listOfTerms.add(Integer.parseInt(temporalString.toString()));
                temporalString = new StringBuilder()    ;
            }
            else{
                temporalString.append(content.charAt(index));
            }
        }
        listOfTerms.add(Integer.parseInt(temporalString.toString()));

        return new TermList(listOfTerms,listOfTerms.size());

    }

    public TermList getTermList() {
        return termList;
    }

    public void setTermList(TermList termList) {
        this.termList = termList;
    }
}
