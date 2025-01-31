package com.example.categories;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Arrays;

@Service
public class CategoryService {
    public List<Category> getCategories() {
        return Arrays.asList(new Category(1L, "Category 1"), new Category(2L, "Category 2"));
    }
}
