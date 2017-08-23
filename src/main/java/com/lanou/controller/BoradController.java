package com.lanou.controller;

import com.github.pagehelper.PageInfo;
import com.lanou.bean.Borad;
import com.lanou.service.BoradService;
import com.lanou.utils.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by dllo on 17/8/21.
 */
@Controller
public class BoradController {
    @Resource
    private BoradService boradService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/getAllBorad")
    @ResponseBody
    public List<Borad> getAllBorad(Map<String,Object> map){
        List<Borad> allBorad = null;
        try {
            allBorad = boradService.getAllBorad();
        } catch (MyException e) {
            map.put("msg",e.getMessage());
        }
        return allBorad;
    }

    @RequestMapping("/addBorad")
    @ResponseBody
    public Borad addBorad(Borad borad,
                          Map<String,Object> map){
        try {
            boradService.insertBorad(borad);
            return borad;
        } catch (MyException e) {
            map.put("msg",e.getMessage());
            return null;
        }
    }
    @RequestMapping("/pageTest")
    @ResponseBody
    public PageInfo<Borad> pageTest(@RequestParam("pageNum") Integer pageNum,
                                    @RequestParam("pageSize") Integer pageSize){
        PageInfo<Borad> pageInfo = boradService.queryPage(pageNum, pageSize);
        return pageInfo;
    }

    @RequestMapping("/test")
    @ResponseBody
    public String gitTest(){
        return "aaa";
    }

    // 编辑代码
    @RequestMapping("/branch")
    @ResponseBody
    public String branchTest(){
        return "branch";
    }

    public void test(){
        System.out.println(1111);
    }
    public void test2(){
        System.out.println(333333);
    }
    public void test1(){
        System.out.println(222222);
    }
}
