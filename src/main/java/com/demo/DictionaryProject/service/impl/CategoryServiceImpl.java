package com.demo.DictionaryProject.service.impl;

import com.demo.DictionaryProject.model.Category;
import com.demo.DictionaryProject.repository.CategoryRepository;
import com.demo.DictionaryProject.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.tinkoff.eacq.mma.dictionary.rest.model.ShortCategories;
import ru.tinkoff.eacq.mma.dictionary.rest.model.ShortCategoriesResponse;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public ShortCategories getCategoriesByProduct(String productName) {
        List<Category> categories = categoryRepository.findByProduct(productName);
        if (Objects.isNull(categories) || categories.isEmpty()){
            return null;
        }
        ShortCategories shortCategories = new ShortCategories();
        List<ShortCategoriesResponse> shortCategoriesResponses = categories.stream()
                .map(this::buildToShortCategories)
                .collect(Collectors.toList());

        shortCategories.setCategories(shortCategoriesResponses);
        return shortCategories;
    }

    private ShortCategoriesResponse buildToShortCategories(Category category){
        ShortCategoriesResponse response =new ShortCategoriesResponse();
        response.setCode(String.valueOf(category.getCode()));
        response.setName(category.getName());
        response.setNeedsDocs(category.isNeedsDocs());
        response.setNeedsDocsReason(category.getNeedsDocsReason());
        response.setNeedsDocsList(category.getNeedsDocsList());
        return response;
    }
}
