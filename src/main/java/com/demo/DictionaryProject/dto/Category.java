package com.demo.DictionaryProject.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
    private int code;
    private String name;
    private boolean needsDocs;
    private String needsDocsReason;
    private String needsDocsList;

    public Category(int code, String name, boolean needsDocs, String needsDocsReason, String needsDocsList) {
        this.code = code;
        this.name = name;
        this.needsDocs = needsDocs;
        this.needsDocsReason = needsDocsReason;
        this.needsDocsList = needsDocsList;
    }
}
