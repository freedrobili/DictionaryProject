package com.demo.DictionaryProject.controller;

import com.demo.DictionaryProject.dto.Category;
import com.demo.DictionaryProject.dto.CategoryResponse;
import com.demo.DictionaryProject.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
public class Controller {
    public ResponseEntity<CategoryResponse> getCategoriesByProduct(@PathVariable String productName) {
        CategoryService categoryService = new CategoryService();
        List<Category> categories = categoryService.getCategoriesByProduct(productName);
        CategoryResponse response = new CategoryResponse(categories);
        return ResponseEntity.ok(response);
    }
}
