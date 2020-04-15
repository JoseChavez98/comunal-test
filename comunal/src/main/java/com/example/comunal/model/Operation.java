package com.example.comunal.model;

import java.util.ArrayList;
import java.util.List;

public interface Operation {
    TermList parameters = null;
    public int executeOperation(String content);
    public TermList parseContent(String content);
}
