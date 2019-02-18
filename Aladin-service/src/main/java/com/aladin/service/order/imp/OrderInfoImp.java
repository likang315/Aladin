package com.aladin.service.order.imp;

import com.aladin.dao.order.m_shoppingMapper;
import com.aladin.dao.product.SpecsMapper;
import com.aladin.dao.shopcar.ShopdetaDao;
import com.aladin.pojo.order.m_order;
import com.aladin.pojo.order.m_shopping;
import com.aladin.pojo.product.Specs;
import com.aladin.pojo.shopcar.Shopcar;
import com.aladin.pojo.shopcar.Shopdeta;
import com.aladin.service.order.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

/**
 * @Author: likang
 * @mail: 13571887352@163.com
 * @GitHub：https://github.com/likang315
 * @CreateTime： 2019/2/18 23:34
 */
public class OrderInfoImp implements OrderInfo {

    @Autowired
    ShopdetaDao shopdeta;

    @Autowired
    SpecsMapper product;

    @Autowired
    m_shoppingMapper m_shop;

    @Override
    public void orderInfo(m_order order)
    {

    }

    @Override
    public void insertSpecs(Shopcar shopcar,m_order order)
    {
        List<Shopdeta> list=shopdeta.selectAll(shopcar.getShopId());
        Iterator<Shopdeta> ite=list.iterator();
        while(ite.hasNext())
        {
            Shopdeta shop=ite.next();
            if(shop.getStatus()==1)
            {
                long shopid=shop.getPuduId();
                Specs spe=product.findSpecsBySpecsId(shopid);

                m_shopping  o_shop=new m_shopping();
                Date date=new Date();
                Random random=new Random();
                o_shop.setShId(date.toString()+random.nextInt(5));
                o_shop.setoId(order.getoId());
                o_shop.setShName(spe.getName());
                o_shop.setShDis(spe.getDetail());
                o_shop.setShPrice(spe.getPrice());
                o_shop.setShNumber(shop.getNumber());
                o_shop.setShPic(spe.getPic());
                o_shop.setcTime(date);
                o_shop.setuTime(date);

                o_shop.setShMsg();//表达实现留言功能


                m_shop.insert(o_shop);
            }
        }
    }


    @Override
    public void insertSingleSpecs(Specs spe, int num,m_order order)
    {
        m_shopping  o_shop=new m_shopping();
        Date date=new Date();
        Random random=new Random();
        o_shop.setShId(date.toString()+random.nextInt(5));
        o_shop.setoId(order.getoId());
        o_shop.setShName(spe.getName());
        o_shop.setShDis(spe.getDetail());
        o_shop.setShPrice(spe.getPrice());
        o_shop.setShNumber(num);
        o_shop.setShPic(spe.getPic());
        o_shop.setcTime(date);
        o_shop.setuTime(date);

        o_shop.setShMsg();//表达实现留言功能


        m_shop.insert(o_shop);
    }

    @Override
    public void deleteSpecs(m_order order)
    {
        String str = order.getoId();
        ArrayList<m_shopping> list=m_shop.selectAllshopping(str);
        Iterator ite=list.iterator();
        while(ite.hasNext())
        {
            m_shopping m_sh=(m_shopping) ite.next();
            m_sh.setuTime(new Date());
            m_sh.setStatus(0);
        }
    }

}
