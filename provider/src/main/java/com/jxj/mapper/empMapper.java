package com.jxj.mapper;

import com.jxj.entity.emp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface empMapper {

    List<emp> findemp();

    void addemp(emp emp);

    void deleteById(Integer empId);

    emp selectById(Integer empId);

    void updateemp(emp emp);
}
