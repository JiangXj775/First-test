package com.jxj.service;

import com.jxj.entity.emp;

import java.util.List;

public interface empService {

    List<emp> findemp();

    void addemp(emp emp);

    void deleteById(Integer empId);

    emp selectById(Integer empId);
}
