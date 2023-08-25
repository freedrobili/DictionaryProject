package com.demo.DictionaryProject.service;

import com.demo.DictionaryProject.dto.Category;

import java.util.List;

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
}
