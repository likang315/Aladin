package com.aladin.service.order.imp;

import com.aladin.dao.order.m_orderMapper;
import com.aladin.dao.product.ProductMapper;
import com.aladin.pojo.order.m_order;
import com.aladin.pojo.product.Product;
import com.aladin.pojo.product.Specs;
import com.aladin.pojo.shopcar.Shopcar;
import com.aladin.pojo.shopcar.Shopdeta;
import com.aladin.service.order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;

/**
 * @Author: likang
 * @mail: 13571887352@163.com
 * @GitHub：https://github.com/likang315
 * @CreateTime： 2019/2/17 23:13
 */
@Service
public class orderImp implements Order {

    @Autowired
    UserDao userdao;

    @Autowired
    Shopdeta shopdeta;

    @Autowired
    ProductMapper product;
    @Autowired
    m_orderMapper m_order;


    @Override
    public void createOrder(Shopcar sh)
    {
        int i = 0;
        int allPrice=0;
        m_order order=new m_order();
        Long userid=sh.getUserId();
        User user=userdao.SelectUserId();
        Date date=new Date();
        Random random=new Random();

        order.setoId( date.toString()+random.nextInt(5));
        order.setoTime(date);
        order.setuId(user.getUsId().toString());

        //获取订单总价（bigdecimal）
        long shopcarid = sh.getShopId();
        ArrayList<Shopdeta> list=shopdeta.selectAll();
        Iterator<Shopdeta> ite=list.iterator();
        while(ite.hasNext())
        {
            Shopdeta shop=ite.next();
            if(shop.getStatus()==1)
            {
                long shopid=shop.getShopId();
                Specs specs=product.findSpecsBySpecsId(shopid);

                allPrice = allPrice+shop.getNumber() * (specs.getPrice().intValue());

            }

        }
        order.setoPrice(BigDecimal.valueOf(allPrice));

        order.setStatus(0);
        order.setcTime(date);
        order.setuTime(date);

        m_order.insert(order);
    }


    @Override
    public void directCreateOrder(Product pro)
    {

    }

    @Override
    public void orderPay(m_order order)
    {
        String str=order.getoId();
        ArrayList<Shopdeta> list=shopdeta.selectAll();
        Iterator<Shopdeta> ite=list.iterator();
        while(ite.hasNext())
        {
            Shopdeta shop=ite.next();
            if(shop.getStatus()==1)
            {
                shop.setStatus((new Integer(2).byteValue()));
            }
        }

    }

    @Override
    public void orderCancel(m_order order)
    {

    }

    @Override
    public void orderfinish(m_order order)
    {

    }

    @Override
    public void orderDelete(m_order order)
    {

    }
}
