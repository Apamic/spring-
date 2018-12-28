package com.cloud.service;



import com.cloud.entities.Dept;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept findByID(Long id);

    public List<Dept> findAll();

}
