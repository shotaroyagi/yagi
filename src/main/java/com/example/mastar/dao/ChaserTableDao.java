package com.example.mastar.dao;

import java.util.List;

import com.example.mastar.domain.ChaserTable;

public interface ChaserTableDao {
    List<ChaserTable> findAll() throws Exception;

    ChaserTable findById(Integer id)
	    throws Exception;

    void insert(ChaserTable charserTable)
	    throws Exception;

    void update(ChaserTable charserTable)
	    throws Exception;

    void delete(ChaserTable charserTable)
	    throws Exception;
}
