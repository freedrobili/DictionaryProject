package com.demo.DictionaryProject.service;

import com.demo.DictionaryProject.dto.CategoryResponse;
import com.demo.DictionaryProject.entity.Category;
import ru.tinkoff.eacq.mma.dictionary.rest.model.ShortCategories;

import java.util.List;
import java.util.Locale;

public interface CategoryService {
    ShortCategories getCategoriesByProduct(String productName);
}
