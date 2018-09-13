package com.example.mastar.dao;

import java.util.List;

import com.example.mastar.domain.MemberAdmin;

public interface MemberAdminDao {
    List<MemberAdmin> findAll() throws Exception;

    MemberAdmin findById(Integer id)
	    throws Exception;

    void insert(MemberAdmin memberadmin)
	    throws Exception;

    void update(MemberAdmin memberadmin)
	    throws Exception;

    void delete(MemberAdmin memberadmin)
	    throws Exception;
}
