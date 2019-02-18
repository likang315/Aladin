package com.aladin.service.shopcar.imp;

import com.aladin.dao.product.SpecsMapper;
import com.aladin.pojo.product.Specs;
import com.aladin.service.shopcar.SpcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：lala
 * @date ：Created in 2019/2/17 21:58
 * @description：${description}
 * @email: 18291929158@163.com
 */
@Service
public class SpcesServiceImpl implements SpcesService {
    @Autowired
    SpecsMapper specsMapper;
    @Override
    public Specs getSpces(Long id) {
        return specsMapper.selectByPrimaryKey(id);
    }
}
