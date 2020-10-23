package com.jxj.controller;

import com.jxj.entity.emp;
import com.jxj.service.empService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class empController {
    @Resource
    private empService empservice;

    @RequestMapping("findemp")
    public List<emp> findemp(){
        return empservice.findemp();
    }
    @RequestMapping("addemp")
    public void addemp(@RequestBody emp emp){
        empservice.addemp(emp);
    }
    @RequestMapping("deleteById")
    public void deleteById(@RequestParam Integer empId){
        empservice.deleteById(empId);
    }
    @RequestMapping("selectById")
    public emp selectById(@RequestParam Integer empId){
       return empservice.selectById(empId);
    }
}
