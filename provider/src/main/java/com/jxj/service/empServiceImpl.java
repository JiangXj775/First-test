package com.jxj.service;

import com.jxj.entity.emp;
import com.jxj.mapper.empMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class empServiceImpl implements empService{

    @Resource
    private empMapper empmapper;

    @Override
    public List<emp> findemp() {
        return empmapper.findemp();
    }

    @Override
    public void addemp(emp emp) {
        if (emp.getEmpId()!=null){
            empmapper.updateemp(emp);
        }else {
            empmapper.addemp(emp);
        }
    }

    @Override
    public void deleteById(Integer empId) {
        empmapper.deleteById(empId);
    }

    @Override
    public emp selectById(Integer empId) {
        return empmapper.selectById(empId);
    }
}
