package DaoTest;

import com.aladin.dao.user.UserDao;
import com.aladin.pojo.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-portal-dao.xml"})
public class DaoUserTest {
    @Autowired
    UserDao userDao ;
    @Test
    public void regist(User user , Model model){
        user.setPhone("13444");
        user.setCounId("565567");
        user.setEmail("dfegrh@qew");
        user.setSex("男");
        user.setPwd("247354");
        model.addAttribute(user);
        userDao.registUser(user);


    }
}
