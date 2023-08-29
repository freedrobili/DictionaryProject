package com.demo.DictionaryProject.controller;

import com.demo.DictionaryProject.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.tinkoff.eacq.mma.dictionary.rest.controller.api.AdminsCategoriesApi;
import ru.tinkoff.eacq.mma.dictionary.rest.model.ShortCategories;

@RestController
public class AdminsCategoriesController implements AdminsCategoriesApi {
    private final CategoryService categoryService;

    @Autowired
    public AdminsCategoriesController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public ResponseEntity<ShortCategories> adminApiV1CategoriesProductNameGet(String productName) {
        return ResponseEntity.ok(categoryService.getCategoriesByProduct(productName));
        }
    }
