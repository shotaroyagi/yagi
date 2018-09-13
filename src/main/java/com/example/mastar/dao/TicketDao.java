package com.example.mastar.dao;

import java.util.List;

import com.example.mastar.domain.Staff;

public interface TicketDao {
    List<Staff> findAll() throws Exception;

    Staff findById(Integer id) throws Exception;

    void insert(Staff staff) throws Exception;

    void update(Staff staff) throws Exception;

    void delete(Staff staff) throws Exception;
}
