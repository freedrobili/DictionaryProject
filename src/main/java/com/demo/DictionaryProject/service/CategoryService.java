package com.demo.DictionaryProject.service;

import com.demo.DictionaryProject.entity.Category;
import com.demo.DictionaryProject.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.tinkoff.eacq.mma.dictionary.rest.model.ShortCategories;
import ru.tinkoff.eacq.mma.dictionary.rest.model.ShortCategoriesResponse;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getCategoriesByProduct(String productName) {
        return categoryRepository.findByProduct(productName);
}

    public ShortCategories convertToShortCategories(List<Category> categories) {
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
    }

}
