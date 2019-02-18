package com.aladin.service.order.imp;

import com.aladin.dao.order.m_orderMapper;
import com.aladin.dao.order.m_shoppingMapper;
import com.aladin.dao.product.SpecsMapper;
import com.aladin.dao.shopcar.ShopdetaDao;
import com.aladin.dao.user.UserDao;
import com.aladin.pojo.order.m_order;
import com.aladin.pojo.product.Specs;
import com.aladin.pojo.shopcar.Shopcar;
import com.aladin.pojo.shopcar.Shopdeta;
import com.aladin.pojo.user.User;
import com.aladin.service.order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @Author: likang
 * @mail: 13571887352@163.com
 * @GitHub：https://github.com/likang315
 * @CreateTime： 2019/2/17 23:13
 */
@Service
public class OrderImp implements Order {
    private OrderInfoImp  oInImp;

    @Autowired
    UserDao userdao;

    @Autowired
    ShopdetaDao shopdeta;

    @Autowired
    SpecsMapper product;

    @Autowired
    m_orderMapper m_order;

    @Autowired
    m_shoppingMapper m_shop;


    @Override
    public void shoppingInfo(Shopcar sh)
    {
        long shopcarid = sh.getShopId();
        List<Shopdeta> list=shopdeta.selectAll(shopcarid);
//        Iterator<Shopdeta> ite=list.iterator();
//        while(ite.hasNext())
//        {
//            Shopdeta shop=ite.next();
//            if(shop.getStatus()==1)
//            {
//                long shopid=shop.getPuduId();
//                Specs specs=product.findSpecsBySpecsId(shopid);
//
//            }
//
//        }
    }

    @Override
    public void createOrder(Shopcar sh)
    {
        int allPrice=0;
        Long userid=sh.getUserId();
        Date date=new Date();
        Random random=new Random();
        m_order order=new m_order();

        order.setoId( date.toString()+random.nextInt(5));
        order.setoTime(date);
        order.setuId(userid.toString());

        //获取订单总价（bigdecimal）
        long shopcarid = sh.getShopId();
        List<Shopdeta> list=shopdeta.selectAll(shopcarid);
        Iterator<Shopdeta> ite=list.iterator();
        while(ite.hasNext())
        {
            Shopdeta shop=ite.next();
            if(shop.getStatus()==1)
            {
                long shopid=shop.getPuduId();
                Specs specs=product.findSpecsBySpecsId(shopid);

                allPrice = allPrice+shop.getNumber() * (specs.getPrice().intValue());
            }

        }
        order.setoPrice(BigDecimal.valueOf(allPrice));
        order.setoStatus(1);

        order.setcTime(date);
        order.setuTime(date);

        oInImp=new OrderInfoImp();
        oInImp.insertSpecs(sh,order);

        m_order.insert(order);
    }


    @Override
    public void directCreateOrder(Specs specs,int num,User user)
    {
        Long uid=user.getUsId();
        m_order order=new m_order();
        Date date=new Date();
        Random random=new Random();

        order.setoId(date.toString()+random.nextInt(5));
        order.setuId(uid.toString());
        order.setoTime(date);
        order.setoPrice(BigDecimal.valueOf(specs.getPrice().longValue()*num));
        order.setoStatus(2);

        order.setcTime(date);
        order.setuTime(date);


        oInImp.insertSingleSpecs(specs,num,order);

        m_order.insert(order);
    }

    @Override
    public void orderPay(m_order order)
    {
        String str=order.getoId();
        order.setoStatus(2);
        order.setuTime(new Date());
        m_order.updateByPrimaryKey(order);
    }

    @Override
    public void orderCancel(m_order order)
    {
       orderDelete(order);
    }

    @Override
    public void orderfinish(m_order order)
    {
        order.setoStatus(3);
        order.setuTime(new Date());
        m_order.updateByPrimaryKey(order);
    }

    @Override
    public void orderDelete(m_order order)
    {
        order.setStatus(0);
        order.setuTime(new Date());
        oInImp.deleteSpecs(order);

        m_order.updateByPrimaryKey(order);
    }



}
