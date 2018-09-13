package com.example.mastar.dao;

import java.util.List;

import com.example.mastar.domain.BoothEntry;

public interface BoothEntryDao {
    List<BoothEntry> findAll() throws Exception;

    BoothEntry findById(Integer id)
	    throws Exception;

    void insert(BoothEntry boothEntry)
	    throws Exception;

    void update(BoothEntry boothEntry)
	    throws Exception;

    void delete(BoothEntry boothEntry)
	    throws Exception;
}
