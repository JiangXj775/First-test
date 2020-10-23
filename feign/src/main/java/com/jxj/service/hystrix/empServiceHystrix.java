package com.jxj.service.hystrix;

import com.jxj.entity.emp;
import com.jxj.service.empService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class empServiceHystrix implements empService {
    @Override
    public List<emp> findemp() {
        return null;
    }

    @Override
    public void addemp(emp emp) {

    }

    @Override
    public void deleteById(Integer empId) {

    }

    @Override
    public emp selectById(Integer empId) {
        return null;
    }

    @Override
    public String bb() {
        return "按钮是假的吧";
    }
}
