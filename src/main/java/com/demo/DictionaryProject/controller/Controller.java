package com.demo.DictionaryProject.controller;

import com.demo.DictionaryProject.entity.Category;
import com.demo.DictionaryProject.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.tinkoff.eacq.mma.dictionary.rest.controller.api.AdminsCategoriesApi;
import ru.tinkoff.eacq.mma.dictionary.rest.model.ShortCategories;

import java.util.List;

@RestController
public class Controller implements AdminsCategoriesApi {
    private final CategoryService categoryService;

    public Controller(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public ResponseEntity<ShortCategories> adminApiV1CategoriesProductNameGet(String productName) {
        List<Category> categories = categoryService.getCategoriesByProduct(productName);

        if (categories != null && !categories.isEmpty()) {
            ShortCategories shortCategories = categoryService.convertToShortCategories(categories);
            return ResponseEntity.ok(shortCategories);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
