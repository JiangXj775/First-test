package com.jxj.controller;

import com.jxj.entity.emp;
import com.jxj.service.empService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class empController {

    @Resource
    private empService empservice;

    @RequestMapping("findemp")
    public String findemp(Model model){
        model.addAttribute("empList",empservice.findemp());
        return "index";
    }
    @RequestMapping("/toAdd")
    public String toAdd(Model model) {
        model.addAttribute("hxempList", new emp());
        return "add";
    }
    @RequestMapping("addemp")
    public String addemp(emp emp){
        empservice.addemp(emp);
        return "redirect:findemp";
    }
    @RequestMapping("deleteById")
    public String deleteById(Integer empId){
        empservice.deleteById(empId);
        return "redirect:findemp";
    }
    @RequestMapping("huiSelect")
    private String huiSelect(Integer empId,Model model){
        model.addAttribute("hxempList",empservice.selectById(empId));
        return "add";
    }
    @RequestMapping("bb")
    @ResponseBody
    public String bb(){
        return  empservice.bb();
    }
}
