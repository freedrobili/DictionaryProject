package com.demo.DictionaryProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@Table(name="product_category_tab", schema = "dictionary")
public class Category {
    @Id
    private int code;
    @Column(name = "name")
    private String name;
    @Column(name = "needsDocs")
    private boolean needsDocs;
    @Column(name = "needsDocsReason")
    private String needsDocsReason;
    @Column(name = "needsDocsList")
    private String needsDocsList;
}
