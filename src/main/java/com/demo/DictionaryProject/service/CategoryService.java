package com.demo.DictionaryProject.service;

import ru.tinkoff.eacq.mma.dictionary.rest.model.ShortCategories;

public interface CategoryService {
    ShortCategories getCategoriesByProduct(String productName);
}
