package com.example.mscatalogo.service;

import com.example.mscatalogo.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    public List<Category> list();
    public Category save(Category category);
    public Category update(Category category);
    public Optional<Category> listarPorId(Integer id);
    public void eliminarPorId(Integer id);
}
