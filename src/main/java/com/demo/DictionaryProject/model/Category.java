package com.demo.DictionaryProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class Category {
    private int code;
    private String name;
    private boolean needsDocs;
    private String needsDocsReason;
    private String needsDocsList;
}
