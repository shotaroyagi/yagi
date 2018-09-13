package com.example.mastar.dao;

import java.util.List;

import com.example.mastar.domain.Order;

public interface OrderDao {
    List<Order> findAll() throws Exception;

    Order findById(Integer id) throws Exception;

    void insert(Order order) throws Exception;

    void update(Order order) throws Exception;

    void delete(Order order) throws Exception;
}
