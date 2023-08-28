package com.demo.DictionaryProject.service;

import com.demo.DictionaryProject.dto.Category;
import org.springframework.stereotype.Service;
import ru.tinkoff.eacq.mma.dictionary.rest.model.ShortCategories;
import ru.tinkoff.eacq.mma.dictionary.rest.model.ShortCategoriesResponse;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {
    private List<Category> categories = List.of(
            new Category(5815, "Сервис для покупки медиа-контента (книги, фильмы, музыка)", true, null,
                    "Вам необходимо предоставить документы, подтверждающие, что контент лицензионный, и нет нарушения авторских прав."),
            new Category(5661, "Обувные магазины", true, "На сайте присутствуют товары известных брендов.",
                    "Вам необходимо предоставить документы, подтверждающие подлинность товаров (договор с официальным дистрибьютором или товарные накладные).")
    );

    public List<Category> getCategoriesByProduct(String productName) {
        return categories;
    }

    public ShortCategories getShortCategoriesByProduct(String productName) {
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

        ShortCategories shortCategories = new ShortCategories();
        shortCategories.setCategories(shortCategoriesResponses);

        return shortCategories;
    }
}
