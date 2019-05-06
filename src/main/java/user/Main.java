package user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import user.dao.*;
import user.domain.User;
import user.factory.CountDaoFactory;
import user.factory.DaoFactory;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        UserDao userDao = new OneUserDao();
//
//        User user = new User();
//        user.setId("1");
//        user.setName("test");
//        user.setPassword("test");
//
//        userDao.add(user);
//
//        User user2 = userDao.get(user.getId());
//        System.out.println(user2.toString());

//        UserDao3 userDao3 = new DaoFactory().userDao3();
//        User user = userDao3.get("1");
//        System.out.println(user);

//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DaoFactory.class);
//        UserDao3 userDao3 = applicationContext.getBean("userDao3", UserDao3.class);
//
//        User user = userDao3.get("1");
//        System.out.println(user.toString());
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(
                CountDaoFactory.class
        );

        UserDao3 userDao3 = configApplicationContext.getBean("userDao3", UserDao3.class);

        CountConnectionMaker ccm = configApplicationContext.getBean("getConnectionMaker", CountConnectionMaker.class);
        User user = userDao3.get("1");
        User user2 = userDao3.get("1");
        System.out.println(ccm.getCount());

    }
}
