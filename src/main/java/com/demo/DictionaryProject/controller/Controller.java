package com.demo.DictionaryProject.controller;

import com.demo.DictionaryProject.dto.Category;
import com.demo.DictionaryProject.dto.CategoryResponse;
import com.demo.DictionaryProject.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tinkoff.eacq.mma.dictionary.rest.controller.api.AdminsCategoriesApi;
import ru.tinkoff.eacq.mma.dictionary.rest.model.ShortCategories;

import java.util.List;

@RestController
public class Controller implements AdminsCategoriesApi {
    CategoryService categoryService = new CategoryService();

    @Override
    public ResponseEntity<ShortCategories> adminApiV1CategoriesProductNameGet(String productName) {
        ShortCategories shortCategories = categoryService.getShortCategoriesByProduct(productName);
        if (shortCategories != null) {
            return ResponseEntity.ok(shortCategories);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
