package com.demo.DictionaryProject.service.impl;

import com.demo.DictionaryProject.entity.Category;
import com.demo.DictionaryProject.repository.CategoryRepository;
import com.demo.DictionaryProject.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.tinkoff.eacq.mma.dictionary.rest.model.ShortCategories;
import ru.tinkoff.eacq.mma.dictionary.rest.model.ShortCategoriesResponse;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getCategoriesByProduct(String productName) {
        return categoryRepository.findByProduct(productName);
}

    @Override
    public ShortCategories convertToShortCategories(List<Category> categories) {
        if (categories != null && !categories.isEmpty()) {
            ShortCategories shortCategories = new ShortCategories();
            List<ShortCategoriesResponse> shortCategoriesResponses = categories.stream()
                    .map(category -> {
                        ShortCategoriesResponse response = new ShortCategoriesResponse();
                        response.setCode(String.valueOf(category.getCode()));
                        response.setName(category.getName());
                        response.setNeedsDocs(category.isNeedsDocs());
                        response.setNeedsDocsReason(category.getNeedsDocsReason());
                        response.setNeedsDocsList(category.getNeedsDocsList());
                        return response;
                    })
                    .collect(Collectors.toList());

            shortCategories.setCategories(shortCategoriesResponses);
            return shortCategories;
        } else {
            return null;
        }
    }
}
