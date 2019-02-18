package test.shopcar;

import com.aladin.dao.shopcar.ShopcarDao;
import com.aladin.dao.shopcar.ShopdetaDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author ：lala
 * @date ：Created in 2019/2/18 21:03
 * @description：${description}
 * @email: 18291929158@163.com
 */
@ContextConfiguration(locations = { "classpath:spring/spring-portal-dao.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class addShopTest {
    @Autowired
    ShopcarDao shopcarDao;
    @Autowired
    ShopdetaDao shopdetaDao;
    @Test
    public void testSelect() {
        System.out.println(shopcarDao.selectShopIdByUserId(1L));
    }
    @Test
    public void testSe(){
        System.out.println(shopdetaDao.selectAll(1L));
    }
}
