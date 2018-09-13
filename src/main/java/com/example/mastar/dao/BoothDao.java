package com.example.mastar.dao;

import java.util.List;

import com.example.mastar.domain.Booth;

public interface BoothDao {
    List<Booth> findAll() throws Exception;

    Booth findById(Integer id) throws Exception;

    void insert(Booth booth) throws Exception;

    void update(Booth booth) throws Exception;

    void delete(Booth booth) throws Exception;
}
