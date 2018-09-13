package com.example.mastar.dao;

import java.util.List;

import com.example.mastar.domain.Position;

public interface PositionDao {
    List<Position> findAll() throws Exception;

    Position findById(Integer id)
	    throws Exception;

    void insert(Position position)
	    throws Exception;

    void update(Position position)
	    throws Exception;

    void delete(Position position)
	    throws Exception;
}
