package com.lanou.mapper;

import com.lanou.bean.Borad;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dllo on 17/8/21.
 */
@Repository
public interface BoradMapper {
    List<Borad> findAllBorad();
    int insertBorad(Borad borad);
}
