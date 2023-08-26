package com.demo.DictionaryProject.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CategoryResponse {
    private List<Category> categories;

    public CategoryResponse(List<Category> categories) {
        this.categories = categories;
    }

}
