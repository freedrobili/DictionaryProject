package com.demo.DictionaryProject.dto;

import com.demo.DictionaryProject.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@AllArgsConstructor
public class CategoryResponse {
    private List<Category> categories;
}
