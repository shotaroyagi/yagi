package com.example.mastar.dao;

import java.util.List;

import com.example.mastar.domain.Item;

public interface ItemDao {
    List<Item> findAll() throws Exception;

    Item findById(Integer id) throws Exception;

    void insert(Item item) throws Exception;

    void update(Item item) throws Exception;

    void delete(Item item) throws Exception;
}
