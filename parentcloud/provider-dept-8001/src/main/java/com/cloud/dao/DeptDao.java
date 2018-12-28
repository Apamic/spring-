package com.cloud.dao;

import com.cloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findByID(Long id);

    public List<Dept> findAll();

}
