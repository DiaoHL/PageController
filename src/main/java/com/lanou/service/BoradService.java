package com.lanou.service;

import com.github.pagehelper.PageInfo;
import com.lanou.bean.Borad;
import com.lanou.utils.MyException;

import java.util.List;

/**
 * Created by dllo on 17/8/21.
 */
public interface BoradService {
    List<Borad> getAllBorad() throws MyException;
    void insertBorad(Borad borad) throws MyException;
    PageInfo<Borad> queryPage(Integer pageNum,Integer pageSize);

}
