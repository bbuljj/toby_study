package user.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import user.dao.ConnectionMaker;
import user.dao.CountConnectionMaker;
import user.dao.DConnectionMaker;
import user.dao.UserDao3;

@Configuration
public class CountDaoFactory {
    @Bean
    public UserDao3 userDao3() {
        UserDao3 userDao3 = new UserDao3();
        userDao3.setConnectionMaker(getConnectionMaker());
        return userDao3;
    }

    @Bean
    public ConnectionMaker getConnectionMaker() {
        return new CountConnectionMaker(realConnectionMaker());
    }

    @Bean
    public ConnectionMaker realConnectionMaker() {
        return new DConnectionMaker();
    }
}
