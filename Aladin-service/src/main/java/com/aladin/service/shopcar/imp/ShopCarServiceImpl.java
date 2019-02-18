package com.aladin.service.shopcar.imp;

import com.aladin.dao.product.SpecsMapper;
import com.aladin.dao.shopcar.ShopcarDao;
import com.aladin.dao.shopcar.ShopdetaDao;
import com.aladin.pojo.product.Specs;
import com.aladin.pojo.shopcar.Shopdeta;
import com.aladin.service.shopcar.ShopCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author ：lala
 * @date ：Created in 2019/2/17 21:07
 * @description：${description}
 * @email: 18291929158@163.com
 */
@Service
public class ShopCarServiceImpl implements ShopCarService {
    @Autowired
    ShopdetaDao shopdetaDao;
    @Autowired
    ShopcarDao shopcarDao;

    @Override
    public void addProduct(Long productId, Integer number, Long userId) {
        Long shopId=shopcarDao.selectShopIdByUserId(userId);
        if(shopdetaDao.selectProduct(shopId)==null){
            Shopdeta shopDeta=new Shopdeta();

            shopDeta.setPuduId(productId);
            shopDeta.setcTime(new Date());
            shopDeta.setNumber(number);
            shopDeta.setShopId(shopId);

            shopdetaDao.insertSelective(shopDeta);
        }else {
            Shopdeta shopDeta=shopdetaDao.selectByPutuId(productId);
            shopDeta.setNumber(shopDeta.getNumber()+number);
            shopdetaDao.updateByPrimaryKey(shopDeta);
        }

    }
}
