package com.lanou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanou.bean.Borad;
import com.lanou.mapper.BoradMapper;
import com.lanou.service.BoradService;
import com.lanou.utils.MyException;
import org.springframework.stereotype.Service;
import sun.security.krb5.internal.PAData;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/8/21.
 */
@Service
public class BoradServiceImpl implements BoradService {
    @Resource
    private BoradMapper boradMapper;
    public List<Borad> getAllBorad() throws MyException {
        List<Borad> allBorad = boradMapper.findAllBorad();
        if (allBorad == null){
            throw new MyException("查询失败");
        }
        return allBorad;
    }

    public void insertBorad(Borad borad) throws MyException {
        int i = boradMapper.insertBorad(borad);
        if (i == 0){
            throw new MyException("添加失败");
        }
    }

    public PageInfo<Borad> queryPage(Integer pageNum, Integer pageSize) {

        pageNum = pageNum == null ? 1 : pageNum;
        pageSize = pageSize == null ? 5 : pageSize;
        PageHelper.startPage(pageNum,pageSize);
        List<Borad> allBorad = boradMapper.findAllBorad();

        // 使用pageInfo对查询结果进行包装
        PageInfo<Borad> pageInfo = new PageInfo<Borad>(allBorad);

        return pageInfo;
    }


}
